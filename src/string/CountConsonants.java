package string;

import java.util.ArrayList;
import java.util.Scanner;

public class CountConsonants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");

        String input = scanner.nextLine();

        int consonantCounter = 0;
        for(int i=0;i<input.length();i++) {
            if(!isVowel(input.charAt(i))) {
                consonantCounter++;
            }
        }

        System.out.println("Consonants: "+consonantCounter);
    }

    private static boolean isVowel(char ch) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');vowels.add('A');
        vowels.add('e');vowels.add('E');
        vowels.add('i');vowels.add('I');
        vowels.add('o');vowels.add('O');
        vowels.add('u');vowels.add('U');

        return vowels.contains(ch);
    }
}
