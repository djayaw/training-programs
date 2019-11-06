package classcode;
import java.util.*;

public class isPrime {
	
	public static int check;
	public static int factorial = 1;
	
	public static int prime(int input, int check) {
		if (check == 1)
			return 1;
		if (input % check == 0) {
			return 0;
		}
		else
			return prime(input, --check);
	}
	
	public static int factorial(int input) {
		if (input <= 1) {
			return 1;
		}
		else {
			return input*factorial(input-1);
		}
	}
		
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Is this number prime: ");
	String x = input.nextLine();
  /*  try {
        int y = Integer.parseInt(x);
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
      } catch (Exception e) {
        System.out.println("Please enter a number");
      }
    */
	int y = Integer.parseInt(x);
	check = y-1;
	if (prime(y,check) == 0)
		System.out.println("This is composite");
	else 
		System.out.println("This is prime");
	
	System.out.println("The factorial is: "+factorial(y));
	
    input.close();
	}

}
