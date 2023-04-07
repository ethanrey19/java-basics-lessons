package main.arraylists;

import java.util.ArrayList;

public class ArrayList2d {
    public static void main(String[] args) {

        // 2d ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> list = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffee");

        list.add(bakeryList);
        list.add(produceList);
        list.add(drinkList);

        System.out.println(list.get(0).get(0));

    }
}
