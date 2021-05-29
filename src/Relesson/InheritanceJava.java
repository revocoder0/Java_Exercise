package Relesson;
import thanzawaou.ImportPackageAndMethod;
class Animal{
	public void eat() {
		System.out.println("Eating........");
	}
	void sleep() {
		System.out.println("Animal sometime sleep.");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Braking......");
	}
	void sleep() {
		System.out.println("Dogs sometime sleep.");
	}
}

public class InheritanceJava {
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(int a,String b) {
		System.out.println(a+b);
	}
	public static void main (String [] bm) {
		InheritanceJava in=new InheritanceJava();
		Dog dog =new Dog();
		in.sum(20,"Than Zaw Aou");
		in.sum(20, 20);
		dog.eat();
		dog.bark();
	}
	public void Callback() {
		System.out.println("This is CallBack Method for ImportPackageAndMethod Class nad thanzawaou");
	}
}
