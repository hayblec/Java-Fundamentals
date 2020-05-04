package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number");
            double input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                System.out.println("Unsuitable number, Please input a positive number");
                continue;
            }
            if (input == 0) {
                break;
            }

            double powerOfTwo = Math.pow(input, 2);
            System.out.println(powerOfTwo);
        }

    }
}
