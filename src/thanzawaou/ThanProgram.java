package thanzawaou;
class Human{
	String name,fatherName,motherName,subject,address;
	int id,age;
	public void callBack(int id,String name, int age, String subject,String fatherName, String motherName, String address) {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Subject is "+subject);
		System.out.println("Father Name is "+fatherName);
		System.out.println("Mother Name is "+motherName);
		System.out.println("Address is "+address);	
	}
}
public class ThanProgram extends Human {
	public static void main(String [] args) {
		Human hu=new Human();
		hu.callBack(021001, "Than Zaw Aou", 20, "Java","U Than","Daw Khin", "PNG");
	}
}
