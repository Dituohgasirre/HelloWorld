package qingke;

public class Test1 {

	public static void main(String[] args) {

		String firstName = "ξ����";
		String secondName = "������";
		System.out.println("frstName:" + firstName);
		System.out.println("secondName:" + secondName);
		System.out.println("............");
		String temp = firstName;
		firstName = secondName;
		secondName = temp;

		System.out.println("frstName:" + firstName);
		System.out.println("secondName:" + secondName);
	}

}
