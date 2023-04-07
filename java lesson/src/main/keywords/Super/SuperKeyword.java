package main.keywords.Super;

public class SuperKeyword {
    public static void main(String[] args) {

        // super = keyword refers to the superclass (parent) class of an object

        Hero hero1 = new Hero("Batman",42,"Money");
        Hero hero2 = new Hero("Superman", 43, "Everything");

        System.out.println(hero2.toString());

    }
}
