package main.variables;

public class SwapTwoVariables {
    public static void main(String[] args){
        String x = "Water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("x: " + x);
        System.out.println("y: " +y);
    }
}
