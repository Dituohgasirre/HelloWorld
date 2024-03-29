package qingke;

public class SelectionSort {
	public static void main(String[] args) {
		int[] list = { 12, 9, 4, 6, 5, 3 };
		SelectionSort.selectionSort(list);
		for (int i = 0; i < 6; i++) {
			System.out.println(list[i]);
		}
	}

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

}
