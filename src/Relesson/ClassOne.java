package Relesson;

public class ClassOne{
	public String greet() {
		return "Hello";
	}
	public String greet(String who) {
		return "Hi "+who;
	}
	public static void main(String []bm) {
		ClassOne g1=new ClassOne();
		System.out.println(g1.greet("Nila"));
		ClassOne g2=new ClassTwo();
		System.out.println(g2.greet("Sann"));
	}
}
class ClassTwo extends ClassOne{
	public String greet() {
		return "Go Away";
	}
}