package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("test.txt");
			System.out.println("If this block get executed then exception did not happened");
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception occured for file test.txt");
			e.printStackTrace();
		}
		System.out.println("This block will execute if catch did not exit");
	}

}
