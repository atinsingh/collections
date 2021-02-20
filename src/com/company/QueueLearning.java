package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLearning {
    public static void main(String[] args) {
        Queue<String> integerQueue  = new PriorityQueue<>();


        integerQueue.add("2");
        integerQueue.add("3");
        integerQueue.add("4");
        integerQueue.add("5");
        integerQueue.offer("6");

        System.out.println(integerQueue.element());
        //System.out.println(integerQueue.poll());

        System.out.println(integerQueue);


    }
}
