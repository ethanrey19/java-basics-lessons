package main.arrays;

public class Array2d {
    public static void main(String[] args) {

        // 2d array = an array of arrays

        /*

        String[][] cars = new String[3][3];

        cars[0][0] = "Camero";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Telsa";

            OR :

         */

        String[][] cars = {{"Camero","Corvette","Silverado"},
                           {"Ranger","Mustang","F-150"},
                           {"Ferrari","Lambo","Telsa"}};

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            for (int j = 0; j < cars[i].length; j++){
                System.out.println(cars[i][j]);
            }
        }

    }
}
