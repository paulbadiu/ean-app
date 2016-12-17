
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
    "HotelRoomCancellationResponse"
})
public class HotelRoomCancellationResponse {

    @JsonProperty("HotelRoomCancellationResponse")
    private HotelRoomCancellationResponse_ hotelRoomCancellationResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The hotelRoomCancellationResponse
     */
    @JsonProperty("HotelRoomCancellationResponse")
    public HotelRoomCancellationResponse_ getHotelRoomCancellationResponse() {
        return hotelRoomCancellationResponse;
    }

    /**
     * 
     * @param hotelRoomCancellationResponse
     *     The HotelRoomCancellationResponse
     */
    @JsonProperty("HotelRoomCancellationResponse")
    public void setHotelRoomCancellationResponse(HotelRoomCancellationResponse_ hotelRoomCancellationResponse) {
        this.hotelRoomCancellationResponse = hotelRoomCancellationResponse;
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
