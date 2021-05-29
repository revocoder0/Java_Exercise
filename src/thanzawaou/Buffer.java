package thanzawaou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) throws IOException {
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		System.out.println("Enter your Name:");
		String name=br.readLine();
		
		System.out.println("Welcome to "+ name+"!");
	}

}
