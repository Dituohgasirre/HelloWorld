package qingke;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入你的名字：");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("你好"+ name);
		sc.close();
	}

}
