package com.company.function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLearning {
    public static void main(String[] args) {
        Function<String, Integer> function = Integer::parseInt;
        Predicate<String> predicate = s->s.length()>4;
        Consumer<String> consumer = System.out::println;
        BiConsumer<String, String> biConsumer = (t,u)->System.out.println(t+ " "+ u);
        System.out.println(function.apply("12345"));
        System.out.println(predicate.test("agila"));
        consumer.accept("Learning");
        biConsumer.accept("Hello", "Java Class");
    }

    public static void myPrint(String a, String b) {
        System.out.println(a + " " + b);
    }
}
