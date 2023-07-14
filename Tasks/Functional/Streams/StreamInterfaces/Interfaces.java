package org.Tasks.Functional.Streams.StreamInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Interfaces {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
        numberList.stream()
                .map(num -> num*2)           // function
                .filter(num -> num < 3)      // predicate
                .forEach(num -> System.out.println(num));  //consumer

        Supplier<Integer> intSupplier = () -> 4;

        System.out.println(intSupplier.get());

        // predicate -> test
        // function -> apply
        // customer -> accept
        // supplier -> get

    }
}
