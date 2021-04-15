package com.qingke.test;

class A {
	int a =11;
	double d=2.0;
	void display(){
		System.out.println("Class A: a="+a+"\td="+d);
	}
}
public class B extends A{
	float a=3.0f;
	String d="Java Program.";
	void display(){
		super.display();
		System.out.println("Class B: a="+a+"\td="+d);
	}
	public static void main(String[] args) {
		A b = new B();
		b.display();
	}
 }
 