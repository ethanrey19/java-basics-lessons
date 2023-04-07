package main.math;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        /*

        double x = 3.14;
        double y = -10;

        double z = Math.max(x,y); // largest value
        double z = Math.min(x,y); // smallest value
        double z = Math.abs(y); // absolute number of a value
        double z = Math.sqrt(y); // square root of a value
        double z = Math.round(y); // round the value to the closest whole number
        double z = Math.ceil(y); // round the value up
        double z - Math.floor(y); // round the value down

         */

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x : " );
        x = scanner.nextDouble();
        System.out.println("Enter side y : ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : " + z);

        scanner.close();

    }
}
