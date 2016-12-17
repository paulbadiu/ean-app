package main.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import main.api.model.HotelListRequest;
import main.api.model.HotelListResponse;
import main.api.service.HotelListService;

@Controller
public class ListController {
	
	@Autowired
    private HotelListService hotelListService;

	@ResponseBody
	@RequestMapping(value="/list", method=RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HotelListResponse getGet(@RequestBody HotelListRequest request){
        return hotelListService.makeHotelListRequest(request);
	}
}
