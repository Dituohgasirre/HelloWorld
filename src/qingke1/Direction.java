package qingke1;

public enum Direction {
	WEST("��","����"),
	EAST("��","����"),
	SOUTH("��","�Ϸ�"),
	NORTH("��","����");
	private String direction;
	private String description;
	
	Direction(String direction, String description){
		this.direction=direction;
		this.description=description;
	}

	public String getDirection() {
		return direction;
	}



	public String getDescription() {
		return description;
	}

	
	
}
