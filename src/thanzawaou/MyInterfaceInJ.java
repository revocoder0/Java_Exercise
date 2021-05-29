package thanzawaou;
interface InterfaceInJava{
	public void MethodThree();
	public void Loop();
}
public class MyInterfaceInJ implements InterfaceInJava{
	@Override
	public void MethodThree() {
		System.out.println("This is InterFace in Java");
	}
	@Override
	public void Loop() {
		System.out.println("This is InterFace in Loop!");
	}

	public static void main(String[] args) {
		InterfaceInJava my=new MyInterfaceInJ();
		my.MethodThree();
		my.Loop();
	}
}
