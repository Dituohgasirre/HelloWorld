package qingke;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> numberlist = new ArrayList<Integer>();
		numberlist.add(10);
		numberlist.add(20);
		numberlist.add(30);
		Iterator<Integer> it = numberlist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-----------");

		for (int i = 0; i < numberlist.size(); i++) {
			System.out.println(numberlist.get(i));
		}
		System.out.println("-----------");

		for (Integer value : numberlist) {
			System.out.println(value);
		}
		System.out.println("-----------");
		numberlist.remove(0);
		for (Integer value : numberlist) {
			System.out.println(value);
		}

	}

}
