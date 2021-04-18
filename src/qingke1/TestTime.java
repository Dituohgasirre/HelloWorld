package qingke1;

public class TestTime {

	public static void main(String[] args) {
		MyTime t = new MyTime(23, 59, 59);
		System.out.println(t.nextSecond());
		System.out.println(t.previousSecond());
	}

}
