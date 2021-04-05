package qingke;


import java.util.Arrays;


public class ChallengeDay4 {

	public static void main(String[] args) {
		String[] arr = { "","f","","f","a","ss","b","JQ","b","fv","a","ss"};
		System.out.println(Arrays.toString(deljq(arr)));
		String s[][]=sep(arr);
		
		System.out.println(Arrays.deepToString(s));
		String a[][]=reverse(s);
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(delrep(a)));
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
	public static String[][] delrep(String[][] nums){
		String[][] arr =nums;
		for(int i=0;i<nums.length;i++){
			arr[i]=nums[i];
		}
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<nums.length;k++){
					for(int l=0;l<2;l++){
						if(!(i==k&&j==l)&&arr[i][j]==nums[k][l]){
							arr[k][l]=null;
						}
					}
				}
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i][0]==null&&arr[i][1]==null){
				count++;
			}
		}
		String[][] newArr =new String[arr.length-count][];
		for(int i=0,j=0;i<arr.length;i++){
			if(arr[i][0]!=null&&arr[i][1]!=null){
				newArr[j]=arr[i];
				j++;
			}else if(arr[i][0]!=null){
				newArr[j]=new String[]{arr[i][0]};
				j++;
			}else if(arr[i][1]!=null){
				newArr[j]=new String[]{arr[i][1]};
				j++;
			}
		}
		return newArr;
	}
	
	
}
