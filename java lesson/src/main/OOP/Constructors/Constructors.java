package main.OOP.Constructors;

public class Constructors {
    public static void main(String[] args) {

        Human human1 = new Human("Rick", 65, 175);
        Human human2 = new Human("David", 16, 135);

        System.out.println(human1.name);
        human2.eat();
        human1.drink();
    }
}
