
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
    "Surcharge"
})
public class Surcharges {

    @JsonProperty("@size")
    private String Size;
    @JsonProperty("Surcharge")
    private main.api.model.Surcharge Surcharge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The Surcharge
     */
    @JsonProperty("Surcharge")
    public main.api.model.Surcharge getSurcharge() {
        return Surcharge;
    }

    /**
     * 
     * @param Surcharge
     *     The Surcharge
     */
    @JsonProperty("Surcharge")
    public void setSurcharge(main.api.model.Surcharge Surcharge) {
        this.Surcharge = Surcharge;
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
