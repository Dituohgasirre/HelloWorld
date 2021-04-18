package qingke2;

import java.util.Random;

public class Role {
	private static final String[] names = { "¿¨ÌØÁÕÄÈ", "°¢Àê", "Â¶Â¶", "Ë÷À­¿¨", "À­¿ËË¿", "Èû¶÷", "ÎÚµÏ¶û", "Ì©Â¡", "´ŞË¹ÌØ", "Â¬Î÷¶÷" };
	private static boolean[] isUsed;
	private static boolean isInitializeCountNames = false;
	private String name;

	public Role() {
		initializeCountNames();
		setNames();
	}

	public Role(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private void initializeCountNames() {
		isUsed = new boolean[10];
		if (!isInitializeCountNames) {
			for (int i = 0; i < names.length; i++) {
				isUsed[i] = false;
			}
		}
	}

	private void setNames() {
		Random r = new Random();
		int i;
		do {
			i = r.nextInt(10);
		} while (isUsed[i]);
		name = names[i];
		isUsed[i] = true;
	}

}
