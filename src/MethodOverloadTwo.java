
public class MethodOverloadTwo {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MethodOverloadTwo obj = new MethodOverloadTwo();
		obj.sum(10, 20);
		obj.sum(10.05, 15.20);
	}

}