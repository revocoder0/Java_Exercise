package thanzawaou;
abstract class Animal{
	public abstract void sound();
}
public class DogAnimal extends Animal{

	@Override
	public void sound() {
		System.out.println("Woof..Wooffffffff");
		
	}
	public static void main(String[] args) {
		Animal an=new DogAnimal();
		an.sound();
		

	}

}
