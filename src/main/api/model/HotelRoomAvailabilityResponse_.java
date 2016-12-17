
package main.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "@size",
    "customerSessionId",
    "hotelId",
    "arrivalDate",
    "departureDate",
    "hotelName",
    "hotelAddress",
    "hotelCity",
    "hotelStateProvince",
    "hotelCountry",
    "numberOfRoomsRequested",
    "checkInInstructions",
    "tripAdvisorRating",
    "tripAdvisorReviewCount",
    "tripAdvisorRatingUrl",
    "HotelRoomResponse"
})
public class HotelRoomAvailabilityResponse_ {

    @JsonProperty("@size")
    private String size;
    @JsonProperty("customerSessionId")
    private String customerSessionId;
    @JsonProperty("hotelId")
    private Integer hotelId;
    @JsonProperty("arrivalDate")
    private String arrivalDate;
    @JsonProperty("departureDate")
    private String departureDate;
    @JsonProperty("hotelName")
    private String hotelName;
    @JsonProperty("hotelAddress")
    private String hotelAddress;
    @JsonProperty("hotelCity")
    private String hotelCity;
    @JsonProperty("hotelStateProvince")
    private String hotelStateProvince;
    @JsonProperty("hotelCountry")
    private String hotelCountry;
    @JsonProperty("numberOfRoomsRequested")
    private Integer numberOfRoomsRequested;
    @JsonProperty("checkInInstructions")
    private String checkInInstructions;
    @JsonProperty("tripAdvisorRating")
    private Integer tripAdvisorRating;
    @JsonProperty("tripAdvisorReviewCount")
    private Integer tripAdvisorReviewCount;
    @JsonProperty("tripAdvisorRatingUrl")
    private String tripAdvisorRatingUrl;
    @JsonProperty("HotelRoomResponse")
    private HotelRoomResponse hotelRoomResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The size
     */
    @JsonProperty("@size")
    public String getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The @size
     */
    @JsonProperty("@size")
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The customerSessionId
     */
    @JsonProperty("customerSessionId")
    public String getCustomerSessionId() {
        return customerSessionId;
    }

    /**
     * 
     * @param customerSessionId
     *     The customerSessionId
     */
    @JsonProperty("customerSessionId")
    public void setCustomerSessionId(String customerSessionId) {
        this.customerSessionId = customerSessionId;
    }

