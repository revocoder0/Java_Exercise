package Relesson;

public class Employee {
	public String name;
	private double salary;
	
	public Employee(String empName) {
		name=empName;
	}
	public void setSalary(double empSal) {
		salary =empSal;
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee("Kyaw Soe Hla");
		emp.setSalary(100000);
		System.out.println(emp.name);
		System.out.println(emp.salary);
		
	}

}
