package qingke;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args){
		System.out.println("游戏规则是");
		int answer = getRandomNumber();
		System.out.println("请输入1-100间的一个整数");
		Scanner input  = new Scanner(System.in);
		int max =10;
		int counter =0;
		do{
			counter = counter +1;
			
			int guess = input.nextInt();
			if(guess==answer){System.out.println("对");break;}
			else if (guess>answer){System.out.println("大了");}
			else {System.out.println("小了");};
			if(counter==max){
				System.out.println("猜测失败！");
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
