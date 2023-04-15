package org.Tasks.Java.LinkedList;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Plum");
        String first = list.getFirst();
        System.out.println(first);
        String last = list.getLast();
        System.out.println(last);
        list.removeFirst();
        list.addFirst("Potato");
        System.out.println(list.getFirst());
        String el = list.get(0);
        System.out.println(el);
        System.out.println(list.indexOf("Plum"));
        for(String str:list){
            System.out.println(str);
        }
    }
}
