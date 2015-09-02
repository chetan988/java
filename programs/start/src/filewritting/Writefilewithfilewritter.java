package filewritting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writefilewithfilewritter {
	public static void write(String filename){
		File file = new File(filename);
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write("line 1");
			br.newLine();
			br.write("line 2");
			br.newLine();
			br.write("line 3");
		} catch (IOException e) {
			System.out.println("Error while writting file :" + file.toString());
		}
		System.out.println("File successfully written");
	}
	
	public static void main(String[] args) {
		
		String filename = "/home/chetan/study/java/testwrite.txt";
		write(filename);
	}
}
