package main.methods.overloadedmethods;

public class OverloadedMethods {
    public static void main(String[] args) {

        // overloaded method = methods that share the same name but have different parameters

        int x = add(1,2,3,4);
        System.out.println(x);

        double y = add(1.8,2.6);
        System.out.println(y);
    }

    static int add(int a, int b){
        System.out.println("This is method number 1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is method number 2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is method number 3");
        return a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("This is method number 1");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is method number 2");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is method number 3");
        return a + b + c + d;
    }
}
