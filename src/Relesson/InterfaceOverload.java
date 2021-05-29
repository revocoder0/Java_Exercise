package Relesson;
class Addation{
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int add(int a, int b, int c) {
		int sum=a+b+c;
		return sum;
	}
}
public class InterfaceOverload {

	public static void main(String[] args) {
		Addation obj=new Addation();
		int sumOne=obj.add(1, 2);
		System.out.println("The Sum of two integer value is :"+sumOne);
		int sumTwo=obj.add(1,2, 3);
		System.out.println("The Sum of three integer value is :"+sumTwo);

	}

}
