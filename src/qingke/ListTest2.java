package qingke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		timing("ArrayList", arraylist);
		timing("LinkedList", linkedlist);
	}

	public static void timing(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long st = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println(type + "»¨·Ñ" + (end - st) + "ºÁÃë");
	}

}
