package main.loops.WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // while loop = executes a block of code as long as its condition stays true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

    }
}

