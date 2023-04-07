package main.Misc.RandomNumbers;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

         /*

        //int x = random.nextInt(6)+1; random int from 0 - 6
        //double y = random.nextDouble(); random value from 0 - 1
        //boolean z = random.nextBoolean(); random true or false value

         */

        Random random = new Random();

        int x = random.nextInt(6)+1;

        System.out.println(x);

    }
}
