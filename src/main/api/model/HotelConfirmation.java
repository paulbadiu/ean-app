
package main.api.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "confirmationNumber",
    "RateInfos",
    "numberOfAdults",
    "numberOfChildren",
    "rateDescription",
    "roomDescription",
    "status",
    "ReservationGuest",
    "Hotel",
    "nights",
    "ValueAdds"
})
public class HotelConfirmation {

    @JsonProperty("confirmationNumber")
    private Integer confirmationNumber;
    @JsonProperty("RateInfos")
    private main.api.model.RateInfos RateInfos;
    @JsonProperty("numberOfAdults")
    private Integer numberOfAdults;
    @JsonProperty("numberOfChildren")
    private Integer numberOfChildren;
    @JsonProperty("rateDescription")
    private String rateDescription;
    @JsonProperty("roomDescription")
    private String roomDescription;
    @JsonProperty("status")
    private String status;
    @JsonProperty("ReservationGuest")
    private main.api.model.ReservationGuest ReservationGuest;
    @JsonProperty("Hotel")
    private main.api.model.Hotel Hotel;
    @JsonProperty("nights")
    private Integer nights;
    @JsonProperty("ValueAdds")
    private main.api.model.ValueAdds ValueAdds;
  
    /**
     * 
     * @return
     *     The confirmationNumber
     */
    @JsonProperty("confirmationNumber")
    public Integer getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * 
     * @param confirmationNumber
     *     The confirmationNumber
     */
    @JsonProperty("confirmationNumber")
    public void setConfirmationNumber(Integer confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    /**
     * 
     * @return
     *     The RateInfos
     */
    @JsonProperty("RateInfos")
    public main.api.model.RateInfos getRateInfos() {
        return RateInfos;
    }

    /**
     * 
     * @param RateInfos
     *     The RateInfos
     */
    @JsonProperty("RateInfos")
    public void setRateInfos(main.api.model.RateInfos RateInfos) {
        this.RateInfos = RateInfos;
    }

    /**
     * 
     * @return
     *     The numberOfAdults
     */
    @JsonProperty("numberOfAdults")
    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * 
     * @param numberOfAdults
     *     The numberOfAdults
     */
    @JsonProperty("numberOfAdults")
    public void setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    /**
     * 
     * @return
     *     The numberOfChildren
     */
    @JsonProperty("numberOfChildren")
    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * 
     * @param numberOfChildren
     *     The numberOfChildren
     */
    @JsonProperty("numberOfChildren")
    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }


    /**
     * 
     * @return
     *     The rateDescription
     */
    @JsonProperty("rateDescription")
    public String getRateDescription() {
        return rateDescription;
    }

    /**
     * 
     * @param rateDescription
     *     The rateDescription
     */
    @JsonProperty("rateDescription")
    public void setRateDescription(String rateDescription) {
        this.rateDescription = rateDescription;
    }

    /**
     * 
     * @return
     *     The roomDescription
     */
    @JsonProperty("roomDescription")
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * 
     * @param roomDescription
     *     The roomDescription
     */
    @JsonProperty("roomDescription")
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * 
     * @return
     *     The ReservationGuest
     */
    @JsonProperty("ReservationGuest")
    public main.api.model.ReservationGuest getReservationGuest() {
        return ReservationGuest;
    }

    /**
     * 
     * @param ReservationGuest
     *     The ReservationGuest
     */
    @JsonProperty("ReservationGuest")
    public void setReservationGuest(main.api.model.ReservationGuest ReservationGuest) {
        this.ReservationGuest = ReservationGuest;
    }

    /**
     * 
     * @return
     *     The Hotel
     */
    @JsonProperty("Hotel")
    public main.api.model.Hotel getHotel() {
        return Hotel;
    }

    /**
     * 
     * @param Hotel
     *     The Hotel
     */
    @JsonProperty("Hotel")
    public void setHotel(main.api.model.Hotel Hotel) {
        this.Hotel = Hotel;
    }

    /**
     * 
     * @return
     *     The nights
     */
    @JsonProperty("nights")
    public Integer getNights() {
        return nights;
    }

    /**
     * 
     * @param nights
     *     The nights
     */
    @JsonProperty("nights")
    public void setNights(Integer nights) {
        this.nights = nights;
    }

    /**
     * 
     * @return
     *     The ValueAdds
     */
    @JsonProperty("ValueAdds")
    public main.api.model.ValueAdds getValueAdds() {
        return ValueAdds;
    }

    /**
     * 
     * @param ValueAdds
     *     The ValueAdds
     */
    @JsonProperty("ValueAdds")
    public void setValueAdds(main.api.model.ValueAdds ValueAdds) {
        this.ValueAdds = ValueAdds;
    }

}
