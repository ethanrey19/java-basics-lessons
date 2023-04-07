package main.Misc.CustomExceptions;

import main.Misc.ExceptionHandling.AgeException;

import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) {

        // exception = an event, after execution, that disrupts the normal flow of a program
        // ex. ArithmeticException, ArrayIndexOutofBoundsException,FileNotFoundException

        // user definded exceptions = custom exceptions
        // ex. AgeException, InvalidEmailException

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occurred : " + e);
        }
    }

    static void checkAge(int age) throws AgeException {

        if(age<18){
            throw new AgeException("\n" + "You must be 18 or older to sign up!");
        }else {
            System.out.println("You are now signed up!");
        }
    }
}
