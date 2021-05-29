import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {
		
		  double minuteYear= 60 * 24 *365;//This is formula for Minuter In Year

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of minutes: ");

	        double min = scanner.nextDouble();

	        long years = (long) (min / minuteYear);
	        int days = (int) (min / 60 / 24) % 365;

	        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");


	}

}
