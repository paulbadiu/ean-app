package main.api.service;

import main.api.model.HotelItineraryRequest;
import main.api.model.HotelItineraryResponse;
import org.springframework.stereotype.Service;

@Service
public class ItineraryService extends CancelService {

	private final String url
     = "http://%s/ean-services/rs/hotel/v3/itin?cid=%s&minorRev=%s&apiKey=%s&sig=%s&itineraryId=%s&email=%s&_type=json";
	
	private String createServiceUrl(final HotelItineraryRequest request) {
        String sig = generateSig(apiKey, sharedSecret);
        request.setSig(sig);
        return String.format(url, generalEndpoint, cid, minorRev, apiKey, sig, request.getItineraryId(),
            request.getEmail());
    }
	
	public HotelItineraryResponse getItinerary(HotelItineraryRequest request) {
	
		String url = createServiceUrl(request);
		HotelItineraryResponse response = restTemplate.getForObject(url, HotelItineraryResponse.class);
		return response;
	}
}

