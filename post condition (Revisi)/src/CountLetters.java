
//Nama : Dhiya Fakhar Nafi
//Kelas : D4 TI-1A
//NIM : 201524002

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        
        // get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        
        // convert to all upper case
        word = word.toUpperCase();

        // count frequency of each letter in string
        for (int i = 0; i < word.length(); i++)
        {
            try {						// Throws the exception
				counts[word.charAt(i)-'A']++;			
			} catch (ArrayIndexOutOfBoundsException ex) {	// arrayIndexOutOfBoundsException
				System.err.println(word.charAt(i));
			}
        }
        
        // print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++)
            if (counts[i] != 0)
                System.out.println((char) (i + 'A') + ": " + counts[i]);
    }
}