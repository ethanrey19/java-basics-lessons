package main.arraylists;

public class ArrayLists {
    public static void main(String[] args) {

        // Arraylist = a resizable array

        java.util.ArrayList<String> food = new java.util.ArrayList<String>();

        food.add("Pizza");     // adds a value to the arraylist
        food.add("Hamburger");
        food.add("Hotdog");

        food.set(0,"Sushi");  // changes a value from the arraylist
        food.remove(2); // removes a value from the arraylist
        food.clear();        // clears the arraylist

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

    }
}
