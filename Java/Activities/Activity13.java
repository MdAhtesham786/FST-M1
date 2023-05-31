package Activitys;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen=new Random();
        System.out.println("Enter Value");


        while(scan.hasNextInt())
        {
            list.add(scan.nextInt());
        }

       Integer value[]=list.toArray(new Integer[0]);
        int index = indexGen.nextInt(value.length);
        System.out.println("Index Value:- " +index);
        System.out.println("Array Value :- " + value[index]);



    }
}
