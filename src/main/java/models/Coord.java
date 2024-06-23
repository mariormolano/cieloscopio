package models;

public record Coord(
		String lon,
		String lat
) {
	@Override
	public String lon() {
		return lon;
	}

	@Override
	public String lat() {
		return lat;
	}
}
