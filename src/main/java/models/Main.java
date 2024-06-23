package models;

public record Main(
		String temp,
		String feels_like,
		String temp_min,
		String temp_max,
		String pressure,
		String humidity
) {
	@Override
	public String temp() {
		return temp;
	}

	@Override
	public String feels_like() {
		return feels_like;
	}

	@Override
	public String temp_min() {
		return temp_min;
	}

	@Override
	public String temp_max() {
		return temp_max;
	}

	@Override
	public String pressure() {
		return pressure;
	}

	@Override
	public String humidity() {
		return humidity;
	}
}
