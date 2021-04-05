package qingke;


import java.util.Arrays;


public class ChallengeDay4 {

	public static void main(String[] args) {
		String[] arr = { "JQ", "make", "o", "JQasd" };
		System.out.println(Arrays.toString(deljq(arr)));
		String s[][]=sep(arr);
		
		System.out.println(Arrays.deepToString(s));
		System.out.println(Arrays.deepToString(reverse(s)));
	}

	public static String[] deljq(String[] nums){
		for(int i=0;i<nums.length;i++){
			if(nums[i].contains("JQ")){
				nums[i]="";
			}
		}
		return nums;

	}
	public static String[][] sep(String[] nums){
		String[][] a;
		if(nums.length%2==0){
			a =new String[nums.length/2][2];
			int l =0;
			for(int i=0;i<a.length;i++){
				for(int j=0;j<2;j++){
					a[i][j]=nums[l];
					l++;
				}
			}
		}else{
			a =new String[nums.length/2+1][2];
			int l =0;
			for(int i=0;i<a.length-1;i++){
				for(int j=0;j<2;j++){
					a[i][j]=nums[l];
					l++;
				}
			}
			a[a.length-1][0]=nums[l];
			a[a.length-1][1]="";
		}
		return a;
		
	}
	public static String[][] reverse(String[][] nums){
		String temp;
		int l=nums.length;
		for(int i=0;i<l;i++){
			temp=nums[i][0];
			nums[i][0]=nums[i][1];
			nums[i][1]=temp;
		}
		String[] a;
		for(int i=0;i<l/2;i++){
			a=nums[i];
			nums[i]=nums[l-1-i];
			nums[l-1-i]=a;
		}
		return nums;
	}
	
}
