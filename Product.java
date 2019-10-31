import java.util.Scanner;

public class Product{
	public static void main(String[] args){
		
		//Declares input 
		Scanner input = new Scanner(System.in);
		
		//variable to check if the user has inputted a numerical value
		int checker = 0;
		
		//declaring the first number so that it exists outside a loop
		double first = 0.0;
		
		//declaring the second number so that it exists outside a loop
		double second = 0.0;
		
		//declaring the end of the product
		double end = 0.0;
		
		//declares the string which is being read outside the loop
		String input1;
		
		//declares the second string which is being read outside the loop
		String input2;

		//do while to make sure that the user has inputted a numerical value 
		do {
			
			System.out.print("Enter first number: ");
			
			//reads the next values that the user types in 
			input1 = input.next();
			
				//has an exception so that if the user doesn't type in a numerical value, it'll bounce and the user can try again
				try {
			
					//parses as a double because decimals should be multiplying 
					first = Double.parseDouble(input1);
			
					//allows an exit to the loop if the user does correctly input a number
					checker++;
				}
				//throws an exception if its not a numerical value
				catch(Exception ex) {
					System.out.println(input1 + " is not a valid number");
				}

			} while (checker == 0);
		
		//resets the checker value so that it works for the next loop 
		checker = 0;

		//same loop as above but for the second value 
		do {
			System.out.print("Enter second number: ");
			input2 = input.next();
				try {
					second = Double.parseDouble(input2);
					checker++;
				}
				catch(Exception ex) {
					System.out.println(input2 + " is not a valid number");
				}		
		} while (checker == 0);

		//multiplies the doubles and assigns the value to a variable
		end = first * second;
		
		//displays the double in a legible format. 
		System.out.println("The Product of "+input1+" and "+input2+" is: "+end+" ");
	
	}

}