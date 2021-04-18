package qingke;

public class Test1 {

	public static void main(String[] args) {

		String firstName = "Î¾²ý´ï";
		String secondName = "ÌÕÔÀ½Ü";
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
