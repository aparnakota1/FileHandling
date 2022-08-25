package p1;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) {
		File myFile = new File("C:\\Users\\aparn\\eclipse-workspace\\FileHandling\\data1.txt");
		try {
			if(myFile.createNewFile()) {
				System.out.println("File created successfully");
			}
			else {
				System.out.println("File creation error");
			}
		} catch (IOException ex) {
			System.out.println("File error");
		}
	}
}
