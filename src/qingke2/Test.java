package qingke2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Table t = new Table();
		String name = "";
		while (true) {
			System.out.println("请输入你的名字：");
			name = sc.next();
			if (name != "")
				break;
		}
		while (true) {
			System.out.println("你想与几名玩家一起斗牛：（1~9）");
			int count = sc.nextInt();
			if (count > 0 && count < 10) {
				for (int i = 0; i < count; i++) {
					t.add();
					;
				}
				break;
			}
		}
		sc.close();

		t.start();
	}
}
