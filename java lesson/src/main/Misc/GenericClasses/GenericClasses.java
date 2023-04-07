package main.Misc.GenericClasses;

import java.util.ArrayList;

public class GenericClasses {
    public static void main(String[] args) {

        MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
        MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,10.1);
        MyGenericClass<Character,Character> myChar = new MyGenericClass<>('!','A');
        MyGenericClass<String,String> myString = new MyGenericClass<>("Hello","Bye");

        ArrayList<String> myFriends = new ArrayList<>();

        System.out.println(myInt.getX() + myInt.getY());
        System.out.println(myDouble.getX() + myDouble.getY());
        System.out.println(myChar.getX() + myChar.getY());
        System.out.println(myString.getX() + myString.getY());
    }
}
