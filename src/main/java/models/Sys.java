package models;

public record Sys(
		String type,
		String id,
		String country,
		String sunrise,
		String sunset
) {
	@Override
	public String type() {
		return type;
	}

	@Override
	public String id() {
		return id;
	}

	@Override
	public String country() {
		return country;
	}

	@Override
	public String sunrise() {
		return sunrise;
	}

	@Override
	public String sunset() {
		return sunset;
	}
}
