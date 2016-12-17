package main.api.controller;

import main.api.model.HotelRoomAvailabilityRequest;
import main.api.model.HotelRoomAvailabilityResponse;
import main.api.service.AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AvailController {
	
	@Autowired
    AvailabilityService avail;
	
	@RequestMapping(value="/avail", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public HotelRoomAvailabilityResponse doPost(@RequestBody HotelRoomAvailabilityRequest request){
		return avail.getRoomAvailability(request);
	}
}
