import java.util.Scanner;


public class simpleScan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a new scanner object
		Scanner getInput = new Scanner(System.in);
		
		// prompt to enter a text
		System.out.println("Enter the name: ");
		
		// get the input from input stream buffer
		String name = getInput.nextLine();  // nextLine is to read string
		 // greet :)
		System.out.println("Congrats " + name + ", you have successfully read the input");
		
		// now get two input
		System.out.println("Enter two number : ");
		int x = getInput.nextInt();
		int y = getInput.nextInt();
		int sum = x+y;
		
		System.out.println("you have entered : "+ x + " " +  y + "  sum = " + sum );
	}

}
