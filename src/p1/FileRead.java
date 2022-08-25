package p1;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		char[] data = new char[24];
		
		try {
			FileReader input = new FileReader("data1.txt");
			input.read(data);
			System.out.println("Data received from a file.");
			System.out.println(data);
			input.close();
		} catch (IOException ex) {
			System.out.println("File Read Error...");		
		}
	}
}
