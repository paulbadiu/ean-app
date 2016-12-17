
package main.api.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "@size",
    "customerSessionId",
    "Itinerary"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class HotelItineraryResponse_ {

    @JsonProperty("@size")
    private String Size;
    @JsonProperty("customerSessionId")
    private String customerSessionId;
    @JsonProperty("Itinerary")
    private main.api.model.Itinerary Itinerary;
    /**
     * 
     * @return
     *     The Size
     */
    @JsonProperty("@size")
    public String getSize() {
        return Size;
    }

    /**
     * 
     * @param Size
     *     The @size
     */
    @JsonProperty("@size")
    public void setSize(String Size) {
        this.Size = Size;
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
     *     The Itinerary
     */
    @JsonProperty("Itinerary")
    public main.api.model.Itinerary getItinerary() {
        return Itinerary;
    }

    /**
     * 
     * @param Itinerary
     *     The Itinerary
     */
    @JsonProperty("Itinerary")
    public void setItinerary(main.api.model.Itinerary Itinerary) {
        this.Itinerary = Itinerary;
    }
}
