package models;

public record Weather(
		String id,
		String main,
		String description,
		String icon
) {
	@Override
	public String id() {
		return id;
	}

	@Override
	public String main() {
		return main;
	}

	@Override
	public String description() {
		return description;
	}

	@Override
	public String icon() {
		return icon;
	}
}
