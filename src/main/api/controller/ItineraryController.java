package main.api.controller;

import main.api.model.HotelItineraryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import main.api.model.HotelItineraryResponse;
import main.api.service.ItineraryService;

@Controller
public class ItineraryController {
	
	@Autowired
	private ItineraryService itineraryService;
	
	@RequestMapping(value="/itin", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public HotelItineraryResponse doPost(@RequestBody HotelItineraryRequest request){
		return itineraryService.getItinerary(request);
	}

}
