package thanzawaou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumInBuffer {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		
		System.out.println("Enter first Num");
		String Numone=br.readLine();
		int firstNum=Integer.parseInt(Numone);
		
		System.out.println("Enter second Num");
		String Numtwo=br.readLine();
		int secondNum=Integer.parseInt(Numtwo);
		int sum=firstNum+secondNum;
		System.out.println("The Sum of Two Numbers : " +sum);
	}

}
