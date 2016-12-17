
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
    "RateInfo"
})
public class RateInfos {

    @JsonProperty("@size")
    private String Size;
    @JsonProperty("RateInfo")
    private main.api.model.RateInfo RateInfo;
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
     *     The RateInfo
     */
    @JsonProperty("RateInfo")
    public main.api.model.RateInfo getRateInfo() {
        return RateInfo;
    }

    /**
     * 
     * @param RateInfo
     *     The RateInfo
     */
    @JsonProperty("RateInfo")
    public void setRateInfo(main.api.model.RateInfo RateInfo) {
        this.RateInfo = RateInfo;
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
