package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

class throwExp {
	public void input() throws IOException,FileNotFoundException, ParseException,IndexOutOfBoundsException{
		Scanner in = new Scanner (System.in);
		System.out.println("1. to throw io exception\n2.to throw filenotfound exception\n3. to throw parserexception\n4.array index outexception\n enter your choice :");
		int choice = in.nextInt();
		in.close();
		if(choice == 1) {
			throw new IOException();
		}
		else if(choice == 2){
			throw new FileNotFoundException();
		}
		else if(choice ==3){
			throw new ParseException("wrong description",5);
		}
		else {
			throw new IndexOutOfBoundsException();
		}

	}
}

public class demo4 {
	public static void main(String[] args) {
		throwExp te = new throwExp();
		try {
			te.input();
		} catch (Exception e) {
			System.out.println("some exception found");
			e.printStackTrace();
		} 
	}
}
