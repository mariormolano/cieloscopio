package models;

import java.util.List;
import java.util.Map;

public class GeoModel {
	private final String name;
	private final Map<String, String> local_names;
	private final String lat;
	private final String lon;
	private final String country;

	public GeoModel(GeoModel geoModel) {
		this.name = geoModel.getName();
		this.local_names = geoModel.getLocal_names();
		this.lat = geoModel.getLat();
		this.lon = geoModel.getLon();
		this.country = geoModel.getCountry();
	}

	public String getName() {
		return name;
	}

	public Map<String, String> getLocal_names() {
		return local_names;
	}

	public String getLat() {
		return lat;
	}

	public String getLon() {
		return lon;
	}

	public String getCountry() {
		return country;
	}
}
