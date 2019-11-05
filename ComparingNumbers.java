package classcode;

import java.util.*;


public class ComparingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PN(input);
		largest(input);
		magnitude(input);
		input.close();
	}

	private static void PN(Scanner input) {
		System.out.print("Please enter a number: ");
		double check = input.nextDouble();
		
		//if else to check if the number is positive
		if (check >= 0)
			System.out.println("That number is positive");
		else
			System.out.println("That number is negative");
	}
	private static void largest(Scanner input) {
		
		//Getting information
		System.out.print("Please enter 3 numbers separated by spaces: ");
		double check1 = input.nextDouble();
		double check2 = input.nextDouble();
		double check3 = input.nextDouble();
		
		
		//If statements that go in a line to check which of the numbers has the highest value 
		if (check1>check2 && check1 >check3)
			System.out.println("The highest number is: "+check1);
		if (check2>check1 && check2>check3)
			System.out.println("The highest number is: "+check2);
		if (check3 >check1 && check3 > check2)
			System.out.println("The highest number is: "+check3);
	}
	private static void magnitude(Scanner input){
		System.out.print("Please enter your number: ");
		double number = input.nextDouble();
		
		//checks the absolute value to determine if its large 
		if (Math.abs(number) >= 1) {
				if (number > 0)
					System.out.println(number+" is postively large");
				else 
					System.out.println(number+" is negatively large");
		}
		
		//checks the absolute value to determine if its small
		if (Math.abs(number) < 1)
				if (number > 0)
					System.out.println(number+" is postively small");
				else
					System.out.println(number+" is negatively small");
		
		//the zero exception
		if (number == 0)
			System.out.println("You entered zero.");		
	}
}
