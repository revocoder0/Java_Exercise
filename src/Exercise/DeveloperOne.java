package Exercise;

class EmployeeOne {
	float salary = 30000;
}

class DeveloperOne extends Employee {
	float bonous = 2000;

	public static void main(String args[]) {
		EmployeeOne obj = new EmployeeOne();
		System.out.println("Salary is:" + obj.salary);
	}
}
