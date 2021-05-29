import java.util.Scanner;

public class ExerciseSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Side One: ");
		int sideone=scanner.nextInt();
		System.out.println("Enter Side Two: ");
		int sidetwo=scanner.nextInt();
		System.out.println("Enter Side Three: ");
		int sidethree=scanner.nextInt();
		
		System.out.print("Is the said sides form a triangle: "+ validTriangle(sideone, sidetwo,sidethree));

	}
	public static boolean validTriangle(int a, int b, int c) {
		return (a+b >c && b+c>a && a+c>b);
	}
}
