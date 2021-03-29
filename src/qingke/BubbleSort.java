package qingke;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int[] a ={1,2,34,5,34,2,567,77,56};
		sort(a);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a){
		int temp =0;
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j+1]<a[j]){
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
