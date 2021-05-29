package Exercise;
class Test{
	int a,b;
	Test(){
		System.out.println("I am form default Constructor.");
		a=20;
		b=30;
		System.out.println("The Value of a "+a);
		System.out.println("The Value of b "+b);
	}
}
class TestDemo {

	public static void main(String[] args) {
		Test t=new Test();

	}

}
