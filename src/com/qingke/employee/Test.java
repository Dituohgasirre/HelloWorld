package com.qingke.employee;

import java.awt.List;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		// ArrayList<Employee> list = new ArrayList<>();
		// list.add(new Employee());
		// list.add(new Employee());
		// list.add(new Employee());
		// hr.setList(list);
		for (Employee e : hr.getTop10SalaryEmployees()) {
			System.out.println(e);

		}
		System.out.println("-------------------");
		for (Employee e : hr.resignEmployee("10")) {
			System.out.println(e);
		}
		hr.salaryDistribution(HR.salarys);
	}

}
