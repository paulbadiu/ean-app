
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
    "customerSessionId",
    "cancellationNumber"
})
public class HotelRoomCancellationResponse_ {

    @JsonProperty("customerSessionId")
    private String customerSessionId;
    @JsonProperty("cancellationNumber")
    private String cancellationNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The cancellationNumber
     */
    @JsonProperty("cancellationNumber")
    public String getCancellationNumber() {
        return cancellationNumber;
    }

    /**
     * 
     * @param cancellationNumber
     *     The cancellationNumber
     */
    @JsonProperty("cancellationNumber")
    public void setCancellationNumber(String cancellationNumber) {
        this.cancellationNumber = cancellationNumber;
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
