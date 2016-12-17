package main.api.model;

public class HotelRoomCancellationRequest extends BaseRequest{

	protected Long itineraryId;
    protected String email;
    protected String confirmationNumber;
    
	public HotelRoomCancellationRequest() {
		super();
	}
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
	public String getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
    
}
