package thanzawaou;

import java.util.Scanner;

public class CalculatorInSwift {

	public static void main(String[] args) {
		char operator;
		double num1, num2, result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose an operator : + , - , * , / ");
		operator=scan.next().charAt(0);
		
		System.out.println("Enter first number");
		num1=scan.nextDouble();
		System.out.println("Enter second number");
		num2=scan.nextDouble();
		
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println(num1+ " + "+num2 +" = "+result );
		break;
		
		case '-':
			result=num1+num2;
			System.out.println(num1+ " - "+num2 +" = "+result );
		break;
		
		case '*':
			result=num1+num2;
			System.out.println(num1+ " * "+num2 +" = "+result );
		break;
		
		case '/':
			result=num1+num2;
			System.out.println(num1+ " / "+num2 +" = "+result );
		break;
		
		default:
			System.out.println("Invalid Operator");
		break;
		}
		scan.close();
	}

}
