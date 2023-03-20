package org.alorithms;

import java.util.Arrays;

public class Stack {
    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1; //empty

    Stack(int size){
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }
    public void push(String input){
        if(topOfStack + 1 < stackSize){
            topOfStack++;
            stackArray[topOfStack] = input;

        } else System.out.println("not enough space");
        displayTheStack();
    }
    public String pop(){
        if (topOfStack > -1){
            stackArray[topOfStack] = "-1";
            topOfStack--;
        }
        displayTheStack();
        return stackArray[topOfStack];
    }
    public void top(){
        System.out.println(stackArray[topOfStack]);
    }
    public void pushMany(String multipleVals){
        String[] temp = multipleVals.split(" ");
        for(int i = 0; i < temp.length; i++){
            push(temp[i]);
        }
    }
    void popAll(){
        for (int i = topOfStack; i > -1; i--){
            pop();
        }

    }
    public void displayTheStack() {
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < stackSize; n++) {
            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < stackSize; n++) {
            if (stackArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s " + " ", stackArray[n]));
        }

        System.out.println("|");
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
    }
        public static void main(String[] args) {
            Stack stack= new Stack(10);
            stack.push("10");
            stack.push("8");
            stack.pushMany("1 2 3");
            stack.pop();
            stack.top();
    }
}
