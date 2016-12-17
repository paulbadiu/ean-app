package main.api.service;

import org.springframework.stereotype.Service;
import main.api.model.HotelRoomAvailabilityRequest;
import main.api.model.HotelRoomAvailabilityResponse;


@Service
public class AvailabilityService extends CancelService {

    private final String url
            = "http://%s/ean-services/rs/hotel/v3/avail?cid=%s&minorRev=%s&apiKey=%s&sig=%s&hotelId=%s&arrivalDate=%s&departureDate=%s&room1=%s&_type=json&rateCode=%s&roomTypeCode=%s";

    private String createServiceUrl(final HotelRoomAvailabilityRequest request) {
        String sig = generateSig(apiKey, sharedSecret);
        request.setSig(sig);
        String finalURL = String.format(url, generalEndpoint, cid, minorRev, apiKey, sig, request.getHotelId(),
                request.getArrivalDate(), request.getDepartureDate(), request.getRoom1(), request.getRateCode(), request.getRoomTypeCode());
        if (request.getRoom2() != null) {
            String room2 = request.getRoom2();
            if (request.getRoom2() != null && request.getRoom3() != null) {
                String room3 = request.getRoom3();
                if (request.getRoom3() != null & request.getRoom4() != null) {
                    String room4 = request.getRoom4();
                    finalURL = finalURL.concat("&room4=" + room4);
                }
                finalURL = finalURL.concat("&room3=" + room3);
            }
            // System.out.println(room2);
            finalURL = finalURL.concat("&room2=" + room2);
            // System.out.println(finalURL);
            return finalURL;
        }

        System.out.println(finalURL);
        return finalURL;
    }

    public HotelRoomAvailabilityResponse getRoomAvailability(HotelRoomAvailabilityRequest request) {
        String url = createServiceUrl(request);
        return restTemplate.getForObject(url, HotelRoomAvailabilityResponse.class);
    }

}
