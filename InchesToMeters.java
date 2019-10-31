import java.util.Scanner;

public class InchesToMeters{

	public static void main(String[] args){

		//Declares the Scanner to determine what the User wants to input
		Scanner input = new Scanner(System.in);
		
		//Value of inches to meter 
		final double meterval = 0.0254;
		
		//A prompt for the user to enter the information
		System.out.print("Enter # inches to convert to meters: ");
		
		//Saving the user's input as a String, in case they didn't use numbers. 
		String inches = input.next();
		
		//sending the user to an exception if the user does not enter in a valid number
		try {
			//Converting the string, into a double if it can be converted
			double doubleinch = Double.parseDouble(inches);
			
			//doing the calculation for the meters 
			double meters = doubleinch * meterval; 
			
			//printing out the meters while calling for the value inputted by the user. 
			System.out.println("Conversion: "+doubleinch+" inch(es) is "+meters+" meters. ");
		
		}
		catch(Exception ex) {
			System.out.println(inches + " is not a valid number");

		}
	}

}