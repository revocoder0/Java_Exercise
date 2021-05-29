import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter inches ");
		Double inchers=scanner.nextDouble();
		Double meters = inchers *0.0254;
		
		System.out.println(inchers +" is "+meters+" meters.");
	}

}
