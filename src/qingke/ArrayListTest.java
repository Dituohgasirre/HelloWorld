package qingke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> numberlist = new ArrayList<String>();
		numberlist.add("cat");
		numberlist.add("dog");
		numberlist.add("fish");
		Iterator<String> it = numberlist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-----------");

		for (int i = 0; i < numberlist.size(); i++) {
			System.out.println(numberlist.get(i));
		}
		System.out.println("-----------");

		for (String value : numberlist) {
			System.out.println(value);
		}
		System.out.println("-----------");
		numberlist.remove(0);
		for (String value : numberlist) {
			System.out.println(value);
		}
		System.out.println(numberlist.contains("do"));
		System.out.println(Arrays.toString(numberlist.toArray()));
	}

}
