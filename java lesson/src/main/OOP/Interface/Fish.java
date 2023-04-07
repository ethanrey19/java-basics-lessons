package main.OOP.Interface;

public class Fish implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("The fishing is hunting");
    }

    @Override
    public void flee() {
        System.out.println("the fishing is fleeing");
    }
}
