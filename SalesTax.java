import java.util.Scanner;

public class SalesTax{
	public final static double AL = 1.0914;
	public final static double AK = 1.0143;
	public final static double AZ = 1.0873;
	public final static double AR = 1.0943;
	public final static double CA = 1.0856;
	public final static double CO = 1.0763;
	public final static double CT = 1.0635;
	public final static double DE = 1.0;
	public final static double FL = 1.0705;
	public final static double GA = 1.0729;
	public final static double HI = 1.0441;
	public final static double ID = 1.0603;
	public final static double IL = 1.0874;
	public final static double IN = 1.07;
	public final static double IA = 1.0682;
	public final static double KS = 1.0867;
	public final static double KY = 1.06;
	public final static double LA = 1.0945;
	public final static double ME = 1.0550;
	public final static double MD = 1.06;
	public final static double MA = 1.0625;
	public final static double MI = 1.06;
	public final static double MN = 1.0743;
	public final static double MS = 1.0707;
	public final static double MO = 1.0813;
	public final static double MT = 1.0;
	public final static double NE = 1.0685;
	public final static double NV = 1.0814;
	public final static double NH = 1.0;
	public final static double NJ = 1.0660;
	public final static double NM = 1.0782;
	public final static double NY = 1.0849;
	public final static double NC = 1.0697;
	public final static double ND = 1.0685;
	public final static double OH = 1.0717;
	public final static double OK = 1.0892;
	public final static double OR = 1.0;
	public final static double PA = 1.0634;
	public final static double RI = 1.07;
	public final static double SC = 1.0743;
	public final static double SD = 1.0640;
	public final static double TN = 1.0947;
	public final static double TX = 1.0819;
	public final static double UT = 1.0694;
	public final static double VT = 1.0618;
	public final static double VA = 1.0565;
	public final static double WA = 1.0917;
	public final static double WV = 1.0639;
	public final static double WI = 1.0544;
	public final static double WY = 1.0536;
	public final static double DC = 1.0600;


	public static void main(String[] args){
		boolean checker = false;
		do {

		System.out.print("Please enter your state's abbreviation: ");
		Scanner states = new Scanner(System.in);
		String statescheck = states.nextLine();
		statescheck = statescheck.toUpperCase();

			if (statescheck.equals("AL"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * AL;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("AK"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * AK;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("AZ"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * AZ;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("AR"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * AR;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("CA"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * CA;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("CO"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * CO;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("CT"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * CT;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("DE"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * DE;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("FL"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * FL;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("GA"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * GA;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("HI"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * HI;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("ID"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * ID;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("IL"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * IL;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("IN"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * IN;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("IA"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * IA;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("KS"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * KS;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("KY"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * AZ;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("AR"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * KY;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("LA"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * LA;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("ME"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * ME;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("MD"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * MD;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("MA"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * MA;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("MI"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * MI;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("MN"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * MN;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("MS"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * MS;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("MO"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * MO;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("MT"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * MT;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("NE"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * NE;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("NV"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * NV;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("NH"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * NH;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("NJ"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * NJ;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("NM"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * NM;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("NY"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * NY;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("NC"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * NC;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("ND"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * ND;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("OH"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * OH;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("OK"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * OK;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("OR"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * OR;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("PA"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * PA;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("RI"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * RI;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("SC"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * SC;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("SD"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * SD;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("TN"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * TN;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("TX"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * TX;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("UT"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * UT;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("VT"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * VT
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("VA"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * VA;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("WA"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * WA;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("WV"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * WV;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("WI"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * WI;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("WY"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * WY;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
			if (statescheck.equals("DC"))
			{
				System.out.print("Please enter the price: ");
				Scanner input = new Scanner(System.in);
				String word = input.nextLine();
				System.out.println(word);
				try { 
					double price = Double.parseDouble(word);
					System.out.println(price);
					double finalcost = price * DC;
					System.out.printf("The final cost is: %.2f $",finalcost);
					checker = true;
				}
				catch(Exception ex) {
					System.out.println(input + " is not a valid number");
				}
			}
		} while(checker ==false);
	}
}