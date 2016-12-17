package main.api.model;

public class HotelRoomAvailabilityRequest extends BaseRequest {
	
	private String hotelId;
    private String arrivalDate;
    private String departureDate;
    private String room1;
    private String room2;
    private String room3;
    private String room4;
    private String rateCode;
    private String roomTypeCode;
   
	public String getRoom2() {
		return room2;
	}
	public String getRoom1() {
		return room1;
	}
	public void setRoom2(String room2) {
		this.room2 = room2;
	}
	public String getRoom3() {
		return room3;
	}
	public void setRoom3(String room3) {
		this.room3 = room3;
	}
	public String getRoom4() {
		return room4;
	}
	public void setRoom4(String room4) {
		this.room4 = room4;
	}
	public void setRoom1(String room1) {
		this.room1 = room1;
	}
	
	public String getRateCode() {
		return rateCode;
	}
	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}
	public String getRoomTypeCode() {
		return roomTypeCode;
	}
	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}
	public HotelRoomAvailabilityRequest() {
		super();
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
}
