package org.Tasks.Generics.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumOperations<N extends Number & Comparable<N>> {
    private List<N> numbers;

    public List<N> getNumbers() {
        return numbers;
    }

    public NumOperations(List<N> nums){
        this.numbers = new ArrayList<>(nums);
    }
    public List<N> sortNumbers(){
        Collections.sort(numbers);
        return numbers;
    }
    public N maxValue(){
       return Collections.max(numbers);
    }
}
