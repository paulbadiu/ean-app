
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
    "HotelItineraryResponse"
})
public class HotelItineraryResponse {

    @JsonProperty("HotelItineraryResponse")
    private HotelItineraryResponse_ HotelItineraryResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The HotelItineraryResponse
     */
    @JsonProperty("HotelItineraryResponse")
    public HotelItineraryResponse_ getHotelItineraryResponse() {
        return HotelItineraryResponse;
    }

    /**
     * 
     * @param HotelItineraryResponse
     *     The HotelItineraryResponse
     */
    @JsonProperty("HotelItineraryResponse")
    public void setHotelItineraryResponse(HotelItineraryResponse_ HotelItineraryResponse) {
        this.HotelItineraryResponse = HotelItineraryResponse;
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
