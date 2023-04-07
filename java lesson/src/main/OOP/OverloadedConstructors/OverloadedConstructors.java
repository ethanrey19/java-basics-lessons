package main.OOP.OverloadedConstructors;

public class OverloadedConstructors {
    public static void main(String[] args) {

        // Overloaded Constructor = multiple constructions within a class with the same name,
        //                           but have different parameters

        Pizza pizza = new Pizza("Thick Crust", "Tomato", "Mozzarella", "Sausage");

        System.out.println("Here are the ingredients for your pizza : ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
