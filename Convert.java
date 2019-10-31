import java.util.Scanner;

public class Convert{
	public static void main(String[] args){
		System.out.print("Please enter your temperature: ");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		double temperature = Double.parseDouble(word);
		double celsius = (((temperature - 32.0)*5.0)/9);
		System.out.printf("That is %.2f degrees celsius",celsius);

	}

}