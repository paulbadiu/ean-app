
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
    "@priceBreakdown",
    "@promo",
    "@rateChange",
    "ChargeableRateInfo",
    "cancellationPolicy",
    "nonRefundable",
    "online",
    "rateType"
})
public class RateInfo {

    @JsonProperty("@priceBreakdown")
    private String PriceBreakdown;
    @JsonProperty("@promo")
    private String Promo;
    @JsonProperty("@rateChange")
    private String RateChange;
    @JsonProperty("ChargeableRateInfo")
    private main.api.model.ChargeableRateInfo ChargeableRateInfo;
    @JsonProperty("cancellationPolicy")
    private String cancellationPolicy;
    @JsonProperty("nonRefundable")
    private Boolean nonRefundable;
    @JsonProperty("online")
    private Boolean online;
    @JsonProperty("rateType")
    private String rateType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The PriceBreakdown
     */
    @JsonProperty("@priceBreakdown")
    public String getPriceBreakdown() {
        return PriceBreakdown;
    }

    /**
     * 
     * @param PriceBreakdown
     *     The @priceBreakdown
     */
    @JsonProperty("@priceBreakdown")
    public void setPriceBreakdown(String PriceBreakdown) {
        this.PriceBreakdown = PriceBreakdown;
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

    /**
     * 
     * @return
     *     The RateChange
     */
    @JsonProperty("@rateChange")
    public String getRateChange() {
        return RateChange;
    }

    /**
     * 
     * @param RateChange
     *     The @rateChange
     */
    @JsonProperty("@rateChange")
    public void setRateChange(String RateChange) {
        this.RateChange = RateChange;
    }

    /**
     * 
     * @return
     *     The ChargeableRateInfo
     */
    @JsonProperty("ChargeableRateInfo")
    public main.api.model.ChargeableRateInfo getChargeableRateInfo() {
        return ChargeableRateInfo;
    }

    /**
     * 
     * @param ChargeableRateInfo
     *     The ChargeableRateInfo
     */
    @JsonProperty("ChargeableRateInfo")
    public void setChargeableRateInfo(main.api.model.ChargeableRateInfo ChargeableRateInfo) {
        this.ChargeableRateInfo = ChargeableRateInfo;
    }

    /**
     * 
     * @return
     *     The cancellationPolicy
     */
    @JsonProperty("cancellationPolicy")
    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    /**
     * 
     * @param cancellationPolicy
     *     The cancellationPolicy
     */
    @JsonProperty("cancellationPolicy")
    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    /**
     * 
     * @return
     *     The nonRefundable
     */
    @JsonProperty("nonRefundable")
    public Boolean getNonRefundable() {
        return nonRefundable;
    }

    /**
     * 
     * @param nonRefundable
     *     The nonRefundable
     */
    @JsonProperty("nonRefundable")
    public void setNonRefundable(Boolean nonRefundable) {
        this.nonRefundable = nonRefundable;
    }

    /**
     * 
     * @return
     *     The online
     */
    @JsonProperty("online")
    public Boolean getOnline() {
        return online;
    }

    /**
     * 
     * @param online
     *     The online
     */
    @JsonProperty("online")
    public void setOnline(Boolean online) {
        this.online = online;
    }

    /**
     * 
     * @return
     *     The rateType
     */
    @JsonProperty("rateType")
    public String getRateType() {
        return rateType;
    }

    /**
     * 
     * @param rateType
     *     The rateType
     */
    @JsonProperty("rateType")
    public void setRateType(String rateType) {
        this.rateType = rateType;
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
