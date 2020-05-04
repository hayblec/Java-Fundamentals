package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);
        // 2) prompt user
        System.out.println("Please enter the day of the week by entering 1,2, ...7");

        // 3) assign input to variable as int
        int dayOfTheWeek = scanner.nextInt();

        // 4) write completed code here
        if (dayOfTheWeek == 1){
            System.out.println("You entered " + dayOfTheWeek + " so the day of the week is Monday");
        }else if(dayOfTheWeek == 2){
            System.out.println("You entered " + dayOfTheWeek + " so the day of the week is Tuesday");
        }else if(dayOfTheWeek == 3){
            System.out.println("You entered " + dayOfTheWeek + " so the day of the week is Wednesday");
        }else if(dayOfTheWeek == 4){
            System.out.println("You entered " + dayOfTheWeek + " so the day of the week is Thursday");
        }else if(dayOfTheWeek == 5){
            System.out.println("You entered " + dayOfTheWeek + " so the day of the week is Friday");
        }else if(dayOfTheWeek == 6){
            System.out.println("You entered " + dayOfTheWeek + " so the day of the week is Saturday");
        }else{
            System.out.println("You entered " + dayOfTheWeek + " so the day of the week is Sunday");
        }

    }
}
