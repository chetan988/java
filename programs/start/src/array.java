

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr;
		arr = new int[4];
		System.out.println("arr without initialization contain "+ arr[0] );
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		for(int i=0; i<4;i++)
			System.out.println(i +"th element = " + arr[i] );
		
		// declaring array on the fly
		
		int[] arr2 = new int[4];
		arr2[0] = 50;
		arr2[1] = 60;
		arr2[2] = 70;
		arr2[3] = 80;
		System.out.println("==============\narray 2\n==================");
		// array_name.lenght gives array length
		for(int i=0; i<arr2.length;i++)
			System.out.println(i +"th element = " + arr2[i] );
		
		// array declare and initialize on the fly
		
		int[] arr3 = {90,100,110};
		System.out.println("==============\narray 3\n==================");
		// array_name.lenght gives array length
		for(int i=0; i<arr3.length;i++)
			System.out.println(i +"th element = " + arr3[i] );
		
		// now we will see string array
		
		String[] names = new String[2];
		names[0] = "chetan";
		names[1] = "das";
		
		for(int i=0;i<names.length;i++)
			System.out.print(names[i] + "  " );
		System.out.println("welcomes you!!");
		
		
		String[] animals = {"cow","dog","cat","elephant"};
		for(String animal : animals)
			System.out.println(animal);

		
		// multidimentional array
		// we can define variable length of array
		int[][] val = {
				{ 1,2,3},
				{5,6},
				{8,9,10,11}
		};
		
		for(int row = 0; row < val.length; row++) {
			for(int col =0; col < val[row].length;col++)
				System.out.print(val[row][col] + " ");
			System.out.println();
		}
		
		// we can create 2d array with fixed length
		Scanner ip = new Scanner(System.in);
		String[][] names = new String[3][3];
		for(int row = 0; row < names.length; row++) {
			String pos = new String();
			if(row == 0)
				 pos="first";
			else if (row == 1)
				 pos = "second";
			else
				 pos="third";
			System.out.println("Enter " + pos + " name:-");
			for(int col =0; col < names[row].length;col++) {
				//String pos = new String();
				if(col == 0)
					 pos="first";
				else if (col == 1)
					 pos = "middle";
				else
					 pos="last";
				System.out.print("Enter the " + pos +" name ");
				names[row][col] = ip.nextLine();
			}
		}
		
		for(int row = 0; row < names.length; row++) {
			for(int col =0; col < names[row].length;col++) {
				String pos = new String();
				System.out.print( names[row][col] +" ");
			}
			System.out.println("welcome to java world");
		}
		
		// two dimention array can be declared like below
	//	Scanner ip = new Scanner(System.in);
		String[][] team = new String[3][];
		for(int row=0;row < team.length;row++) {
			System.out.print("Enter the number of team player: ");
			int member = ip.nextInt();
			team[row] = new String[member];
			for(int col=0;col< team[row].length;col++) {
				System.out.print("Enter "+ (col+1) + "th plyer name: ");
				ip.reset();
					team[row][col] = ip.nextLine();
			}
				
		}
		
		for(int row=0;row<team.length;row++) {
			System.out.println("Detail of team " + (row+1));
			System.out.println("=====================");
			for(int col=0;col<team[row].length;col++)
				System.out.println(team[row][col]);
			System.out.println("======================");
		}
		
	}

}
