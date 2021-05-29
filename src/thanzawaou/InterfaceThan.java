package thanzawaou;
interface myInterface{
	public void method1();
	public void method2();
}
public class InterfaceThan implements myInterface{
	@Override
	public void method1() {
		System.out.println("This is implements method one.");
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is implements method two.");
	}
	public static void main(String[] args) {
		myInterface obj=new InterfaceThan();
		obj.method1();
		obj.method2();
	}
}
