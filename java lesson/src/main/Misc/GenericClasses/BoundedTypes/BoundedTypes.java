package main.Misc.GenericClasses.BoundedTypes;

public class BoundedTypes {
    public static void main(String[] args) {

        // bounded types = you can create the objects of a generic class to have data
        //                 of specific derived types ex.Number

        MyBoundedClass<Integer,Integer> myInt = new MyBoundedClass<>(1,9);
        MyBoundedClass<Double,Double> myDouble = new MyBoundedClass<>(3.14,10.1);

        System.out.println(myInt.getX() + myInt.getY());
        System.out.println(myDouble.getX() + myDouble.getY());
    }
}
