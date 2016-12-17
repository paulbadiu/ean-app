
package main.api.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "@nightlyRateTotal",
    "@surchargeTotal",
    "@total",
    "NightlyRatesPerRoom",
    "Surcharges"
})

@JsonIgnoreProperties(ignoreUnknown=true)
public class ChargeableRateInfo {

    @JsonProperty("@nightlyRateTotal")
    private String NightlyRateTotal;
    @JsonProperty("@surchargeTotal")
    private String SurchargeTotal;
    @JsonProperty("@total")
    private String Total;
    @JsonProperty("NightlyRatesPerRoom")
    private main.api.model.NightlyRatesPerRoom NightlyRatesPerRoom;
    @JsonProperty("Surcharges")
    private main.api.model.Surcharges Surcharges;

    /**
     * 
     * @return
     *     The NightlyRateTotal
     */
    @JsonProperty("@nightlyRateTotal")
    public String getNightlyRateTotal() {
        return NightlyRateTotal;
    }

    /**
     * 
     * @param NightlyRateTotal
     *     The @nightlyRateTotal
     */
    @JsonProperty("@nightlyRateTotal")
    public void setNightlyRateTotal(String NightlyRateTotal) {
        this.NightlyRateTotal = NightlyRateTotal;
    }

    /**
     * 
     * @return
     *     The SurchargeTotal
     */
    @JsonProperty("@surchargeTotal")
    public String getSurchargeTotal() {
        return SurchargeTotal;
    }

    /**
     * 
     * @param SurchargeTotal
     *     The @surchargeTotal
     */
    @JsonProperty("@surchargeTotal")
    public void setSurchargeTotal(String SurchargeTotal) {
        this.SurchargeTotal = SurchargeTotal;
    }

    /**
     * 
     * @return
     *     The Total
     */
    @JsonProperty("@total")
    public String getTotal() {
        return Total;
    }

    /**
     * 
     * @param Total
     *     The @total
     */
    @JsonProperty("@total")
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * 
     * @return
     *     The NightlyRatesPerRoom
     */
    @JsonProperty("NightlyRatesPerRoom")
    public main.api.model.NightlyRatesPerRoom getNightlyRatesPerRoom() {
        return NightlyRatesPerRoom;
    }

    /**
     * 
     * @param NightlyRatesPerRoom
     *     The NightlyRatesPerRoom
     */
    @JsonProperty("NightlyRatesPerRoom")
    public void setNightlyRatesPerRoom(main.api.model.NightlyRatesPerRoom NightlyRatesPerRoom) {
        this.NightlyRatesPerRoom = NightlyRatesPerRoom;
    }

    /**
     * 
     * @return
     *     The Surcharges
     */
    @JsonProperty("Surcharges")
    public main.api.model.Surcharges getSurcharges() {
        return Surcharges;
    }

    /**
     * 
     * @param Surcharges
     *     The Surcharges
     */
    @JsonProperty("Surcharges")
    public void setSurcharges(main.api.model.Surcharges Surcharges) {
        this.Surcharges = Surcharges;
    }


}
