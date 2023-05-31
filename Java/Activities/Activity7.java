package Activitys;

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(6, 0,5);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
