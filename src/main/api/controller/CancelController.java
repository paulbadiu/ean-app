package main.api.controller;

import main.api.model.HotelRoomCancellationRequest;
import main.api.model.HotelRoomCancellationResponse;
import main.api.service.CancelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CancelController {

	@Autowired
	private CancelService cancelService;
	
	@RequestMapping(value="/cancel", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public HotelRoomCancellationResponse doPost(@RequestBody HotelRoomCancellationRequest request){
		return cancelService.cancelRoom(request);
	}
}