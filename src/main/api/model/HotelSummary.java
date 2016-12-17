
package main.api.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "hotelId",
    "name",
    "address1",
    "city",
    "hotelRating",
    "hotelRatingDisplay",
    "tripAdvisorRating",
    "tripAdvisorReviewCount",
    "tripAdvisorRatingUrl",
    "shortDescription",
    "thumbNailUrl",
    "RoomRateDetailsList"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class HotelSummary {
    @JsonProperty("hotelId")
    private Integer hotelId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("city")
    private String city;
    @JsonProperty("hotelRating")
    private Integer hotelRating;
    @JsonProperty("hotelRatingDisplay")
    private String hotelRatingDisplay;
    @JsonProperty("tripAdvisorRating")
    private Integer tripAdvisorRating;
    @JsonProperty("tripAdvisorReviewCount")
    private Integer tripAdvisorReviewCount;
    @JsonProperty("tripAdvisorRatingUrl")
    private String tripAdvisorRatingUrl;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("thumbNailUrl")
    private String thumbNailUrl;
 
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
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The address1
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     * @param address1
     *     The address1
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * 
     * @return
     *     The hotelRating
     */
    @JsonProperty("hotelRating")
    public Integer getHotelRating() {
        return hotelRating;
    }

    /**
     * 
     * @param hotelRating
     *     The hotelRating
     */
    @JsonProperty("hotelRating")
    public void setHotelRating(Integer hotelRating) {
        this.hotelRating = hotelRating;
    }

    /**
     * 
     * @return
     *     The hotelRatingDisplay
     */
    @JsonProperty("hotelRatingDisplay")
    public String getHotelRatingDisplay() {
        return hotelRatingDisplay;
    }

    /**
     * 
     * @param hotelRatingDisplay
     *     The hotelRatingDisplay
     */
    @JsonProperty("hotelRatingDisplay")
    public void setHotelRatingDisplay(String hotelRatingDisplay) {
        this.hotelRatingDisplay = hotelRatingDisplay;
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
     *     The shortDescription
     */
    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * 
     * @param shortDescription
     *     The shortDescription
     */
    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

  /**
     * 
     * @return
     *     The thumbNailUrl
     */
    @JsonProperty("thumbNailUrl")
    public String getThumbNailUrl() {
        return thumbNailUrl;
    }

    /**
     * 
     * @param thumbNailUrl
     *     The thumbNailUrl
     */
    @JsonProperty("thumbNailUrl")
    public void setThumbNailUrl(String thumbNailUrl) {
        this.thumbNailUrl = thumbNailUrl;
    }

}
