/*
Program name: ScannerDemo3.java
Purpose: Shows the creation of a Scanner Object to read the keyboard buffer
			REVISION: Demontrates the "Scanner Bug", which really is not a bug, it's a feature!
			It shows what happens if you use one of rude house guest methods and then follow by using nextLine method, whichis a polite house guest.
Coder: Ygor Rezende
Date: Thur Sept 24, 2020
*/
import java.util.Scanner; //tells the Java interpreter to get this code form the Java Library
public class ScannerDemo3
{
	public static void main(String[]args)//the front door
	{
		//step 1: create a Scanner object
		Scanner input = new Scanner(System.in); //'new' means we are building an object
		
		//step 2: prompt the user to enter their full name
		System.out.print("Enter your full name and press Enter: ");
		
		//step 3: read the keyboard buffer and assign the value found there to a String variable
		//Here is the source of the problem if we use next() instead of nextLine() to read input with spaces.
		String firstname = input.next();//Rude house guest --- does not Flush!
		
		//step 4: Prompt user to enter their hometown name.
		System.out.println("Enter the name of your hometown and press ENTER: ");
		String hometown = input.nextLine();
		
		//step 5: Output the text to the screen
		System.out.println("Hello there " + firstname);
		System.out.println("Your hometown is " +hometown);
	}//end main
}//end class