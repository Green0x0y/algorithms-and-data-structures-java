package org.Tasks.Generics.Task;

import java.util.List;

public class TestSolution {
    public static void main(String[] args) {
        List<Long> longList = List.of(12L,1L,12L,678L);
        NumOperations<Long> numOp = new NumOperations<>(longList);
        System.out.println(numOp.maxValue());
        System.out.println(numOp.sortNumbers());
    }
}
