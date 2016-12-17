package main.api.service;

import main.api.model.HotelListRequest;
import main.api.model.HotelListResponse;
import org.springframework.stereotype.Service;

@Service
public class HotelListService extends CancelService {

    private static final String URL_PATTERN = "http://%s/ean-services/rs/hotel/v3/list?cid=%s&minorRev=%s&apiKey=%s" +
                                              "&sig=%s&latitude=%s&longitude=%s&arrivalDate=%s&departureDate=%s&room1=%s&_type=json";

    private String createServiceUrl(final HotelListRequest request) {
        String sig = generateSig(apiKey, sharedSecret);
        request.setSig(sig);
        String finalURL = String.format(URL_PATTERN, generalEndpoint, cid, minorRev, apiKey, sig, request.getLatitude(),
                request.getLongitude(), request.getArrivalDate(), request.getDepartureDate(), request.getRoom1());

        if (request.getRoom2() != null) {
            String room2 = request.getRoom2();
            finalURL = finalURL.concat("&room2=" + room2);
            System.out.println(finalURL);
            return finalURL;
        }
        return finalURL;
    }

    public HotelListResponse makeHotelListRequest(HotelListRequest request) {
        String url = createServiceUrl(request);
        return restTemplate.getForObject(url, HotelListResponse.class);
    }
}
