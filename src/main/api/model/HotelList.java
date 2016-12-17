
package main.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "@size",
    "@activePropertyCount",
    "HotelSummary"
})

@JsonIgnoreProperties(ignoreUnknown=true)
public class HotelList {

    @JsonProperty("@size")
    private String Size;
    @JsonProperty("@activePropertyCount")
    private String ActivePropertyCount;
    @JsonProperty("HotelSummary")
    private List<main.api.model.HotelSummary> HotelSummary = new ArrayList<main.api.model.HotelSummary>();

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
     *     The ActivePropertyCount
     */
    @JsonProperty("@activePropertyCount")
    public String getActivePropertyCount() {
        return ActivePropertyCount;
    }

    /**
     * 
     * @param ActivePropertyCount
     *     The @activePropertyCount
     */
    @JsonProperty("@activePropertyCount")
    public void setActivePropertyCount(String ActivePropertyCount) {
        this.ActivePropertyCount = ActivePropertyCount;
    }

    /**
     * 
     * @return
     *     The HotelSummary
     */
    @JsonProperty("HotelSummary")
    public List<main.api.model.HotelSummary> getHotelSummary() {
        return HotelSummary;
    }

    /**
     * 
     * @param HotelSummary
     *     The HotelSummary
     */
    @JsonProperty("HotelSummary")
    public void setHotelSummary(List<main.api.model.HotelSummary> HotelSummary) {
        this.HotelSummary = HotelSummary;
    }
}
