package main.api.model;

public class HotelItineraryRequest extends BaseRequest {
	
	protected Long itineraryId;
    protected String email;
  
    public HotelItineraryRequest() {
		super();
	}
    
	//getters & setters
	public Long getItineraryId() {
		return itineraryId;
	}
	public void setItineraryId(Long itineraryId) {
		this.itineraryId = itineraryId;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
