package qingke;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int[] array = new int [5];
		Scanner sc = new Scanner(System.in);
		int max =0;
		for(int i=0;i<array.length;i++){
			int input = sc.nextInt();
			array[i]= input;
		}
		for(int i=0;i<array.length;i++){
			if(max<array[i]){
				max = array[i];
			}
		}
		sc.close();
		System.out.println(max);
	}
	

}
