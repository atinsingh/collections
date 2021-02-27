package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamLearning {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        /* What is stream */
        dishes.add(new Dish(
                    "Butter Chicken", 400,
                    Arrays.asList("Chicken","Butter","Sugar"), DishType.NON_VEG));
        dishes.add(new Dish(
                "Paneer Tikka", 400,
                Arrays.asList("Paneer","Butter","Cream"), DishType.VEG));
       dishes.add(new Dish("Curd Rice", 200,
               Arrays.asList("Curd","rice","Salt"),DishType.VEG));

        dishes.add(new Dish(
                "Roasted Chicken", 400,
                Arrays.asList("Chicken","Pepper","Chilly"), DishType.NON_VEG));
        dishes.add(new Dish(
                "Roasted Chicken", 400,
                Arrays.asList("Chicken","Pepper","Chilly"), DishType.NON_VEG));
        dishes.add(new Dish(
                "Channa Puri", 500,
                Arrays.asList("Chickpeas Flour","Cumin Seed","Salt"), DishType.VEG));

        dishes.add(new Dish(
                "Channa Puri", 500,
                Arrays.asList("Chickpeas Flour","Cumin Seed","Salt"), DishType.VEG));

        // List the dishes which has fewer calories <= 400
        dishes.stream()
                .filter(d -> d.getCalories() <= 400)
                .filter(dish -> dish.getDishType() == DishType.VEG)
                .map(Dish::getDishName)
                .distinct().collect(Collectors.toList()).forEach(System.out::println);



    }
}
