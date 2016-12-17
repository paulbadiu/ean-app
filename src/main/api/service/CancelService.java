package main.api.service;

import org.springframework.stereotype.Service;
import main.api.model.HotelRoomCancellationRequest;
import main.api.model.HotelRoomCancellationResponse;

@Service
public class CancelService extends BaseService {
	
	private final String url = "http://%s/ean-services/rs/hotel/v3/cancel?cid=%s&minorRev=%s&apiKey=%s&sig=%s&itineraryId=%s&email=%s&_type=json";
	
	private String createServiceUrl(final HotelRoomCancellationRequest request) {
       String sig = generateSig(apiKey, sharedSecret);
       request.setSig(sig);
       return String.format(url, generalEndpoint, cid, minorRev, apiKey, sig, request.getItineraryId(),
           request.getEmail());
   }		
	public HotelRoomCancellationResponse cancelRoom(HotelRoomCancellationRequest request) {
		
		String url = createServiceUrl(request);
		HotelRoomCancellationResponse response = restTemplate.getForObject(url, HotelRoomCancellationResponse.class);
		return response;
	}

}
