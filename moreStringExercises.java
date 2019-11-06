package classcode;
import java.util.*;

public class moreStringExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		exchange(input);
		charFinder(input);
		wordFinder(input);
		vowelDouble(input);
		input.close();
	}
	
	public static void exchange(Scanner input) {
		System.out.print("Please enter some text: ");
		String text = input.nextLine();
		System.out.print("Please enter a word: ");
		String replacethis = input.nextLine();
		String finalstring = "";
		for (int x = 0; x<text.length(); x++) {
			for (int y = 0; y<replacethis.length(); y++) {
				String a = text.charAt(x)+"";
				String b = replacethis.charAt(y)+"";
				if (a.equals(b))
					text=text.replace(text.charAt(x), '0');
			}
			System.out.println(finalstring);
		}
		System.out.println("Output: "+text);
	}
	
	public static void charFinder(Scanner input) {
		System.out.print("Please enter some text: ");
		String text = input.nextLine();
		System.out.print("Please enter a character: ");
		char uchar = input.nextLine().charAt(0);
		System.out.println("That character first occurs at index "+text.indexOf(uchar)+" and last occurs at index "+text.lastIndexOf(uchar)+".");		
	}
	public static void wordFinder(Scanner input) {
		System.out.print("Please enter some text: ");
		String text = input.nextLine();
		System.out.print("Please enter a word: ");
		String word = input.nextLine();
		if (text.contains(word))
			System.out.println("The text contains the word.");
		else
			System.out.println("The text does not contain the word.");
	}
	public static void vowelDouble(Scanner input) {
		System.out.print("Please enter a sentence: ");
		String text = input.nextLine();
		String altered ="";
		for (int x = 0; x < text.length(); x++) {
			switch (text.charAt(x)) {
			case 'a': 
				altered = altered +"aa";
				break;
			case 'e':
				altered = altered +"ee";
				break;
			case 'i':
				altered = altered + "ii";
				break;
			case 'o':
				altered = altered +"oo";
				break;
			case 'u':
				altered = altered +"uu";
				break;
			default:
				altered = altered+text.charAt(x);
				break;
			}
		}
		System.out.println("Output: "+altered);
	}
}
