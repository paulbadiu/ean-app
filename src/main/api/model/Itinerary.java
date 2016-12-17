
package main.api.model;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "itineraryId",
    "itineraryStartDate",
    "itineraryEndDate",
    "Customer",
    "HotelConfirmation"
})

@JsonIgnoreProperties(ignoreUnknown=true)
public class Itinerary {

    @JsonProperty("itineraryId")
    private Integer itineraryId;
    @JsonProperty("itineraryStartDate")
    private String itineraryStartDate;
    @JsonProperty("itineraryEndDate")
    private String itineraryEndDate;
    @JsonProperty("Customer")
    private main.api.model.Customer Customer;
    @JsonProperty("HotelConfirmation")
    private main.api.model.HotelConfirmation HotelConfirmation;
  

    /**
     * 
     * @return
     *     The itineraryId
     */
    @JsonProperty("itineraryId")
    public Integer getItineraryId() {
        return itineraryId;
    }

    /**
     * 
     * @param itineraryId
     *     The itineraryId
     */
    @JsonProperty("itineraryId")
    public void setItineraryId(Integer itineraryId) {
        this.itineraryId = itineraryId;
    }

    /**
     * 
     * @return
     *     The itineraryStartDate
     */
    @JsonProperty("itineraryStartDate")
    public String getItineraryStartDate() {
        return itineraryStartDate;
    }

    /**
     * 
     * @param itineraryStartDate
     *     The itineraryStartDate
     */
    @JsonProperty("itineraryStartDate")
    public void setItineraryStartDate(String itineraryStartDate) {
        this.itineraryStartDate = itineraryStartDate;
    }

    /**
     * 
     * @return
     *     The itineraryEndDate
     */
    @JsonProperty("itineraryEndDate")
    public String getItineraryEndDate() {
        return itineraryEndDate;
    }

    /**
     * 
     * @param itineraryEndDate
     *     The itineraryEndDate
     */
    @JsonProperty("itineraryEndDate")
    public void setItineraryEndDate(String itineraryEndDate) {
        this.itineraryEndDate = itineraryEndDate;
    }

    /**
     * 
     * @return
     *     The Customer
     */
    @JsonProperty("Customer")
    public main.api.model.Customer getCustomer() {
        return Customer;
    }

    /**
     * 
     * @param Customer
     *     The Customer
     */
    @JsonProperty("Customer")
    public void setCustomer(main.api.model.Customer Customer) {
        this.Customer = Customer;
    }

    /**
     * 
     * @return
     *     The HotelConfirmation
     */
    @JsonProperty("HotelConfirmation")
    public main.api.model.HotelConfirmation getHotelConfirmation() {
        return HotelConfirmation;
    }

    /**
     * 
     * @param HotelConfirmation
     *     The HotelConfirmation
     */
    @JsonProperty("HotelConfirmation")
    public void setHotelConfirmation(main.api.model.HotelConfirmation HotelConfirmation) {
        this.HotelConfirmation = HotelConfirmation;
    }

}
