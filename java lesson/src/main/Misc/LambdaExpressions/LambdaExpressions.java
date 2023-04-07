package main.Misc.LambdaExpressions;

public class LambdaExpressions {
    public static void main(String[] args) {

        /* lambda expressions = feature for java 8 and above
                                also known as an anonymous method
                                a shorter way to write anonymous classes with only one method

                                need to use a functional interface or use a pre-defined functional
                                they contain only one abstract method
                                ex. ActionListener, Runnable, (user-defined)

                                A Lambda expression can be used in any place where a function interface is required
                                How to use Lambda Expressions :
                                (arguments) - > {statements/s}
         */

        /*
        String name = "Ethan";
        char symbol = '!';

        MyInterface myInterface = (x,y) -> {
            System.out.println("hello world!");
            System.out.println("it is a nice day " +x+y);
        };

        MyInterface myInterface2 = (x,y)-> {
            System.out.println("Hello " +x+y);
        };

        myInterface.message(name,symbol);
        myInterface2.message(name,symbol);
    }
         */

        new MyFrame();
    }
}
