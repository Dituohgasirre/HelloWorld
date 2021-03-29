package qingke;

public class Type {

	public static void main(String[] args) {
		byte a = 1;
		short b = 12;
		int c = 123;
		long d = 1234;
		char e = 'a';
		char s1 = byteTochar(a);
		char s2 =shortTochar(b); 
		char s3 = intTochar(c);
		char s4 = longTochar(d);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	public static char byteTochar(byte a){
		char c = (char)a;
		return c;
	}
	public static char shortTochar(short a){
		char c = (char)a;
		return c;
	}	
	public static char intTochar(int a){
		char c = (char)a;
		return c;
	}
	public static char longTochar(long a){
		char c = (char)a;
		return c;
	}
		
	
	

}
