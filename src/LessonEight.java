import java.util.Scanner;

public class LessonEight {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input a positive number");
		int num =scanner.nextInt();
		System.out.print("Is the said number perfect square? " + checkPrefectSquare(num));

	}
	 public static boolean checkPrefectSquare(int num) {
		 double square=Math.sqrt(num);
		if((square-Math.floor(square))==0) {
			return true;
		}else {
			return false;
		}
		 
	 }

}
