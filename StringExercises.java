package classcode;

import java.util.*;
import org.apache.commons.lang3.*;

public class StringExercises{

	public static void main(String[] args) {
		System.out.println("1: A Full Reverse of a string");
		System.out.println("2: A Reversal of a Sentence");
		System.out.println("3: A Reversal and a replacement of dashes");
		System.out.println("4: Finding a character in a String");
		System.out.println("5: Checking the characters for the kind of character they are");
		System.out.print("Please select which program you'd like to run: ");
		Scanner input = new Scanner(System.in);
		int choose = input.nextInt();
		if (choose == 1) 
			fullReverse();
		if (choose == 2)
			reverseSentence();
		if (choose == 3)
			reverseDashes();
		if (choose == 4)
			bigDrama();
		if (choose == 5)
			checkCharacters();
		input.close();
	}

	
	public static void fullReverse() {
		Scanner input = new Scanner(System.in);
		String phrase = input.nextLine();
		String phrasearray[] = new String[phrase.length()];
		int y = phrase.length() - 1;
		String returnthis = "";
		for (int x = 0; x<phrase.length(); x++) {
			phrasearray[x] = Character.toString(phrase.charAt(y));
			returnthis = returnthis + phrasearray[x];
			y--;
		}
		System.out.println(returnthis);
		input.close();
	}

	public static void dylanReverse() {
		Scanner input = new Scanner(System.in);
		String phrase = input.nextLine();
		String phrasearray[] = phrase.split(" ");
		int y = phrasearray.length-1;
		String returnthis = "";
		for (int x = 0; x<phrasearray.length; x++) {
			returnthis = returnthis + phrasearray[y] +" ";
			y--;
		}
		System.out.println(returnthis);
		input.close();
	}
	
	public static void reverseSentence() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Input: ");
		String phrase = reader.nextLine();
		String phrasearray[] = phrase.split(" ");
		ArrayUtils.reverse(phrasearray);
		String returnthis = "";
		for (int x = 0; x <phrasearray.length; x++) {
			returnthis = returnthis + phrasearray[x] + " ";
		}
		System.out.println(returnthis);
		reader.close();
	}
	
	public static void reverseDashes() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Input: ");
		String phrase = reader.nextLine();
		String phrasearray[] = phrase.split("-");
		ArrayUtils.reverse(phrasearray);
		String returnthis = "";
		for (int x = 0; x <phrasearray.length; x++) {
			returnthis = returnthis + phrasearray[x] + "^";
		}
		System.out.println("Output: " +returnthis);
		reader.close();
	}
	public static void bigDrama() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter some text: ");
		String phrase = reader.nextLine();
		System.out.print("Please enter a number: ");
		int number = reader.nextInt();
			if ((number < 0) || (number > phrase.length()-1))
				System.out.println("That character is out of range");
			else
				System.out.println("That character is '"+phrase.charAt(number)+"'.");
		reader.close();
	}
	public static void checkCharacters() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Input: ");
		String phrase = reader.nextLine();
		int digit = 0;
		int letter = 0;
		int anythingelse = 0;
		
		for(int i=0; i<phrase.length(); ++i) {
			  char c = phrase.charAt(i);
			  if (Character.isDigit(c))
				  digit++;
			  else
			  if (Character.isLetter(c))
				  letter++;
			  else 
				  anythingelse++;
		}
		System.out.println("Output: "+digit+" digits "+letter+" letters "+anythingelse+" anything else");
		reader.close();
	}
} 

