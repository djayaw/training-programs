import java.util.*;

public class MonetaryUnits{
	
	public static void main(String[] args){
		System.out.print("Please enter the amount of money: ");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		String dollars = "";
		int money = 0;
		int limit = 0; 
		int quarters = 0;
		int dimes =0;
		int nickels = 0;
		int pennies = 0;

		for (int x =0; x<word.length(); x++){
			if(word.charAt(x) == '.'){
				dollars = word.substring(0,x);
				word = word.substring(x+1,word.length());
				money = Integer.parseInt(word);
			}
		}
		do {
			if(money >= 25){
				quarters++;
				money = money -25;
			} else 
			if(money >=10){
				dimes++;
				money = money -10;
			} else
			if(money >=5){
				nickels++;
				money = money -5;
			} else
			if(money >=1){
				pennies++;
				money = money -1;
			}

		}while(money > 0);

		System.out.println(word);
		System.out.println(dollars +" Dollars");
		System.out.println(quarters+" Quarters");
		System.out.println(dimes +" Dimes");
		System.out.println(nickels +" Nickels");
		System.out.println(pennies +" Pennies");



	}
}