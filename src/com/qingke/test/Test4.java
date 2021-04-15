package com.qingke.test;

public class Test4 {
/**
 * 1."="赋值，String会先从起字符串缓冲池去找，若有该值，则直接赋值，没有就新创建一个在赋值，用new赋值是直接创建一个新对象。
 * 2.String类是不可变字符串，StringBuffer类是可变字符串
 * 3.break直接跳出当前循环，continue跳过本次循环，直接进行下一次循环
 * 
 * 5.Arrays类是数组的工具类，有很多静态方法提供：toString（）返回指定数组内容的字符串表示形式，equals（）如果两个数组相等，则返回true
 * 6.Overload是重载，表示在同一个类中，有相同的方法名，不同的参数个数或有不同的参数类型。
 * Override是覆写，发生在子类与父类中，子类有与父类一样的方法名，并且参数个数，类型都一样。
 *  Overloaded的方法是可以改变返回值的类型。
 * 7.1 Class A： a=11   d=2.0
 * 7.2 Class A： a=11   d=2.0
 * 		
 * 8.1.关键词abstract加在类声明的前面，把一个类变成了抽象类，抽象类不能被实例化。
     2.抽象类通常有抽象方法，抽象方法没有方法体。
     3.抽象方法必须在子类中实现。
         作用：把一系列具有公共方法的类抽象出来放在一个抽象类中，抽象类往往作为父类
         
 * 9.final的用法：加在变量前面成为常量，加在方法前面表示方法不能被override，加在类前面表示类不能被继承。
 * 10.eauals方法默认比较两个引用值，hashCode用来返回引用的内地址的十六进制数。若两个对象的equals方法是true，则
 * hashCode也是相同，若两个对象的equals是false，则hashCode可能相同，也可能不同。
 * 11.throw用来在方法体内抛出异常，而throws用来在方法声明处声明异常。
 * 若果方法中使用了throw关键字跑出了异常，要么用try/catch捕获，要么	用throws声明。
 * 
 * 12.List元素是有序的，可以根据索引值返回集合元素。Set内的元素不能重复。
 * 13.Collection是接口的名字，Collections是一个类的名字，是集合的工具类，用来操作集合和对象
 * 14.多态是overlode和override
 * 15.byte 字节型   8位
 * 	  short 短整型   16位
 *    int  整型   32位
 *    long 长整型  64位、
 *    float 单精度浮点型  32位
 *    double 双精度浮点型   64位
 *    char  字符型    16位
 *    boolean  布尔类型   true和false
 *    
 * 16.面向对象的特征:继承，多态，封装
 * 继承：子类继承父类，获得父类的属性和方法
 * 多态:Overload是重载，表示在同一个类中，有相同的方法名，不同的参数个数或有不同的参数类型。
 * Override是覆写，发生在子类与父类中，子类有与父类一样的方法名，并且参数个数，类型都一样。
 * 封装:把自己的数数据封装起来，防止对数据的随意访问和修改，规范对数据的操作
 * 17.public表示公共类型，都能访问到
 * pratected表示保护类型，只有在同一个包中能访问，或者子类能访问、
 * 默认default 表示默认， 只能在同一个包下能访问
 * private 私有类型，   只有本类能访问
 * 19.try用来包含可能发生异常的语句，catch用来捕获异常，finally用来包含必须执行的语句。
 * 20.true
 * 
 */
	/**
	 * 4.
	 * @param args
	 */
	public static void main(String[] args) {
		String[] a =new String[]{"1","2","3","4","5"};
		for(String s:a){
			System.out.println(s);
		}
		int b=1,c=2,d=5,count=0;
		for(int i=0;i<100;i++){
			for(int j=0;j<50;j++){
				for(int k=0;k<20;k++){
					if(i*b+j*c+k*d==100){
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
	}
	
	
}
