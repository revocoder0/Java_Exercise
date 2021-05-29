package Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
	String data="When I was young, I want to be a businessman. But, I am revolution Soldier now.";
	String filename="mine.txt";
	public static void main(String[] args) throws IOException {
//		new FileRead().toWrite();
		new FileRead().toRead();

	}
	public void toWrite() throws IOException {
		File file=new File(filename);
		FileWriter fw=new FileWriter(file, true);
		fw.append("When 2019, I joined to the Arakan Army. And then, I became a Soldier.");
		fw.close();
	}
	public void toRead() throws IOException {
		File file=new File(filename);
		FileReader fr=new FileReader(file);
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}
	}

}
