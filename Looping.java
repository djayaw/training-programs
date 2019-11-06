package classcode;

import java.util.*;

public class Looping {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(repeatAddition(input));
		//guessNumber();
		//subtractionProblems();
		//multiplicationTable();
		//greatestCommonDivisor();
		//predictingFuture();
		isPrime();
		//input.close();
	}
	
	public static String repeatAddition() {
		int test = 0;
		do {
			int random = (int)(Math.random()*100);
			int random2 = (int)(Math.random()*100);
			System.out.print("What is "+random+" + "+random2+"? ");
			String usersum = input.nextLine();
			Label: 
				try {
					int sum = Integer.parseInt(usersum);
					if (random + random2 == sum) {
						System.out.println("The sum is correct");
						break Label;}
					else {
						System.out.println("The sum is incorrect");
						break Label;
					}
				}  catch (Exception e) {
				test++;
		        System.out.println("Goodbye!");
		     }
			} while (test == 0);
		return "";
	}
	
	public static void guessNumber() {
		int x =0; 
		do{
			int random = (int)(Math.random()*100);
			int user;
			System.out.println(random);
				do {
				System.out.print("What is your guess: ");
				user = input.nextInt();
				if (user > random)
					System.out.println("Input is too high");
				if (user < random)
					System.out.println("Input is too low");
				}while (user != random);
			if (user == random) {
				x++;
				System.out.print("The answer is correct, would you like to play again? ");
				String playagain = input.next();
				if (playagain.equalsIgnoreCase("yes"))
					x=0;
				else
					x++;
			}

		}while (x == 0);
	}
	
	public static void subtractionProblems() {
		int x = 0;
		int totalright =0;
		int temptotal=0;		
		do {

			int p0 = (int)(Math.random()*10);
			int p1 = (int)(Math.random()*10);
			int p2 = (int)(Math.random()*10);
			int p3 = (int)(Math.random()*10);
			int p4 = (int)(Math.random()*10);
			int p5 = (int)(Math.random()*10);
			int p6 = (int)(Math.random()*10);
			int p7 = (int)(Math.random()*10);
			int p8 = (int)(Math.random()*10);
			int p9 = (int)(Math.random()*10);
			
			if (p0 > p1) {
				System.out.print("What is "+p0+" - "+p1+"? ");
				temptotal=p0-p1; 
				}
				else {
					System.out.print("What is "+p1+" - "+p0+"? ");		
					temptotal=p1-p0;
				}
			int usertotal = input.nextInt();
			if (usertotal == temptotal)
				totalright++;
			
			
			if (p2 > p3) {
				System.out.print("What is "+p2+" - "+p3+"? ");
				temptotal=p2-p3;
			}
				else {
					System.out.print("What is "+p3+" - "+p2+"? ");
					temptotal=p3-p2;	
				}
			usertotal = input.nextInt();			
			if (usertotal == temptotal)
				totalright++;
			
			
			if (p4 > p5) {
				System.out.print("What is "+p4+" - "+p5+"? ");
				temptotal = p4-p5;
			}
				else {
					System.out.print("What is "+p5+" - "+p4+"? ");								
					temptotal = p5-p4;
				}
			usertotal = input.nextInt();
			if (usertotal == temptotal)
				totalright++;
			
			
			if (p6 > p7) {
				System.out.print("What is "+p6+" - "+p7+"? ");
				temptotal = p6 -p7;
			}
				else {
					System.out.print("What is "+p7+" - "+p6+"? ");	
					temptotal = p7-p6;
				}
			usertotal = input.nextInt();
			if (usertotal ==temptotal)
				totalright++;
			
			if (p8 > p9) {
				System.out.print("What is "+p8+" - "+p9+"? ");
				temptotal =p8-p9;
			}else {
					System.out.print("What is "+p9+" - "+p8+"? ");	
					temptotal = p9-p8;
			}
			usertotal = input.nextInt();
			
			if (usertotal == temptotal)
				totalright++;
			
			x++;
			System.out.println("You got "+totalright+" correct!");
			System.out.print("Would you like to play again? ");
			String proceed = input.next();
			if (proceed.equalsIgnoreCase("yes"))
					x=0;
			
		}while (x == 0);
		
	}
	
	public static void multiplicationTable() {
		for (int x = 1; x<13; x++) {
			for (int y = 1; y<13; y++) {
				System.out.print(x*y+" ");
			}
			System.out.println();
		}
	}
	
	public static void greatestCommonDivisor() {
		System.out.print("What's the first number: ");
		int a = input.nextInt();
		System.out.print("What's the second number: ");
		int b = input.nextInt();
		int gcd =0;
		if (a < b)
			for (int x = 1; x < a; x++) {
				if ((a % x == 0) && (b % x ==0))
					gcd = x;
			}
		if (b > a)
			for (int x = 1; x<b; x++) {
				if ((a % x == 0) && (b % x ==0))
					gcd = x;
			}
		System.out.println(gcd);	
	}
	
	public static void predictingFuture() {
		System.out.print("How much is tuition: ");
		double tuition = input.nextDouble();
		System.out.print("How much is interest: ");
		double interest = input.nextDouble() /100;
		double interestedtuition = tuition*2;
		int counter = 0;
		interest += 1;
		System.out.println(interest);
		
		do {
			tuition = interest *tuition;
			System.out.println(tuition);
			counter++;
		}while (tuition <= interestedtuition);
		
		System.out.println(counter+" years");
	}
	
	public static void isPrime() {
		System.out.print("Please enter an integer: ");
        int y = input.nextInt();
        Label: 
        for (int check = 2; check <y; check++) {
        	switch(check % y) {
        	case 0: 
        		System.out.println("This is a composite number");
        		check = y;
        		break Label;
        	default:
        		System.out.println("This is a prime number");
        		break Label;
        	}
        }
      }
	
}
