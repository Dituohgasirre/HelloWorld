package qingke;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args){
		System.out.println("��Ϸ������");
		int answer = getRandomNumber();
		System.out.println("������1-100���һ������");
		Scanner input  = new Scanner(System.in);
		int max =10;
		int counter =0;
		do{
			counter = counter +1;
			
			int guess = input.nextInt();
			if(guess==answer){System.out.println("��");break;}
			else if (guess>answer){System.out.println("����");}
			else {System.out.println("С��");};
			if(counter==max){
				System.out.println("�²�ʧ�ܣ�");
			}
		}while(true);
		input.close();
		
	}
	public static int getRandomNumber(){
		Random random = new Random();
		int randNum = random.nextInt(100)+1;
		return randNum;
	}
	
}
