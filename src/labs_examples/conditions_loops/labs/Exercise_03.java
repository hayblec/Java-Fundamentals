package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month number(1-12) : ");

        int month = scanner.nextInt();
        String monthName;

        //FEEDBACK: typically I'd "tab" the "break" statements each two tabs to the right
        switch (month){
            case 1: monthName = "January";
                    // FEEDBACK: example
                    break;
            case 2: monthName = "February";
            break;
            case 3: monthName = "March";
            break;
            case 4: monthName = "April";
            break;
            case 5: monthName = "May";
            break;
            case 6: monthName = "June";
            break;
            case 7: monthName = "July";
            break;
            case 8: monthName = "August";
            break;
            case 9: monthName = "September";
            break;
            case 10: monthName = "October";
            break;
            case 11: monthName = "November";
            break;
            case 12: monthName = "December";
            break;
            default: monthName = "Impossible. Except you are from different timeline";
            break;
        }
        System.out.println("You entered " + month + " which is " + monthName);
    }

}
