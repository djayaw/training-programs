package classcode;
import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test = Math.random()*100; 
		int testing = (int) test;
		System.out.println(testing);
		String tester = Integer.toString(testing);
		Scanner prompt = new Scanner(System.in);
		System.out.print("Enter a 2 digit number: ");
		int usernumber = prompt.nextInt();
		String user = Integer.toString(usernumber);
		if (user.length() == 1)
			user = "0"+user;
		if (user.equals(tester))
			System.out.println("You win $5000");
		else
			if (user.charAt(1) == tester.charAt(0) && (user.charAt(0) == tester.charAt(1)))
				System.out.println("The award is 1000$");
				else
					if (user.charAt(1) == tester.charAt(0) || user.charAt(1) == tester.charAt(1) || user.charAt(0) == tester.charAt(0) || user.charAt(0) == tester.charAt(1))
						System.out.println("The award is 250");
						else
							System.out.println("The award is 0");
		
		prompt.close();
	}

}
