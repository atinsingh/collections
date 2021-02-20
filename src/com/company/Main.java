package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


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

       // guestList.retainAll(tList);

        System.out.println("After Retain  : " + guestList);

        //guestList.replaceAll(UnaryOperator.identity());
        guestList.set(2, "Atin");

        System.out.println(guestList);

        List<String> subList = guestList.subList(0, 3);
        System.out.println("SubList " + subList);

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>5;
            }
        };

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        guestList.removeIf(predicate);

        System.out.println(guestList);

        //guestList.forEach(consumer);
//        for (String st : guestList  ) {
//            System.out.println(st); // wont allow you change collection
//        }

        Iterator<String> iterator = guestList.iterator();

        while (iterator.hasNext()) {
            String elem = iterator.next();
            if (elem.equals("Atin")){
                iterator.remove();
            }

        }

        System.out.println(guestList);

        Object[] objects = guestList.toArray();
        System.out.println(objects[0]);
        String [] names = new String[guestList.size()];

        names =  guestList.toArray(names);
        // List is ordered
        // sorted  --  1,2,3,5,

        guestList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        } );
        System.out.println(guestList);
            // LIST
        for (int i = 0; i < guestList.size() ; i++) {
            System.out.println(guestList.get(i));
        }


    }


}
