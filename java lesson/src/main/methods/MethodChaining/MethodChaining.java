package main.methods.MethodChaining;

public class MethodChaining {
    public static void main(String[] args) {

        // method chaining = a common syntax for invoking multiple method calls in OOP.
        //                   condense code into fewer lines

        String name = "        ethan ";

        //name = name.concat("     code  "); // add characters to the String
        //name = name.toUpperCase(); // all uppercase letters
        //name = name.trim(); // removes any blank space before or after a String

        name = name.concat("code"     ).toUpperCase().trim();

        System.out.println(name);

    }
}
