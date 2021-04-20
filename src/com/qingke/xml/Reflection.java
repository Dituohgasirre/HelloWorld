package com.qingke.xml;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) {
		Person p =new Person();
		reflect(p);
		
	}
	public static void reflect(Object obj){
		//1.
		Class classType=obj.getClass();
		//2.
		Class classType2 =Person.class;
		//3.
		try {
			Class classType3 = Class.forName("Person");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Field[] fields=classType.getDeclaredFields();
		for(Field f:fields){
			f.setAccessible(true);
			try {
				System.out.println(f.getName()+":"+f.get(obj));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("方法列表");
		
		for(Method m:classType.getMethods()){
			System.out.println(m.getName());
			if("setArea".equals(m.getName())){
				try {
					m.invoke(obj, "wcd");
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
