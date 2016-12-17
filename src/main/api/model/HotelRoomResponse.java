
package main.api.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "rateCode",
    "roomTypeCode",
    "rateDescription",
    "roomTypeDescription",
    "BedTypes",
    "smokingPreferences",
    "rateOccupancyPerRoom",
    "quotedOccupancy",
    "minGuestAge",
    "RateInfos",
    "ValueAdds",
})

@JsonIgnoreProperties(ignoreUnknown=true)
public class HotelRoomResponse {

    @JsonProperty("rateCode")
    private Integer rateCode;
    @JsonProperty("roomTypeCode")
    private Integer roomTypeCode;
    @JsonProperty("rateDescription")
    private String rateDescription;
    @JsonProperty("roomTypeDescription")
    private String roomTypeDescription;
    @JsonProperty("smokingPreferences")
    private String smokingPreferences;
    @JsonProperty("rateOccupancyPerRoom")
    private Integer rateOccupancyPerRoom;
    @JsonProperty("quotedOccupancy")
    private Integer quotedOccupancy;
    @JsonProperty("minGuestAge")
    private Integer minGuestAge;
    @JsonProperty("RateInfos")
    private main.api.model.RateInfos RateInfos;
    @JsonProperty("ValueAdds")
    private main.api.model.ValueAdds ValueAdds;
    /**
     * 
     * @return
     *     The rateCode
     */
    @JsonProperty("rateCode")
    public Integer getRateCode() {
        return rateCode;
    }

    /**
     * 
     * @param rateCode
     *     The rateCode
     */
    @JsonProperty("rateCode")
    public void setRateCode(Integer rateCode) {
        this.rateCode = rateCode;
    }

    /**
     * 
     * @return
     *     The roomTypeCode
     */
    @JsonProperty("roomTypeCode")
    public Integer getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * 
     * @param roomTypeCode
     *     The roomTypeCode
     */
    @JsonProperty("roomTypeCode")
    public void setRoomTypeCode(Integer roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
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
     *     The roomTypeDescription
     */
    @JsonProperty("roomTypeDescription")
    public String getRoomTypeDescription() {
        return roomTypeDescription;
    }

    /**
     * 
     * @param roomTypeDescription
     *     The roomTypeDescription
     */
    @JsonProperty("roomTypeDescription")
    public void setRoomTypeDescription(String roomTypeDescription) {
        this.roomTypeDescription = roomTypeDescription;
    }


    /**
     * 
     * @return
     *     The smokingPreferences
     */
    @JsonProperty("smokingPreferences")
    public String getSmokingPreferences() {
        return smokingPreferences;
    }

    /**
     * 
     * @param smokingPreferences
     *     The smokingPreferences
     */
    @JsonProperty("smokingPreferences")
    public void setSmokingPreferences(String smokingPreferences) {
        this.smokingPreferences = smokingPreferences;
    }

    /**
     * 
     * @return
     *     The rateOccupancyPerRoom
     */
    @JsonProperty("rateOccupancyPerRoom")
    public Integer getRateOccupancyPerRoom() {
        return rateOccupancyPerRoom;
    }

    /**
     * 
     * @param rateOccupancyPerRoom
     *     The rateOccupancyPerRoom
     */
    @JsonProperty("rateOccupancyPerRoom")
    public void setRateOccupancyPerRoom(Integer rateOccupancyPerRoom) {
        this.rateOccupancyPerRoom = rateOccupancyPerRoom;
    }

    /**
     * 
     * @return
     *     The quotedOccupancy
     */
    @JsonProperty("quotedOccupancy")
    public Integer getQuotedOccupancy() {
        return quotedOccupancy;
    }

    /**
     * 
     * @param quotedOccupancy
     *     The quotedOccupancy
     */
    @JsonProperty("quotedOccupancy")
    public void setQuotedOccupancy(Integer quotedOccupancy) {
        this.quotedOccupancy = quotedOccupancy;
    }

    /**
     * 
     * @return
     *     The minGuestAge
     */
    @JsonProperty("minGuestAge")
    public Integer getMinGuestAge() {
        return minGuestAge;
    }

    /**
     * 
     * @param minGuestAge
     *     The minGuestAge
     */
    @JsonProperty("minGuestAge")
    public void setMinGuestAge(Integer minGuestAge) {
        this.minGuestAge = minGuestAge;
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
