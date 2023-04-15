package org.Tasks.Java.Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(5);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer elem = it.next();
            System.out.println(elem);
        }
        TreeSet<Integer> subset = (TreeSet<Integer>) set.subSet(2,4);
        System.out.println(subset);
    }
}
