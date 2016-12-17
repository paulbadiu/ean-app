package main.api.autocomplete;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RegionCenterCoordinates implements Serializable {

    private static final long serialVersionUID = 1L;

    private transient int regionId;
    @JsonProperty
    private String regionName;
    @JsonProperty
    private double centerlatitude;
    @JsonProperty
    private double centerlongitude;

    public RegionCenterCoordinates() {}

    public RegionCenterCoordinates(int regionId, String regionName, double centerlatitude, double centerlongitude) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.centerlatitude = centerlatitude;
        this.centerlongitude = centerlongitude;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getCenterlatitude() {
        return centerlatitude;
    }

    public void setCenterlatitude(double centerlatitude) {
        this.centerlatitude = centerlatitude;
    }

    public double getCenterlongitude() {
        return centerlongitude;
    }

    public void setCenterlongitude(double centerlongitude) {
        this.centerlongitude = centerlongitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionCenterCoordinates that = (RegionCenterCoordinates) o;

        if (regionId != that.regionId) return false;
        if (Double.compare(that.centerlatitude, centerlatitude) != 0) return false;
        if (Double.compare(that.centerlongitude, centerlongitude) != 0) return false;
        return regionName != null ? regionName.equals(that.regionName) : that.regionName == null;

    }
}
