package qingke1;

public enum Lamp {
	RED("���", "ͣ"), GREEN("�̵�", "��"), YELLOW("�Ƶ�", "��");
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
