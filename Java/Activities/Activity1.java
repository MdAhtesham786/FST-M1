package Activitys;

public class Activity1 {
    public static void main(String[] args) {
        Car car=new Car();
        car.make=2014;
        car.colour="Black";
        car.transmission="Manual";
        car.displayCharacteristic();
        car.accelerate();
        car.brake();
    }
}
