package qingke;

public class Array3 {
	public int maxSpan(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}
		int max = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j > i; j--) {
				if (nums[i] == nums[j]) {
					max = Math.max(max, j - i + 1);
				}
			}
		}
		return max;
	}

	public int[] fix34(int[] nums) {
		int len = nums.length;
		int a = 0;
		int b = 0;
		for (int i = 0; i < len - 1; i++) {
			if (nums[i] == 3) {
				a = i;
				for (int j = b; j < len; j++) {
					if (nums[j] == 4) {
						b = j;
						int temp = nums[b];
						nums[b] = nums[a + 1];
						nums[a + 1] = temp;
					}
				}
			}
		}
		return nums;
	}

	public int[] fix45(int[] nums) {
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				a[i] = 4;
				a[i + 1] = 5;
				i++;
			} else {
				a[i] = 0;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (a[i] == 0) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[j] != 4 && nums[j] != 5) {
						a[i] = nums[j];
						break;
					}
				}
			}
		}
		return a;
	}

	public boolean canBalance(int[] nums) {
		if (nums.length == 0) {
			return true;
		}
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		if (sum % 2 == 1) {
			return false;
		}
		int left = 0;
		for (int i : nums) {
			left += i;
			if (left == sum / 2) {
				return true;
			}
		}
		return false;
	}

	public boolean linearIn(int[] outer, int[] inner) {
		if (inner.length == 0) {
			return true;
		}

		for (int i = 0; i < inner.length; i++) {
			boolean t = false;
			for (int j = 0; j < outer.length; j++) {
				if (inner[i] == outer[j]) {
					t = true;
					break;

				}
			}
			if (!t) {
				return false;
			}
			
		}
		return true;

	}
	public int[] squareUp(int n) {
		  int[] a =new int[n*n];
		  for(int i=0;i<a.length;i++){
			  a[i]=0;
		  }
		  for(int i=0;i<n;i++){
			  for(int j=n-1;j>n-i-2;j--){
				  a[i*n+j]=n-j;
			  }
		  }
		  return a;
	}
	public int[] seriesUp(int n) {
		  int[] a=new int[n*(n+1)/2];
		  int start =1;
		  for(int i=0,j=1;i<a.length;i++){
			  a[i]=j;
			  j++;
			  if(j>start){
				  j=1;
				  start++;
			  }
		  }
		  return a;
	}
	public  int maxMirror(int[] nums){
		if(nums.length<2)
			return nums.length;
		int[] arr = new int[nums.length];
		for(int i=0;i<arr.length;i++)
			arr[i]=nums[nums.length-1-i];
		int max=0;
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<arr.length;j++){
				if(nums[i]==arr[j]){
					int count=0;
					for(int k=0;k<nums.length-Math.max(i,j);k++){
						if(nums[i+k]==arr[j+k])
							count++;
						else
							break;
					}
					max=Math.max(max,count);
				}
			}
		}
		return max;
	}
	public  int countClumps(int[] nums){
		if(nums.length<2)
			return 0;
		int count=0;
		boolean isCount=true;
		for(int i=1;i<nums.length;i++){
			if(nums[i-1]==nums[i]){
				if(isCount){
					count++;
					isCount=false;
				}
			}
			else
				isCount=true;
		}
		return count;
	
}




}
