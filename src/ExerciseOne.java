import java.util.Scanner;

public class ExerciseOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Fahrenheit Degree : ");
		double fahrenheit = scanner.nextInt();
		
		double celsius =(((fahrenheit - 32)*5)/9);
		System.out.println(fahrenheit + "degree F is :" + celsius + "in Celsius ");
		
	}

}
