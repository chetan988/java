package filereading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfilewithresourse {
	public static void readfile(String filename) {
		File file = new File(filename);
		
		// this only works in java 7
		// internally it calls close of br and we just need to handle the exceptions
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			int count =1;
			while ((line = br.readLine()) != null) {
				System.out.println(count + " : " + line );
				count++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not open file: " + file.toString());
		} catch (IOException e) {
			System.out.println("Could not read file : "+ file.toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileLocation = "/home/chetan/study/java/test.txt";
		readfile(fileLocation);
	}

}