    /**
     * 
     * @return
     *     The hotelId
     */
    @JsonProperty("hotelId")
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * 
     * @param hotelId
     *     The hotelId
     */
    @JsonProperty("hotelId")
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 
     * @return
     *     The arrivalDate
     */
    @JsonProperty("arrivalDate")
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * 
     * @param arrivalDate
     *     The arrivalDate
     */
    @JsonProperty("arrivalDate")
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * 
     * @return
     *     The departureDate
     */
    @JsonProperty("departureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * 
     * @param departureDate
     *     The departureDate
     */
    @JsonProperty("departureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * 
     * @return
     *     The hotelName
     */
    @JsonProperty("hotelName")
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 
     * @param hotelName
     *     The hotelName
     */
    @JsonProperty("hotelName")
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * 
     * @return
     *     The hotelAddress
     */
    @JsonProperty("hotelAddress")
    public String getHotelAddress() {
        return hotelAddress;
    }

    /**
     * 
     * @param hotelAddress
     *     The hotelAddress
     */
    @JsonProperty("hotelAddress")
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    /**
     * 
     * @return
     *     The hotelCity
     */
    @JsonProperty("hotelCity")
    public String getHotelCity() {
        return hotelCity;
    }

    /**
     * 
     * @param hotelCity
     *     The hotelCity
     */
    @JsonProperty("hotelCity")
    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    /**
     * 
     * @return
     *     The hotelStateProvince
     */
    @JsonProperty("hotelStateProvince")
    public String getHotelStateProvince() {
        return hotelStateProvince;
    }

    /**
     * 
     * @param hotelStateProvince
     *     The hotelStateProvince
     */
    @JsonProperty("hotelStateProvince")
    public void setHotelStateProvince(String hotelStateProvince) {
        this.hotelStateProvince = hotelStateProvince;
    }

    /**
     * 
     * @return
     *     The hotelCountry
     */
    @JsonProperty("hotelCountry")
    public String getHotelCountry() {
        return hotelCountry;
    }

    /**
     * 
     * @param hotelCountry
     *     The hotelCountry
     */
    @JsonProperty("hotelCountry")
    public void setHotelCountry(String hotelCountry) {
        this.hotelCountry = hotelCountry;
    }

    /**
     * 
     * @return
     *     The numberOfRoomsRequested
     */
    @JsonProperty("numberOfRoomsRequested")
    public Integer getNumberOfRoomsRequested() {
        return numberOfRoomsRequested;
    }

    /**
     * 
     * @param numberOfRoomsRequested
     *     The numberOfRoomsRequested
     */
    @JsonProperty("numberOfRoomsRequested")
    public void setNumberOfRoomsRequested(Integer numberOfRoomsRequested) {
        this.numberOfRoomsRequested = numberOfRoomsRequested;
    }

    /**
     * 
     * @return
     *     The checkInInstructions
     */
    @JsonProperty("checkInInstructions")
    public String getCheckInInstructions() {
        return checkInInstructions;
    }

    /**
     * 
     * @param checkInInstructions
     *     The checkInInstructions
     */
    @JsonProperty("checkInInstructions")
    public void setCheckInInstructions(String checkInInstructions) {
        this.checkInInstructions = checkInInstructions;
    }

    /**
     * 
     * @return
     *     The tripAdvisorRating
     */
    @JsonProperty("tripAdvisorRating")
    public Integer getTripAdvisorRating() {
        return tripAdvisorRating;
    }

    /**
     * 
     * @param tripAdvisorRating
     *     The tripAdvisorRating
     */
    @JsonProperty("tripAdvisorRating")
    public void setTripAdvisorRating(Integer tripAdvisorRating) {
        this.tripAdvisorRating = tripAdvisorRating;
    }

    /**
     * 
     * @return
     *     The tripAdvisorReviewCount
     */
    @JsonProperty("tripAdvisorReviewCount")
    public Integer getTripAdvisorReviewCount() {
        return tripAdvisorReviewCount;
    }

    /**
     * 
     * @param tripAdvisorReviewCount
     *     The tripAdvisorReviewCount
     */
    @JsonProperty("tripAdvisorReviewCount")
    public void setTripAdvisorReviewCount(Integer tripAdvisorReviewCount) {
        this.tripAdvisorReviewCount = tripAdvisorReviewCount;
    }

    /**
     * 
     * @return
     *     The tripAdvisorRatingUrl
     */
    @JsonProperty("tripAdvisorRatingUrl")
    public String getTripAdvisorRatingUrl() {
        return tripAdvisorRatingUrl;
    }

    /**
     * 
     * @param tripAdvisorRatingUrl
     *     The tripAdvisorRatingUrl
     */
    @JsonProperty("tripAdvisorRatingUrl")
    public void setTripAdvisorRatingUrl(String tripAdvisorRatingUrl) {
        this.tripAdvisorRatingUrl = tripAdvisorRatingUrl;
    }

    /**
     * 
     * @return
     *     The hotelRoomResponse
     */
    @JsonProperty("HotelRoomResponse")
    public HotelRoomResponse getHotelRoomResponse() {
        return hotelRoomResponse;
    }

    /**
     * 
     * @param hotelRoomResponse
     *     The HotelRoomResponse
     */
    @JsonProperty("HotelRoomResponse")
    public void setHotelRoomResponse(HotelRoomResponse hotelRoomResponse) {
        this.hotelRoomResponse = hotelRoomResponse;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
