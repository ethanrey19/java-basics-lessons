package main.methods;

public class Methods {
    public static void main(String[] args) {

        // method = a block of code that is executed everytime is it called upon

        String name = "Ethan";
        int age = 16;
        hello(name,age);

        int x = 3;
        int y = 4;
        int z = add(x,y);
        System.out.println(z);
        System.out.println(add(x,y));
    }

    static void hello(String title, int age){
        System.out.println(title + " " + age);
    }

    static int add(int x, int y){
        int z = x +y;
        return z;
    }

}
