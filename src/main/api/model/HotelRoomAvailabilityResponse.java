
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
    "HotelRoomAvailabilityResponse"
})
public class HotelRoomAvailabilityResponse {

    @JsonProperty("HotelRoomAvailabilityResponse")
    private HotelRoomAvailabilityResponse_ hotelRoomAvailabilityResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The hotelRoomAvailabilityResponse
     */
    @JsonProperty("HotelRoomAvailabilityResponse")
    public HotelRoomAvailabilityResponse_ getHotelRoomAvailabilityResponse() {
        return hotelRoomAvailabilityResponse;
    }

    /**
     * 
     * @param hotelRoomAvailabilityResponse
     *     The HotelRoomAvailabilityResponse
     */
    @JsonProperty("HotelRoomAvailabilityResponse")
    public void setHotelRoomAvailabilityResponse(HotelRoomAvailabilityResponse_ hotelRoomAvailabilityResponse) {
        this.hotelRoomAvailabilityResponse = hotelRoomAvailabilityResponse;
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
