package thanzawaou;
interface MyInt{
	public void MethodOne();
	public void MethodTwo();
}
public class Int implements MyInt{
	@Override
	public void MethodOne() {
		System.out.println("This is Method OverRide one!");
	}

	@Override
	public void MethodTwo() {
		System.out.println("This is Method OverRide Two!");
		
	}

	public static void main(String[] args) {
		MyInt mint=new Int();
		mint.MethodOne();
		mint.MethodTwo();
	}
}
