package main.methods.methodOverriding;

public class methodOverriding {
    public static void main(String[] args) {

        // method overriding = declaring a method in a subclass,
        //                     which is already present in parent class.

        Dog dog = new Dog();
        Animal animal = new Animal();

        animal.speak();
        dog.speak();

    }
}
