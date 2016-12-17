package main.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAddress implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("address1")
    private String address1;

    @JsonProperty("address2")
    private String address2;

    @JsonProperty("city")
    private String city;

    @JsonProperty("stateProvinceCode")
    private String stateProvinceCode;

    @JsonProperty("countryCode")
    private String countryCode;

    @JsonProperty("postalCode")
    private String postalCode;

    @JsonProperty("isPrimary")
    private Boolean isPrimary;

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getStateProvinceCode() {
		return stateProvinceCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public boolean isPrimary() {
        return isPrimary;
    }
}
