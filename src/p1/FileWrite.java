package p1;

import java.io.*;

public class FileWrite {

	public static void main(String[] args) {
		String data = "I am writing this data..";
		
		try {
			FileWriter output = new FileWriter("data1.txt");
			output.write(data);
			System.out.println("Data is written successfully");
			output.close();
			
		} catch(IOException ex) {
			System.out.println("File Write Error...");
		}
	}
}
