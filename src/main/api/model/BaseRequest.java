package main.api.model;

public abstract class BaseRequest {
	
	protected String apiKey;
	protected String cid;
	protected int minorRev;
	protected String customerIpAddress;
	protected String locale;
	protected String currencyCode;
	protected String sig;
	
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid2) {
		this.cid = cid2;
	}
	public int getMinorRev() {
		return minorRev;
	}
	public void setMinorRev(int minorRev) {
		this.minorRev = minorRev;
	}
	public String getCustomerIpAddress() {
		return customerIpAddress;
	}
	public void setCustomerIpAddress(String customerIpAddress) {
		this.customerIpAddress = customerIpAddress;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getSig() {
		return sig;
	}
	public void setSig(String sig) {
		this.sig = sig;
	}
}
