package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vowels = "aeiou";

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        int counter = 0;

        while (input.length() > counter) {

            char character = input.charAt(counter);
            int found = vowels.indexOf(character);

            if (found >= 0) {
                System.out.println(input + " has the vowel " + character);
                break;
            }

            counter++;

        }


    }
}
