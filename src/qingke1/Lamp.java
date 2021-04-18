package qingke1;

public enum Lamp {
	RED("ºìµÆ", "Í£"), GREEN("ÂÌµÆ", "ÐÐ"), YELLOW("»ÆµÆ", "Âý");
	private String color;
	private String destription;

	Lamp(String color, String description) {
		this.color = color;
		this.destription = description;
	}

	public String getColor() {
		return color;
	}

	public String getDescription() {
		return destription;

	}

}
