package com.qingke.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
	}
	public static void demo1(){
		Person p = new Person();
		System.out.println("��3�ֲ�ͬ�ķ������Person��Class����");
		Class c1 = Person.class;
		Class c2 = p.getClass();
		try {
			Class c3 = Class.forName("com.qingke.reflect.Person");
			System.out.println("����һ��Person.class");
			System.out.println("��������p.getClass()");
			System.out.println("��������Class.forName('person')");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void demo2(){
		System.out.println("��3�ֲ�ͬ�ķ������Person�����ʵ��");
		Person p = new Person();
		Class c =p.getClass();
		try {
			c.newInstance();
			c.getConstructors()[0].newInstance();
			c.getConstructors()[1].newInstance("wcd",20);
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void demo3(){
		System.out.println("����get��set����");
		Person p = new Person();
		Class classType =p.getClass();
		
		for(Method m: classType.getMethods()){
			System.out.println(m.getName());
		}
	}
}
