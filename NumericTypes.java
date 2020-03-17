import java.util.Scanner;
/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here
		Scanner userInput = new Scanner (System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		//Task #2 prompt user to input score1
		System.out.println("Please enter a score:");
		score1 = userInput.nextInt();
		double score2 = 95; // second test score
		//Task #2 prompt user to input score2
		System.out.println("Please entere a second score:");
		score2 = userInput.nextDouble();
		double average; // arithmetic average
		//Task #2 read score1 
		//Task #2 read score2 
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		String output; // line of output to print out
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		final int BOILING_IN_F = 212; // boiling temperature
		//Task #2 declare a variable to hold the user’s temperature
		System.out.println("Please enter a temperature in Fahrenheit:");
		double fToC; // temperature in Celsius
		//Task #2 prompt user to input another temperature
		fToC = userInput.nextInt();
		// Convert Fahrenheit temperatures to Celsius
		fToC = 5.0/9 * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 read the user’s temperature in Fahrenheit
		//Task #2 convert the user’s temperature to Celsius
		//Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended
		userInput.close();
	}
}


