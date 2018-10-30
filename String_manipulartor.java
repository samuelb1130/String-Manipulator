import java.util.Scanner;

/**
*
*@auther Sam Bauer 22
*
*/

public class String_manipulartor {

	public static void main(String[] args) {
	
		
		Scanner bread = new Scanner (System.in);
		
		System.out.println("Please enter a string name:   ");
		String Word = bread.nextLine();
		
		int WordLength = Word.length();
		int endChar = WordLength - 1;
		char FirChar = Word.charAt(0); 	
		char LasChar = Word.charAt(endChar);
		int halfWord = WordLength / 2;
		String half = Word.substring(0, halfWord);
		
		/**
		*Main starting code
		*
		*Info of word created and stored
		*/
		
		System.out.println("\nThe first and last letters of your world is " + FirChar + " and " + LasChar);
		System.out.println("\nThe first half of your word is " + half);
		
		/**
		*First part
		*
		*length of word, first and seconds letter of word
		*/
		
		
		System.out.println("\nEnter the letter you would like to find in your word");
		String Letter = bread.nextLine();
		
		int LetterWord = Word.indexOf(Letter);
		System.out.println("\nYou're letter can be found at index " + LetterWord);
		
		/**
		*Second part
		*
		*location of specific letter and location
		*/
		
		System.out.println("\nPLease enter a starting index");
		int Sindex = Integer.parseInt(bread.nextLine());
		System.out.println("\nPlease enter a ending index");
		int Eindex = Integer.parseInt(bread.nextLine());
		
		String Mword = Word.substring(Sindex, Eindex);
		System.out.println("\nThe letters in your index are: " + Mword);
		
		/**
		*Last part
		*
		*index created by user 
		*/
		
		System.out.println("\nEnd");
		
		/**
		*End
		*/
		
	}

}