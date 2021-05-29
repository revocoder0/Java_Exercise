import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,rev=0,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number!");
		n=sc.nextInt();
		while(n!=0) {
			a=n%10;
			rev=(rev*10)+a;
			n=n/10;
		}
		System.out.print("reverse of a number is "+rev);

	}

}
