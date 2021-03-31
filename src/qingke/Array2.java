package qingke;

import java.util.Arrays;

public class Array2 {
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

	public int sum67(int[] nums) {
		int s = 0;
		if (nums.length == 0) {
			return 0;
		} else {
			for (int i=0;i<nums.length;i++) {
				s += nums[i];
			}

			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 6) {
					for (int j = i; j < nums.length; j++) {
						s = s - nums[j];
						if (nums[j] == 7) {
							break;
						}
					}
				}
			}

		}
		return s;
	}

}
