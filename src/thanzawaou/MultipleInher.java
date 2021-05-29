package thanzawaou;
interface One{
	public void Method();
}
interface Two{
	public void Method();
}
public class MultipleInher implements One, Two {
	@Override
	public void Method() {
		System.out.println("Implemention of Method");	
	}
	public static void main(String[] args) {
		MultipleInher mu=new MultipleInher();
		mu.Method();
	}
}
