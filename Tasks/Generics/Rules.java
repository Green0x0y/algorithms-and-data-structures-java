package org.Tasks.Generics;

import java.util.ArrayList;
import java.util.List;

public class Rules {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        int number = ints.get(0);
        System.out.println(number);

        List<String> langs = new ArrayList<>();
        langs.add("Eng");
    }
}
