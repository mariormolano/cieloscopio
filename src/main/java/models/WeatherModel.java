package models;

import java.util.List;

public class WeatherModel {
	private final Coord coord;
	private final List<Weather>  weather;
	private final String base;
	private final Main main;
	private final String visibility;
	private final Wind wind;
	private final Clouds clouds;
	private final String dt;
	private final Sys sys;
	private final String timezone;
	private final String id;
	private final String name;
	private final String cod;

	public WeatherModel(WeatherModel weatherModel) {
		this.coord = weatherModel.getCoord();
		this.weather = weatherModel.getWeather();
		this.base = weatherModel.getBase();
		this.main = weatherModel.getMain();
		this.visibility = weatherModel.getVisibility();
		this.wind = weatherModel.getWind();
		this.clouds = weatherModel.getClouds();
		this.dt = weatherModel.getDt();
		this.sys = weatherModel.getSys();
		this.timezone = weatherModel.getTimezone();
		this.id = weatherModel.getId();
		this.name = weatherModel.getName();
		this.cod = weatherModel.getCod();
	}

	public Coord getCoord() {
		return coord;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public String getBase() {
		return base;
	}

	public Main getMain() {
		return main;
	}

	public String getVisibility() {
		return visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public String getDt() {
		return dt;
	}

	public Sys getSys() {
		return sys;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCod() {
		return cod;
	}
}
