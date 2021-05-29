class walking {
	void walk() {
		System.out.println("Man walking fastly");
	}
}

class Man extends walking {
	void walk() {
		System.out.println("Man walking slowly");
	}
}

public class MethodOverridingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man obj = new Man(); 
		 obj.walk();
	}

}
