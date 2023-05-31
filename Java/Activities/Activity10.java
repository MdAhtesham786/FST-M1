package Activitys;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<String>();
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");

        System.out.println(hs.size());
        hs.remove("One");
        hs.remove("Six");
        System.out.println(hs.contains("Two"));
        System.out.println(hs);

    }
}
