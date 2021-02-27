package com.company.stream;

import java.util.List;
import java.util.Objects;

public class Dish {
    private String dishName;
    private int calories;
    private List<String> ingredients;
    private DishType dishType;
    private int rating;

    public Dish(String dishName, int calories, List<String> ingredients, DishType dishType) {
        this.dishName = dishName;
        this.calories = calories;
        this.ingredients = ingredients;
        this.dishType = dishType;
    }

    public String getDishName() {
        return dishName;
    }

    public int getCalories() {
        return calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", calories=" + calories +
                ", ingredients=" + ingredients +
                ", dishType=" + dishType +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return calories == dish.calories && rating == dish.rating && Objects.equals(dishName, dish.dishName) && Objects.equals(ingredients, dish.ingredients) && dishType == dish.dishType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dishName, calories, ingredients, dishType, rating);
    }
}
