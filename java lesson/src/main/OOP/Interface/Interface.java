package main.OOP.Interface;

public class Interface {
    public static void main(String[] args) {

        // Interface = a template that can be applied to a class.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();

    }
}
