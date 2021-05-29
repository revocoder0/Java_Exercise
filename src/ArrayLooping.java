
public class ArrayLooping {
	public static void main(String[]args) {
		int [] numbers = {10,20,30,40,50};
		for(int x:numbers) {
			System.out.print(x+", ");
		}
		System.out.print("\n");
		String [] names = {"Than Zaw Aou","Nyan Htun Lunn", "Nyi Nyi Naing","Htain Lunn", "U Thein Lwin","Kyaw Soe Hla"};
		for(String name:names) {
			System.out.print(name+" ,");
		}
	}
}
