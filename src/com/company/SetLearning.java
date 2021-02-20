package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class SetLearning {
    public static void main(String[] args) {
        // Based on hash value

        Set<String> guests = new HashSet<>();
        guests.add("Agila");
        guests.add("At");
        guests.add("Ati");
        guests.add("Joel");
        guests.add("Agila");
        guests.add("Prakash");

        guests.add("Vivek");
        guests.remove("Ati");
        System.out.println(guests);
        //System.out.println(guests.get(1));

        List<String> strings = Arrays.asList("Vivek", "Joel", "Vivek", "Naveleen");

        Set<String> set2 = new TreeSet<>();
        set2.add("Atin");
        set2.add("FastCheck");
        guests.addAll(set2);
        System.out.println(guests);

        Iterator<String> iterator = guests.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        System.out.println(guests);
       // Set<String> filterSet = guests.stream().filter(s -> s.length() >= 5).map(s-> "Mr "+ s).collect(Collectors.toSet());

       // System.out.println(filterSet);



        Set<Guest> bookset = new HashSet<>();

        bookset.add(new Guest("Joel","63727372", 20));
        bookset.add(new Guest("Joel","63727372", 20));


        System.out.println(bookset);



    }
}
