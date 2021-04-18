package qingke;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] a = { 2, 4, 1, 5, 3, 8, 6, };
		quick_sort2(a, 0, a.length - 1);

		System.out.println(Arrays.toString(a));
	}

	public static void quick_sort(int s[], int l, int r) {
		if (l < r) {
			// Swap(s[l], s[(l + r) / 2]); //���м��������͵�һ�������� �μ�ע1
			int i = l, j = r, x = s[l];
			while (i < j) {
				while (i < j && s[j] >= x) // ���������ҵ�һ��С��x����
					j--;
				if (i < j)
					s[i++] = s[j];

				while (i < j && s[i] < x) // ���������ҵ�һ�����ڵ���x����
					i++;
				if (i < j)
					s[j--] = s[i];
			}
			s[i] = x;
			quick_sort(s, l, i - 1); // �ݹ����
			quick_sort(s, i + 1, r);
		}
	}

	public static void quick_sort1(int s[], int l, int r) {

		if (l < r) {
			int i = l, j = r, x = s[l];
			while (i < j && s[j] >= x)
				j--;
			if (i < j) {
				s[i++] = s[j];
			}
			while (i < j && s[i] <= x)
				i++;
			if (i < j) {
				s[j--] = s[i];

			}
			s[i] = x;
			quick_sort1(s, l, i - 1);
			quick_sort1(s, i + 1, r);
		}
	}

	public static void quick_sort2(int s[], int l, int r) {
		if (l < r) {
			int i = l, j = r, x = s[l];
			while (i < j && s[j] >= x)
				j--;
			if (i < j) {
				s[i++] = s[j];
			}
			while (i < j && s[i] <= x)
				i++;
			if (i < j) {
				s[j--] = s[i];
			}
			s[i] = x;
			quick_sort2(s, l, i - 1);
			quick_sort2(s, i + 1, r);
		}

	}
}
