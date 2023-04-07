package main.Misc.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {

        // Encapsulation = attributes of a class being hidden to private,
        // can be accessed only through special methods(getters and setters)

        Car car = new Car("Chevrolet", "Camero",2021);

        car.setMake("Tesla");
        car.setModel("Model Z");
        car.setYear(2018);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());



    }
}
