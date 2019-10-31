import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		//Declares the Scanner to determine what the User wants 
		Scanner input = new Scanner(System.in);
		
		//checker to make sure that the number is viable for multiplication purposes
		int checker = 0;
		
		//first being declared before the program runs into the loop so it exists
		double first = 0.0;
		
		//input1 being declared before the program runs into the loop so it exists
		String input1;

		//do while loop to check what the user has inputted and makes sure thats its multipliable
		do {
			System.out.print("Enter the multiplier: ");
			input1 = input.next();
				
				try {
					//using a double because numbers with decimals should be multipliable
					first = Double.parseDouble(input1);
					//checker++ allows the user to proceed with the program
					checker++;
				}
				//throws an exception that tells the user that its not a valid number, sending the user back to try again
				catch(Exception ex) {
					System.out.println(input1 + " is not a valid number");
				}

			} while (checker == 0);

		System.out.println("Your results are:");

		//using a for loop to run through the multiplication chart, while not having to save a value to be multiplied
		for (int x = 1; x<11; x++){
			System.out.println(""+input1+" x "+x+" = "+(first * x));
		}
		
	}
}