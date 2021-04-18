package qingke1;

public class EnumTest {
	public static void main(String[] args) {
		getDirection(Direction.EAST);
		getLamp(Lamp.GREEN);

	}

	public static void getDirection(Direction direction) {
		if (direction == Direction.EAST) {
			System.out.println(Direction.EAST.getDirection() + " " + Direction.EAST.getDescription());
		}
	}

	public static void getLamp(Lamp lamp) {
		if (lamp == Lamp.GREEN) {
			System.out.println(Lamp.GREEN.getColor() + " " + Lamp.GREEN.getDescription());
		}

	}
}
