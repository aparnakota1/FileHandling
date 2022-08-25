package p1;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {
		String data = "This data is appended..";
		
		try {
			FileWriter output = new FileWriter("data1.txt",true);
			output.write(data);
			System.out.println("File appended successfully");
			output.close();
		} catch (IOException ex) {
			System.out.println("File Append Error...");		
		}
	}
}
