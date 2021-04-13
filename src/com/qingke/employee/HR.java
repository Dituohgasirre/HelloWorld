package com.qingke.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class HR extends Employee{
	private ArrayList<Employee> list=new ArrayList<Employee>();
	public static String[] names={"刘一","陈二","张三","李四","王五","赵六","孙七","周八","吴九","郑十","刘十一","陈十二","张十三","李十四","王十五","赵十六","孙十七","周十八","吴十九","郑二十"};
	public static String[] ids={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
	public static double[] salarys={1234,2000,2000,3500,3501,4000,4000,4000,2000,3501,8000,8000,8000,9000,8520,6842,1203,9551,3501,5689};
	
	public HR(String name,String id,double salary,ArrayList<Employee> employees){
//		list.add(new Employee("阿桑","43",6754));
//		list.add(new Employee("阿三","23",2525));
		super(name,id,salary);
		this.list = employees;
	}
	public HR(String name,String id,double salary){
		super(name,id,salary);
	}
	public HR(){
		for(int i=0;i<20;i++){
			list.add(new Employee(names[i],ids[i],salarys[i]));
		}
	}
	public ArrayList<Employee> getList() {
		return list;
	}
	public void setList(ArrayList<Employee> list) {
		this.list = list;
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
	public List<Employee> getTop10SalaryEmployees(){
		Collections.sort(list,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
		});
		return  list.subList(10, 20);
	}
	public List<Employee> enrollEmployee(String name,String id,double salary){
		list.add(new Employee(name,id,salary));
		return list;
	}
	public List<Employee> resignEmployee(String EmployeID){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getId().equals(EmployeID)){
				list.remove(i);
			}
		}
		return list;
	}
	public void salaryDistribution(double[] str){
		Map<Double,Integer> map =new HashMap<Double,Integer>();
		for(int i=0;i<str.length;i++){
			int count =0;
			for(int j=0;j<str.length;j++){
				if(str[i]==str[j]){
					count++;
				}
			}
			map.put(str[i], count);
		}
		for(Map.Entry<Double,Integer> entry : map.entrySet()){
			System.out.println("工资"+entry.getKey()+"的有"+entry.getValue()+"人");
		}
	}
}
