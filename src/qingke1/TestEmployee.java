package qingke1;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee =new Employee(2,"cd","w",20);
		System.out.println(employee.getName());
		System.out.println(employee.getAnnualSalary());
		System.out.println(employee.getSalary());
		System.out.println(employee.raiseSalary(20));
		System.out.println(employee.getSalary());
		System.out.println(employee.toString());
		
	}

}
