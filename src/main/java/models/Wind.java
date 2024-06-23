package models;

public record Wind(
		String speed,
		String deg
) {
	@Override
	public String speed() {
		return speed;
	}

	@Override
	public String deg() {
		return deg;
	}
}
