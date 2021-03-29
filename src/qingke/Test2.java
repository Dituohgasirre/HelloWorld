package qingke;

public class Test2 {

	public static void main(String[] args) {
		boolean a = sleepIn(true, false);
		boolean b = sleepIn(false, true);
		boolean c = sleepIn(false, false);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
	
		 return (!weekday || vacation);
		
	}

}
