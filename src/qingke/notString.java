package qingke;

public class notString {

	public static void main(String[] args) {
		String str = "bad";

		System.out.println(notString(str));

	}

	public static String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		} else
			return "not " + str;

	}

}
