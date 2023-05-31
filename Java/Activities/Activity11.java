package Activitys;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> colours  = new HashMap<Integer, String>();
        colours.put(1, "Black");
        colours.put(2, "Yellow");
        colours.put(3, "Pink");
        colours.put(4, "Brown");
        colours.put(5, "Red");

        colours.remove(1);


        if(colours.containsValue("Black")) {
            System.out.println("Black exists in the Map");
        } else {
            System.out.println("Black does not exist in the Map");
        }

        System.out.println(colours.size());

    }
}
