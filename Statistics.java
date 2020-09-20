/*
 * Class: CMSC201 
 * Instructor:Ashique Tanveer
 * Description:Write a program that prompts the user to enter ten numbers, and displays the mean and standard deviations of these numbers.
 * Due: 09/20/2020.
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Name: Phuc Bui.
*/
import java.util.Scanner;//Import the scanner class

public class Statistics {

	public static void main(String[] args) {
		//Create a new object of type Scanner that reads from the keyboard
			Scanner input = new Scanner(System.in);
			
		//Declare and initialize variables	
			double m = 0; //The mean
			double de = 0; //The deviation
			double x; //The user input


		//Prompt the user to enter ten numbers
			System.out.println("Enter the numbers: ");

		//Compute mean and standard deviation
			for (int i = 1; i<=10;i++) {
				x = input.nextDouble();
				m += x;
				de += Math.pow(x, 2); 
			}
		
			de =  Math.sqrt((de - (Math.pow(m, 2) / 10)) / (10 - 1));
			m /= 10;

		// Display results
			System.out.printf("The mean is %.5f\n",m);
			System.out.printf("The standard deviation is %.5f\n",de);
		
		// Close the Scanner
			input.close();
	}
}
