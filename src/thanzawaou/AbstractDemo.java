package thanzawaou;
abstract class AbstractDe{
	abstract public void Method();
	public void MyMethod() {
		System.out.println("Hello Abstract Class");
	}
}
public class AbstractDemo extends AbstractDe{
	@Override
	public void Method() {
		System.out.println("Abstract Method");
		
	}
	public static void main(String[] args) {
		AbstractDemo ab=new AbstractDemo();
		ab.MyMethod();
		ab.Method();

	}
}
