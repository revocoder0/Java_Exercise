package Relesson;
abstract class AnimalDog{
	public abstract void sound();
}
public class AbstractionThan extends AnimalDog {

	public static void main(String[] args) {
		AnimalDog obj=new AbstractionThan();
		obj.sound();
	}
	@Override
	public void sound() {
		System.out.println("The sound of dog is :Wooffff");
	}

}
