package qingke;

public class ChallengeDay2 {

	public static void main(String[] args) {
		// int[][] array1 = { { 0, 1, 2, 3, 4 }, { 10, 11, 12, 13, 14 }, { 20,
		// 21, 22, 23, 24 }, { 30, 31, 32, 33, 34 },
		// { 40, 41, 42, 43, 44 } };

		int[][] array1 = new int[5][5];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				array1[i][j] = i * 10 + j;
			}
		}
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("after-------------");
		int[][] array2 = new int[5][5];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				array2[i][j] = array1[j][i];
				System.out.print(array2[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}
