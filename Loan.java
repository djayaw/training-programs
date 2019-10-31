import java.util.*;

public class Loan{
	
	public static void main(String[] args){
		System.out.print("Please enter the interest rate: ");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		double interestrate = Double.parseDouble(word);
		interestrate = interestrate/100;
		interestrate = interestrate/12;
		System.out.print("Please enter the number of years: ");
		word = input.nextLine();
		double noyears = Double.parseDouble(word);
		double nomonths = noyears *12;
		System.out.print("Please enter the loan amount: ");
		word = input.nextLine();
		double loanamt = Double.parseDouble(word);
		double part1 = loanamt * interestrate;

		double part2 = Math.pow((1+interestrate), nomonths);
		double part3 = 1 / part2;
		double part4 = 1- part3;
		

		double monthly = part1 / part4;
		double total = monthly * nomonths;

		System.out.printf("This is your monthly payment: %.2f ",monthly);
		System.out.printf("This is the total payment: %.2f ",total);
	}
}