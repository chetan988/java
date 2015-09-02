package filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileLocation = "/home/chetan/study/java/test.txt";
		// create a file object
		File filename = new File(fileLocation);
		// read the file object
		Scanner in = new Scanner(filename);
		int count = 1;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count +" : "+line);
			count++;
		}
		
		// if we will read the first number in the file using nextInt() it will only read the number
		// but there skip the "\n" or "\r" which will be picked up by next nextLine()
				
		in.close();
		System.out.println("===============\nreading int firsrt the line\n===============\n");
		Scanner in2 = new Scanner(filename);
		count = 1;
		int linetoread = in2.nextInt();
		System.out.println(count + " : "+ linetoread);
		count++;
		while (in2.hasNextLine()) {
			String line = in2.nextLine();
			System.out.println(count +" : "+line);
			count++;
		}
		in2.close();
		System.out.println("after reading 10 by nextInt , nextLine pick up the newline\nresolving the issue bu dummy nextLine");
		
		Scanner in3 = new Scanner(filename);
		count = 1;
		linetoread = in3.nextInt();
		System.out.println(count + " : "+ linetoread);
		count++;
		in3.nextLine(); // dummy read
		while (in3.hasNextLine()) {
			String line = in3.nextLine();
			System.out.println(count +" : "+line);
			count++;
		}
		in3.close();

	}

}
