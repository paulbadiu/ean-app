
package main.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "NightlyRate"
})
public class NightlyRatesPerRoom {

    @JsonProperty("@size")
    private String Size;
    @JsonProperty("NightlyRate")
    private List<main.api.model.NightlyRate> NightlyRate = new ArrayList<main.api.model.NightlyRate>();
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
     *     The NightlyRate
     */
    @JsonProperty("NightlyRate")
    public List<main.api.model.NightlyRate> getNightlyRate() {
        return NightlyRate;
    }

    /**
     * 
     * @param NightlyRate
     *     The NightlyRate
     */
    @JsonProperty("NightlyRate")
    public void setNightlyRate(List<main.api.model.NightlyRate> NightlyRate) {
        this.NightlyRate = NightlyRate;
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
