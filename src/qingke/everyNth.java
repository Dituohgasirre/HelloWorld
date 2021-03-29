package qingke;


import java.util.ArrayList;
import java.util.List;

public class everyNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(everyNth("qweqweqwe",2));
		String a = "Acf";

		System.out.println("");
	}

	public static String everyNth(String str, int n) {
		String s = " ";
		for (int i = 0; i < str.length(); i++) {
			if (i % n == 0) {
				s = s + str.charAt(i);
			}
		}
		return s;
	}

	public int stringMatch(String a, String b) {
		int len = Math.min(a.length(), b.length());
		int count = 0;
		for (int i = 0; i < len - 1; i++) {
			String a1 = a.substring(i, i + 2);
			String a2 = b.substring(i, i + 2);
			if (a1.equals(a2)) {
				count++;
			}
		}
		return count;
	}

	public String stringX(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!(i > 0 && i < str.length() - 1) && str.charAt(i) == 'x') {
				result = result + str.charAt(i);
			}
		}
		return result;
	}

	public static String delStr(String str, int a, int b) {
		String front = str.substring(0, a);
		String end = str.substring(b + 1);
		String s = front + end;
		return s;
	}

	public String startWord(String str, String word) {
		if (str.length() < word.length() || !str.substring(1, word.length()).equals(word.substring(1))) {
			return "";
		} else {
			if (str.substring(0, word.length()) == word) {
				return word;
			} else {
				return str.substring(0, word.length());
			}
		}
	}

	public String withoutX(String str) {
		if (str.length() > 1) {
			if (str.substring(0, 1).equals("x") && str.substring(str.length() - 1).equals("x")) {
				return str.substring(1, str.length() - 1);
			} else if (str.substring(0, 1).equals("x")) {
				return str.substring(1);
			} else if (str.substring(str.length() - 1).equals("x")) {
				return str.substring(0, str.length() - 1);
			} else {
				return str;
			}
		} else {
			return "";
		}
	}

	public void doWhile(int i, int m) {

		if (i <= 100) {
			System.out.println(i);
			i++;
			doWhile(i, m);
		}
	}

	public String withoutX2(String str) {

		if (str.length() > 1) {
			if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
				return str.substring(2);
			} else if (str.charAt(0) == 'x') {
				return str.substring(1);
			} else if (str.charAt(1) == 'x') {
				return str.charAt(0) + str.substring(2);
			} else {
				return str;
			}

		} else if (str.length() == 1) {
			if (str == "x") {
				return "";
			} else {
				return str;
			}
		} else {
			return "";
		}

	}

	public String doubleChar(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = s + str.charAt(i) + str.charAt(i);
		}
		return s;
	}

	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				count++;
			}
		}
		return count;
	}

	public boolean catDog(String str) {
		if (str.length() < 3) {
			return true;
		} else {
			int a = 0, b = 0;
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 3).equals("cat")) {
					a++;
				}
				if (str.substring(i, i + 3).equals("dog")) {
					b++;
				}
			}
			if (a == b) {
				return true;
			} else {
				return false;
			}
		}
	}

	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
				count++;
			}
		}
		return count;
	}

	public String repeatEnd(String str, int n) {
		String s1 = "";
		String s2 = str.substring(str.length() - n);
		for (int i = 0; i < n; i++) {
			s1 = s1 + s2;
		}
		return s1;
	}

	public String repeatFront(String str, int n) {
		String s1 = "";

		for (int i = n; i >= 0; i--) {
			String s2 = str.substring(0, i);
			s1 += s2;
		}
		return s1;
	}

	public String repeatSeparator(String word, String sep, int count) {
		String s1 = "";
		for (int i = 0; i < count; i++) {
			s1 = s1 + word + sep;
		}
		return s1.substring(0, s1.length() - sep.length());
	}

	public boolean prefixAgain(String str, int n) {
		String s1 = str.substring(0, n);
		if (str.length() == 1) {
			return false;
		} else {
			for (int i = 0; i < str.length() - n; i++) {
				if (str.substring(i + 1, i + n + 1).equals(s1)) {
					return true;
				}
			}
			return false;
		}
	}

	public boolean xyzMiddle(String str) {
		int a = str.length() / 2 - 1;
		if (str.length() < 3) {
			return false;
		} else if (str.length() == 3 && str.equals("xyz")) {
			return true;
		} else if (str.length() % 2 != 0 && str.substring(a, a + 3).equals("xyz")) {
			return true;
		} else if (str.substring(a, a + 3).equals("xyz") || str.substring(a - 1, a + 2).equals("xyz")) {
			return true;
		}
		return false;
	}

	public String getSandwich(String str) {

		int s1 = str.indexOf("bread");
		int s2 = str.lastIndexOf("bread");
		if (str.length() < 10) {
			return "";
		} else if (s1 == -1 || s2 == -1 || s1 == s2) {
			return "";
		} else {
			return str.substring(s1 + 5, s2);
		}
	}

	public boolean sameStarChar(String str) {
		if (str.length() < 3) {
			if(str!="**"&&str!=""&&str!="*"){
				return false;
			}
		} else {
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.charAt(i + 1) == '*' && str.charAt(i) != str.charAt(i + 2)) {
					return false;
					
				}
//				if(str.charAt(i + 1) == '*' && str.charAt(i) == str.charAt(i + 2)){
//					return true;
//				}
			}
		}
		return true;
	}
	public String oneTwo(String str) {
		  String s1 ="";
		  for(int i=0;i<str.length()-2;i+=3){
			  s1=s1+str.charAt(i+1)+str.charAt(i+2)+str.charAt(i);
		  }
		  return s1;
	}
//	public String zipZap(String str) {
//		String s1 ="";
//		if(str.length()<3){
//			return str;
//		}
//		for(int i=0;i<str.length()-2;i++){
//			if(str.charAt(i)!='z'&&str.charAt(i+2)!='p'){
//				return str;
//			}
//		}
//		for(int i=0;i<str.length()-2;i++){
//			
//			if(str.charAt(i)!='z'&&str.charAt(i+2)!='p'){
//				s1=s1+str.charAt(i)+str.charAt(i+1)+str.charAt(i+2);
//			
//			}else{
//				s1=s1+str.charAt(i)+str.charAt(i+2);
//			}
//		}
//		return s1;
//	}
	public static String zipZap(String string){
		byte[] bytes = string.getBytes ();

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(0);

		for (int i = 0, j = bytes.length; i < j; i ++) {

			if (bytes[i] == 'z') {

				for (int m = i + 1; m < j; m++) {

					if(bytes[m] == 'z') {
						i = m;
						continue;
					}
					if (bytes[m] == 'p') {
						intList.add(i);
						intList.add(m);
						i = m;
						break;
					}
					
				}
			}
		}
		intList.add(bytes.length - 1);

		System.out.println(intList.toString());
		
		List<Byte> tempList = new ArrayList<Byte>();
		
		for (int i = 0, j = intList.size()/2; i < j; i ++) {
			for (int m = intList.get(i*2),n = intList.get(i*2 + 1); m <= n; m ++) {
				tempList.add(bytes[m]);
			}
		}
			
		byte[] rtnByte = new byte[tempList.size()];
		for (int i = 0, j = tempList.size(); i < j; i ++) {
			rtnByte[i] = tempList.get(i);
		}
		
		return new String(rtnByte);
	}
	



}
