package ru.edu.dto;

public class CityInformation {

	private String cityId;

	private String name;

	private String responseTime;

	private String detailedInfoHref;

	private String deleteHref;

	public String getDetailedInfoHref() {
		return detailedInfoHref;
	}

	public void setDetailedInfoHref(String detailedInfoHref) {
		this.detailedInfoHref = detailedInfoHref;
	}

	public String getDeleteHref() {
		return deleteHref;
	}

	public void setDeleteHref(String deleteHref) {
		this.deleteHref = deleteHref;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

}
