package main.Misc.Encapsulation;

public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make,String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    // Setters
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.make = make;
    }
    public void setYear(int year){
        this.make = make;
    }

}
