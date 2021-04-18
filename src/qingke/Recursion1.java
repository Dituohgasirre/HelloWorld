package qingke;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		} else {
			return 2 + bunnyEars(bunnies - 1);
		}
	}

	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}

		if (bunnies % 2 == 0) {
			return bunnyEars2(bunnies - 1) + 3;
		} else {
			return bunnyEars2(bunnies - 1) + 2;
		}

	}

	public int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}
		if (rows == 1) {
			return 1;
		} else {
			return triangle(rows - 1) + rows;
		}
	}

	public int sumDigits(int n) {
		if (n < 10) {
			return n;
		} else {
			return n % 10 + sumDigits(n / 10);
		}
	}

	public int count7(int n) {
		if (n == 7) {
			return 1;
		}
		if (n != 7 && n < 10) {
			return 0;
		} else {
			return count7(n / 10) + count7(n % 10);
		}
	}

	// public int count8(int n) {
	// if()
	// }
	public int powerN(int base, int n) {
		if (n == 1) {
			return base;
		} else {
			return powerN(base, n - 1) * base;
		}

	}

	public int countX(String str) {
		if (str.length() < 1) {
			return 0;
		}
		if (str.charAt(0) == 'x') {
			return 1 + countX(str.substring(1));
		} else {
			return countX(str.substring(1));
		}

	}

}
