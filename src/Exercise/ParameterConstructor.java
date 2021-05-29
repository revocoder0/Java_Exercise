package Exercise;
class Model{
	int a,b;
	Model(int in1, int in2){
		System.out.println("I am from parameter Constructor.");
		a=in1;
		b=in2;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
}
 class ParameterConstructor {

	public static void main(String[] args) {
		Model tq = new Model(10, 20);

	}

}
