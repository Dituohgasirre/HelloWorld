package qingke;

import java.util.Scanner;

public class LearnSwitch {

	public static void main(String[] args) {

		int score;
		int a;
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		if (score >= 80) {
			a = 1;
		} else if (score >= 70) {
			a = 2;
		} else if (score >= 60) {
			a = 3;
		} else
			a = 4;
		switch (a) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("������");
			break;

		}
		sc.close();

	}

}
