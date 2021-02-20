package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>(); // This implementation is based on array
        guestList.add("Agila");
        guestList.add("Shivam");
        guestList.add("Hitesh");
        System.out.println(guestList.size());
        guestList.add(1, "Amar");

        List<String> tList = Arrays.asList("Alhamza", "Joel", "Prakash");

        // Return you immutable list
        System.out.println("Original List : " + guestList );
        System.out.println(tList);

        guestList.addAll(0, tList);

        System.out.println("After addition List : " + guestList );
        //System.out.println(guestList);

//        guestList.clear(); // purge or remove all element from List
//
//        System.out.println("After calling clear() : " + guestList );

        if (guestList.contains("Amar")) {
            System.out.println("Amar is in list ");
        }else {
            System.out.println("Not in list");
        }

        if (guestList.containsAll(Arrays.asList("Amar", "Joel"))) {
            System.out.println("Found Sub Collection");
        }

        guestList.add("Agila");
        guestList.add("Vivek");
        System.out.println(guestList.lastIndexOf("Agila"));

        System.out.println("Before Removal : " + guestList);
        System.out.println(guestList.remove("Prakash2"));
       // System.out.println(guestList.removeAll(Arrays.asList("Amar", "Joel", "Sparsh")));
        System.out.println("After Removal  : " + guestList);

       // guestList.retainAll(Arrays.asList("Amar", "Joel", "Shivam"));

        System.out.println("After Retain  : " + guestList);

        //guestList.replaceAll(UnaryOperator.identity());
        guestList.set(2, "Atin");

        System.out.println(guestList);




    }

}
