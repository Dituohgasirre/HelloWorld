package qingke;

public class frontBack {

	public static void main(String[] args) {
		System.out.println(frontBack("hello"));

	}

	public static String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}
		String mid = str.substring(1, str.length() - 1);
		return str.charAt(str.length() - 1) + mid + str.charAt(0);

	}

	public String stringBits(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i += 2) {
			result += str.charAt(i);
		}
		return result;
	}

	public String stringSplosion(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += str.substring(0, i + 1);
		}
		return result;
	}

}
