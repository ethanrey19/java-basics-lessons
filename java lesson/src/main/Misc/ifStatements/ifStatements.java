package main.Misc.ifStatements;

public class ifStatements {
    public static void main(String[] args) {

        int age = 16;

        if(age >= 18){
            System.out.println("You are an adult");
        }else if (age >= 75){
            System.out.println("You are old!");
        }else if(age >= 13){
            System.out.println("You are young");
        } else {
            System.out.println("You are a child");
        }

    }
}
