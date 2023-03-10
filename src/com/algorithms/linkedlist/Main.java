package com.algorithms.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lists = new LinkedList<>();
        lists.add("Vicheka");
        lists.add("Davit");
        lists.add("Koeury");
        lists.add("Teacher");

        System.out.println(Arrays.toString(lists.toArray()));

        System.out.println("Lists contains Vicheka? => " + lists.contains("Vicheka"));
        System.out.println("Lists contains Sopha? => " + lists.contains("Sopha"));

        System.out.println("======================");
        System.out.println("Output with Foreach");
        System.out.println("======================");
        lists.forEach(x -> System.out.println(x));
    }
}
