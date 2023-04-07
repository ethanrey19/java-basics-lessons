package main.Misc.printf;

public class printf {
    public static void main(String[] args) {

       boolean myBoolean = true;
       char myChar = '@';
       String myString = "Ethan";
       int myInt = 7;
       double myDouble = 1000;

       // conversion characters
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        // width - number of spaces before conversion character
        System.out.printf("Hello %10s", myString);

        // precision - sets the amount of digits to be shown after a number
        System.out.printf("You have this much money %.2f",myDouble);

        // flags - adds an effect to output based on the flag added to format specifier
        //
        // - : left-justify
        // + : output a plus or minus sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if number > 1000

        System.out.printf("You have this much money %-20f",myDouble);
        System.out.printf("You have this much money %+f",myDouble);
        System.out.printf("You have this much money %020f",myDouble);
        System.out.printf("You have this much money %,f",myDouble);

    }
}
