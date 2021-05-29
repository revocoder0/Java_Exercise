
public class EmployeeThan {
	private String EmployeeName;
	private String Address;
	private double Salary;
	
	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.EmployeeName = employeeName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	public static void main(String[] args) {
		EmployeeThan e=new EmployeeThan();
		e.setEmployeeName("Than Zaw Aou");
		System.out.println(e.getEmployeeName());
		e.setAddress("Sittwe");
		System.out.println(e.getAddress());
		e.setSalary(200000);
		System.out.println(e.getSalary());
		
	}

}
