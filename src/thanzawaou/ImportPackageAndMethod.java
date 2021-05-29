package thanzawaou;
import Relesson.InheritanceJava;

import java.io.IOException;

import Exercise.FileRead;
public class ImportPackageAndMethod {

	public static void main(String[]args) {
		InheritanceJava inher=new InheritanceJava();
		FileRead fr=new FileRead();
		try {
			fr.main(args);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inher.main(args);
	}
}
