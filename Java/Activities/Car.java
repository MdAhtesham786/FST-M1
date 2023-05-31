package Activitys;

public class Car {

    String colour;
    String transmission;
    int make;
    int tyres;
    int doors;
    public Car()
    {
        tyres=4;
        doors=4;
    }
    public void displayCharacteristic()
    {
    System.out.println("Colour:- " + colour);
        System.out.println("Transmission:- " + transmission);
        System.out.println("Manufacture:- " + make);
        System.out.println("Tyres:- " + tyres);
        System.out.println("Doors:- " + doors);
    }

    public void accelerate()
    {
        System.out.println("Car is moving forward");
    }

    void brake()
    {
        System.out.println("Car has stopped");
    }


}
