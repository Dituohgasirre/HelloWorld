package qingke;

import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int max = Integer.parseInt(input.nextLine());
		for(int i=0;i<=max;i++){
			if(i%3==0 && i%5==0){
				System.out.println("����");
				
			}
			else if(i%3==0){
				System.out.println("С��");
			}
			else if(i%5==0){
				System.out.println("С��");
			}
			else{
				System.out.println(i);
			}
		}
		input.close();
	}
}