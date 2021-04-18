package qingke;

public class Game {

	public static void main(String[] args) {
		int max;
		if (args.length > 0) {
			max = Integer.parseInt(args[0]);
		} else {
			max = 100;
		}
		for (int i = 1; i <= max; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("三五");
			} else if (i % 3 == 0) {
				System.out.println("小" + i);
			} else if (i % 5 == 0) {
				System.out.println("小" + i);
			}

			else {
				System.out.println(i);
			}
		}

	}

}
