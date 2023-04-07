package main.Misc.InnerClasses;

public class InnerClasses {
    public static void main(String[] args) {

        /*
            inner class = A class inside another class.
                          useful if a class should be limited sin scope.
                          usually private, but not necessary
                          helps group classes that belong together
                          extremely useful for listeners for specific events
                          precursor for anonymous inner classes.
         */

        Outside outside = new Outside();
        Outside.Inside in = outside.new Inside();

        in.Greeting();
    }
}
