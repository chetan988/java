package filereading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readusingfilereader {
	public void readfile(String filename) {
		File file = new File(filename);
		BufferedReader br = null;  // initialize the buffer reader to stop error of uninitialize br in finally block
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			int count =1;
			while ((line = br.readLine()) != null) {
				System.out.println(count + " : " + line );
				count++;
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("could not open file : "+ file.toString());
		} catch (IOException e) {
			System.out.println("can not open file :" + file.toString());
		}
		finally {
			try {
				br.close();
			}
			catch (IOException e) {
				System.out.println("can not close file :" + file.toString());
			}
			catch (NullPointerException e) {
				// if an file not found error occure control will come here so ignore silently
			}
			catch (Exception e) {
				// some other error occured show the stacktress
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Readusingfilereader readfile = new Readusingfilereader();
		String fileLocation = "/home/chetan/study/java/test.txt";
		readfile.readfile(fileLocation);
	}
}
