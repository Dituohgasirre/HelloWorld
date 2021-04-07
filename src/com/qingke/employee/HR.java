package com.qingke.employee;

import java.util.ArrayList;



public class HR {
	private ArrayList<Employee> list;
	public static String[] names={"刘一","陈二","张三","李四","王五","赵六","孙七","周八","吴九","郑十","刘十一","陈十二","张十三","李十四","王十五","赵十六","孙十七","周十八","吴十九","郑二十"};
	public static String[] ids={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
	public static double[] salarys={1234,2000,2000,3500,3501,4000,4000,4000,2000,3501,8000,8000,8000,9000,8520,6842,1203,9551,3501,5689};
	
	
	public HR(){
		for(int i=0;i<20;i++){
			list.add(new Employee(names[i],ids[i],salarys[i]));
		}
	}
	public ArrayList<Employee> getEmployees(){
		return list;
	}
	public Employee getTopSalaryEmployee(){
		double max =0;
		int index=0 ;
		for(int i=0;i<salarys.length;i++){
			if(salarys[i]>max){
				max=salarys[i];
				index =i;
			}
		}
		return list.get(index);
		
	}
	public ArrayList<Employee> getTop10SalaryEmployees(){
		
	}
}
