package main.api.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error message returned in case of a failed attempt to make a request to EAN API.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class EanWsError implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("itineraryId")
	private long itineraryId;
	
	@JsonProperty("handling")
	private String handling;
	
	@JsonProperty("category")
	private String category;
	
	@JsonProperty("exceptionConditionId")
	private int exceptionConditionId;
	
	@JsonProperty("presentationMessage")
	private String presentationMessage;
	
	@JsonProperty("verboseMessage")
	private String verboseMessage;

	//getters & setters
	public long getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(long itineraryId) {
		this.itineraryId = itineraryId;
	}

	public String getHandling() {
		return handling;
	}

	public void setHandling(String handling) {
		this.handling = handling;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getExceptionConditionId() {
		return exceptionConditionId;
	}

	public void setExceptionConditionId(int exceptionConditionId) {
		this.exceptionConditionId = exceptionConditionId;
	}

	public String getPresentationMessage() {
		return presentationMessage;
	}

	public void setPresentationMessage(String presentationMessage) {
		this.presentationMessage = presentationMessage;
	}

	public String getVerboseMessage() {
		return verboseMessage;
	}

	public void setVerboseMessage(String verboseMessage) {
		this.verboseMessage = verboseMessage;
	}

	@Override
	public String toString() {
		return "EanWsError [itineraryId=" + itineraryId + ", handling=" + handling + ", category=" + category
				+ ", exceptionConditionId=" + exceptionConditionId + ", presentationMessage=" + presentationMessage
				+ ", verboseMessage=" + verboseMessage + "]";
	}

}
