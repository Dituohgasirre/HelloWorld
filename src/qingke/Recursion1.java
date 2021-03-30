package qingke;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int factorial(int n) {
		  if(n==1){
		    return 1;
		  }else{
		    return n*factorial(n-1);
		  }
		  
		}
	public int bunnyEars(int bunnies) {
		 if(bunnies==0){
		   return 0;
		 }
		  else{
		    return 2+bunnyEars(bunnies-1);
		  }
		}
	public int fibonacci(int n) {
		  if(n==0){
			  return 0;
		  }
		  if(n==1){
			  return 1;
		  }else{
			  return  fibonacci(n-1)+ fibonacci(n-2);
		  }
		  
	}
	public int bunnyEars2(int bunnies) {
		  if(bunnies==0){
		    return 0;
		  }
		 
		 
		  if(bunnies%2==0){
		    return bunnyEars2(bunnies-1)+3;
		  }
		  else{
		    return  bunnyEars2(bunnies-1)+2;
		  }
		 
		}
	public int triangle(int rows) {
		  if(rows==0){
			  return 0;
		  }
		  if(rows==1){
			  return 1;
		  }else{
			  return triangle(rows-1)+rows;
		  }
	}



}
