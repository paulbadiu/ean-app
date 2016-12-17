
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
    "@baseRate",
    "@rate",
    "@promo"
})
public class NightlyRate {

    @JsonProperty("@baseRate")
    private String BaseRate;
    @JsonProperty("@rate")
    private String Rate;
    @JsonProperty("@promo")
    private String Promo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The BaseRate
     */
    @JsonProperty("@baseRate")
    public String getBaseRate() {
        return BaseRate;
    }

    /**
     * 
     * @param BaseRate
     *     The @baseRate
     */
    @JsonProperty("@baseRate")
    public void setBaseRate(String BaseRate) {
        this.BaseRate = BaseRate;
    }

    /**
     * 
     * @return
     *     The Rate
     */
    @JsonProperty("@rate")
    public String getRate() {
        return Rate;
    }

    /**
     * 
     * @param Rate
     *     The @rate
     */
    @JsonProperty("@rate")
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * 
     * @return
     *     The Promo
     */
    @JsonProperty("@promo")
    public String getPromo() {
        return Promo;
    }

    /**
     * 
     * @param Promo
     *     The @promo
     */
    @JsonProperty("@promo")
    public void setPromo(String Promo) {
        this.Promo = Promo;
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
