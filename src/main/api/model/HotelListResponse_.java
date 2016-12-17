
package main.api.model;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "customerSessionId",
    "moreResultsAvailable",
    "cacheKey",
    "cacheLocation",
    "HotelList"
})

@JsonIgnoreProperties(ignoreUnknown=true)
public class HotelListResponse_ {

    @JsonProperty("customerSessionId")
    private String customerSessionId;
    @JsonProperty("moreResultsAvailable")
    private Boolean moreResultsAvailable;
    @JsonProperty("cacheKey")
    private String cacheKey;
    @JsonProperty("cacheLocation")
    private String cacheLocation;
    @JsonProperty("HotelList")
    private HotelList HotelList;
   
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
     *     The moreResultsAvailable
     */
    @JsonProperty("moreResultsAvailable")
    public Boolean getMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    /**
     * 
     * @param moreResultsAvailable
     *     The moreResultsAvailable
     */
    @JsonProperty("moreResultsAvailable")
    public void setMoreResultsAvailable(Boolean moreResultsAvailable) {
        this.moreResultsAvailable = moreResultsAvailable;
    }

    /**
     * 
     * @return
     *     The cacheKey
     */
    @JsonProperty("cacheKey")
    public String getCacheKey() {
        return cacheKey;
    }

    /**
     * 
     * @param cacheKey
     *     The cacheKey
     */
    @JsonProperty("cacheKey")
    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    /**
     * 
     * @return
     *     The cacheLocation
     */
    @JsonProperty("cacheLocation")
    public String getCacheLocation() {
        return cacheLocation;
    }

    /**
     * 
     * @param cacheLocation
     *     The cacheLocation
     */
    @JsonProperty("cacheLocation")
    public void setCacheLocation(String cacheLocation) {
        this.cacheLocation = cacheLocation;
    }
    /**
     * 
     * @return
     *     The HotelList
     */
    @JsonProperty("HotelList")
    public main.api.model.HotelList getHotelList() {
        return HotelList;
    }

    /**
     * 
     * @param HotelList
     *     The HotelList
     */
    @JsonProperty("HotelList")
    public void setHotelList(main.api.model.HotelList HotelList) {
        this.HotelList = HotelList;
    }
}
