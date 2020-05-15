package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    //FEEDBACK: Nice use of PI - that said, we can also use: Math.PI just FYI to grab that value from the Math class
    // also, nice that you made it capitalized, which typically means the variable is "final" the only thing your missing
    // is the "final" keyword in the variable declaration - meaning it cannot be changed.
    static final double PI = Math.PI; //3.14159265359

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        double height = 5;

        double cylinderVolume = calculateVolumeOfCylinder(radius, height);
        System.out.println("Volume of cylinder: " + cylinderVolume);

        double cylinderArea = calculateAreaOfCylinder(radius, height);
        System.out.println("Area of cylinder: " + cylinderArea);
    }

    public static double calculateVolumeOfCylinder(double radius, double height){

        double volume = PI*(radius * radius) * height;
        return volume;
    }

    public static double calculateAreaOfCylinder(double radius, double height){
        double area = 2 * PI * radius * height + 2 * PI * (radius * radius);
        return area;
    }
}