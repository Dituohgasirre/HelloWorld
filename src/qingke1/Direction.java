package qingke1;

public enum Direction {
	WEST("西","西方"),
	EAST("东","东方"),
	SOUTH("南","南方"),
	NORTH("北","北方");
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
