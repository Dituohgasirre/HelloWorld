package qingke;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length == 0) {
			return false;
		} else if (nums.length == 1) {
			return true;
		} else if (nums[0] == nums[nums.length - 1]) {
			return true;
		}
		return false;
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a.length == 1 && b.length == 1 && a[0] == b[0]) {
			return true;
		} else if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

	public int sum3(int[] nums) {
		int s = 0;
		for (int i = 0; i < nums.length; i++) {
			s += nums[i];
		}
		return s;
	}

	public int[] rotateLeft3(int[] nums) {
		int[] a = new int[3];
		a[0] = nums[1];
		a[1] = nums[2];
		a[2] = nums[0];
		return a;
	}

	public int[] reverse3(int[] nums) {
		int[] a = new int[3];
		a[0] = nums[2];
		a[1] = nums[1];
		a[2] = nums[0];
		return a;
	}

	public int[] maxEnd3(int[] nums) {
		int[] a = new int[3];
		if (nums[0] >= nums[2]) {
			for (int i = 0; i < 3; i++) {
				a[i] = nums[0];

			}
			return a;
		} else {
			for (int i = 0; i < 3; i++) {
				a[i] = nums[2];
			}
			return a;
		}

	}

	public int sum2(int[] nums) {
		if (nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			return nums[0];
		} else {
			return nums[0] + nums[1];
		}
	}

	public int[] middleWay(int[] a, int[] b) {
		int[] s = new int[2];
		s[0] = a[1];
		s[1] = b[1];
		return s;
	}

	public int[] makeEnds(int[] nums) {
		int[] s = new int[2];
		if (nums.length == 1) {
			s[0] = nums[0];
			s[1] = nums[0];
			return s;
		} else {
			s[0] = nums[0];
			s[1] = nums[nums.length - 1];
			return s;
		}
	}

	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[0] == 3) {
			return true;
		} else if (nums[1] == 2 || nums[1] == 3) {
			return true;
		}
		return false;
	}

}
