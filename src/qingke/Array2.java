package qingke;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(fizzArray2(4)));
	}

	public int countEvens(int[] nums) {
		int count = 0;
		for (int i : nums) {
			if (i % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public int bigDiff(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length - 1] - nums[0];
	}

	public int centeredAverage(int[] nums) {
		Arrays.sort(nums);
		int s = 0;
		for (int i = 1; i < nums.length - 1; i++) {
			s += nums[i];
		}
		return s / (nums.length - 2);
	}

	public int sum13(int[] nums) {
		int s = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 13) {
				i++;
				continue;
			}

			s += nums[i];
		}
		return s;
	}

	public static int sum67(int[] nums) {
		int sum = 0;
		boolean isCount = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6)
				isCount = false;
			if (isCount)
				sum += nums[i];
			if (nums[i] == 7)
				isCount = true;
		}
		return sum;
	}

	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				return true;
			}
		}
		return false;
	}

	public boolean lucky13(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3) {
				return false;
			}
		}
		return true;

	}

	public boolean sum28(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				count++;
			}
		}
		return count == 4;
	}

	public boolean more14(int[] nums) {
		int c1 = 0;
		int c2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				c1++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				c2++;
			}
		}
		return c1 > c2;
	}

	public int[] fizzArray(int n) {
		int[] a = new int[n];
		if (n == 0) {
			a = new int[0];
		}
		for (int i = 0; i < n; i++) {
			a[i] = i;
		}
		return a;
	}

	public boolean only14(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				return false;
			}
		}
		return true;
	}

	public static String[] fizzArray2(int n) {
		String[] a = new String[n];
		if (n == 0) {
			a = new String[0];
		}
		for (int i = 0; i < n; i++) {
			a[i] = String.valueOf(i);

		}
		return a;
	}

	public boolean no14(int[] nums) {
		boolean a1 = false;
		boolean a4 = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				a1 = true;

			}
			if (nums[i] == 4) {
				a4 = true;
			}
		}
		return !(a1 && a4);
	}

	public boolean isEverywhere(int[] nums, int val) {
		boolean odd = true;
		boolean even = true;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				if (nums[i] != val) {
					odd = false;
				}
			} else {
				if (nums[i] != val) {
					even = false;
				}
			}
		}
		return odd || even;
	}

	public boolean either24(int[] nums) {
		boolean a = false;
		boolean b = false;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 2 && nums[i + 1] == 2) {
				a = true;
			}
			if (nums[i] == 4 && nums[i + 1] == 4) {
				b = true;
			}
		}
		if (a && b) {
			return false;
		}
		return a || b;
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (Math.abs(nums1[i] - nums2[i]) < 3 && Math.abs(nums1[i] - nums2[i]) != 0) {
				count++;
			}
		}
		return count;
	}

	public boolean has77(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7 && nums[i + 1] == 7) {
				return true;
			}
		}
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 7 && nums[i + 2] == 7) {
				return true;
			}
		}
		return false;
	}

	public boolean has12(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] == 2) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean modThree(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
				return true;
			} else if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean haveThree(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				count++;
			}

		}
		if (count == 3) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] == 3 && nums[i + 1] == 3) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public int[] tenRun(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] % 10 == 0) {
				int j = i + 1;
				while (nums[j] % 10 != 0) {
					nums[j] = nums[i];

				}
			}
		}
		return nums;
	}

	public int[] pre4(int[] nums) {
		if (nums.length == 0) {
			return nums;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				nums = Arrays.copyOf(nums, i);
				break;

			}
		}
		return nums;
	}

	public int[] post4(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				index = i;
			}
		}
		int[] a = new int[nums.length - index - 1];
		for (int i = 0; i < a.length; i++, index++) {
			a[i] = nums[index + 1];
		}
		return a;
	}

	public int[] notAlone(int[] nums, int val) {
		if (nums.length < 3) {
			return nums;
		}
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
				nums[i] = Math.max(nums[i - 1], nums[i + 1]);
			}
		}
		return nums;

	}

	public static int[] zeroFront(int[] nums) {
		if (nums.length < 1)
			return nums;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[i] ^ nums[index];
				nums[index] = nums[i] ^ nums[index];
				nums[i] = nums[i] ^ nums[index];
				index++;
			}
		}
		return nums;
	}

	public int[] withoutTen(int[] nums) {
		if (nums.length < 1) {
			return nums;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 10) {
				nums[i] = 0;
			}
		}
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
				index++;
			}
		}
		return nums;
	}

	public int[] zeroMax(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				max = 0;
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] % 2 == 1) {
						max = Math.max(max, nums[j]);
					}
				}
				nums[i] = max;
			}
		}
		return nums;
	}

	public static int[] evenOdd(int[] nums) {
		int el = 0;
		int ol = 0;
		int[] even = new int[nums.length];
		int[] odd = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				even[el++] = nums[i];
			else
				odd[ol++] = nums[i];
		}
		for (int i = nums.length - 1; i > -1; i--) {
			if (ol > 0)
				nums[i] = odd[--ol];
			else
				nums[i] = even[--el];
		}
		return nums;
	}

	public String[] fizzBuzz(int start, int end) {
		String[] a = new String[end - start];
		int k = 0;
		for (int i = start; i < end; i++, k++) {
			if (i % 15 == 0) {
				a[k] = "FizzBuzz";

			} else if (i % 3 == 0) {
				a[k] = "Fizz";
			} else if (i % 5 == 0) {
				a[k] = "Buzz";
			} else {
				a[k] = String.valueOf(i);
			}
		}
		return a;
	}

}
