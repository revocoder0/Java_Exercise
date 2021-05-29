package thanzawaou;

import java.io.FileInputStream;
import java.io.InputStream;

public class TextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream input=new FileInputStream("text.txt");
			System.out.println("Data in the file");
			
			int i =input.read();
			while(i!=1) {
				System.out.print((char)i);
				i=input.read();
			}
		}catch(Exception e){
			e.getStackTrace();
		}
	}

}
