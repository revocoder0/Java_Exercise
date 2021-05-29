package thanzawaou;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to be Fibonacci Series");
		int n=scan.nextInt();
		int x=0,y=1;
		System.out.println("Fibonacci Series till " + n + " terms:");
		for(int i=1;i<=n;i++) {
			System.out.print(x+", ");
			int z=x+y;
			x=y;
			y=z;
		}

	}

}
