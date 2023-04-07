package main.Misc.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        // polymorphism = The ability to an object to identify as more than one type

        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bike,boat};

        for(Vehicle x : racers){
            x.go();
        }
    }
}
