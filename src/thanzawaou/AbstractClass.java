package thanzawaou;
abstract class Display{
	public void dis() {
		System.out.println("Concrete method of parents class");
	}
	abstract public void disOne();
}
public class AbstractClass extends Display{
	@Override
	public void disOne() {
		System.out.println("Overriding Abstract Method/");
	}
	public static void main(String[] args) {
		AbstractClass ac=new AbstractClass();
		ac.disOne();
		ac.dis();
	}
}
