/*
Program name: ScannerDemo1.java
Purpose: Shows the creation of a Scanner Object to read the keyboard buffer
Coder: Ygor Rezende
Date: Wed Sept 23, 2020
*/
import java.util.Scanner; //tells the Java interpreter to get this code form the Java Library
public class ScannerDemo1
{
	public static void main(String[]args)//the front door
	{
		//step 1: create a Scanner object
		Scanner input = new Scanner(System.in); //'new' means we are building an object
		
		//step 2: prompt the user to enter something
		System.out.print("Enter your first name and press Enter ");
		
		//step 3: read the keyboard buffer and assign the value found there to a String variable
		String firstname = input.next();
		
		//step 4: Output the text to the screen
		System.out.println("Hello there " + firstname);
	}//end main
}//end class