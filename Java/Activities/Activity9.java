package Activitys;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<String>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.add("Four");
        myList.add("Five");

        for(int i=0;i< myList.size();i++)
        {
            System.out.println(myList.get(i));
        }

        System.out.println(myList.get(3));
        System.out.println(myList.contains("Four"));
        System.out.println(myList.size());
        myList.remove(0);
        System.out.println(myList.size());

    }
}
