/*
Program name: ScannerDemo5.java
Purpose: Shows the use of nextLine() to do a manual buffer flush after some rude house guest methods nextint() and nextDouble() are used.
Coder: Ygor Rezende
Date: Thur Sept 24, 2020
*/
import java.util.Scanner; //tells the Java interpreter to get this code form the Java Library
public class ScannerDemo5
{
	public static void main(String[]args)//the front door
	{
		//step 1: create a Scanner object
		Scanner input = new Scanner(System.in); //'new' means we are building an object
		
		//step 2: prompt the user to enter something
		System.out.print("Enter your age and press Enter: ");
		
		//step 3: read the keyboard buffer and assign the value found there to a String variable
		int age = input.nextInt();//WARNING! Rude house guest! Does not Flush. (Read digits)
		
		//step3A: manual flush the buffer because nextInt()
		input.nextLine();
		
		//step 4: prompt for name
		System.out.print("Enter your full Name and press Enter: ");
		String name = input.nextLine();
		
		//Step 5: Output the text to the screen
		System.out.println("Hello there " +name);
		System.out.println("Your age is " + age);
	}//end main
}//end class