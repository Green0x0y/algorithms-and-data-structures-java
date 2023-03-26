package org.Alorithms;

import java.util.Arrays;

public class Queue {
    private String[] queueArray;
    private int size;
    private int front, end, numOfItems = 0;
    Queue(int size){
        this.size = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }
    public void insert(String  elem){
        if(numOfItems + 1 <= size){
            queueArray[end] = elem;
            numOfItems++;
            end++;
        }
        else System.out.println("queue is full");

    }
    public void remove(){
        if(numOfItems > 0){
            queueArray[front] = "-1";
            front++;
            numOfItems--;
        }
        else System.out.println("no elements");

    }
    public void peak(){
        System.out.println("The first element is" + queueArray[front]);
    }
    public void priorityInsert(String input){
        int i;
        if(numOfItems ==0){
            insert(input);
        }

        else if ( numOfItems + 1<= size){
            for(i = numOfItems-1; i>=0; i--){
                if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){
                    queueArray[i+1] = queueArray[i];
                }else break;

            }
            queueArray[i+1] = input;
            end++;
            numOfItems++;
        }
    }
    public static void main(String[] args) {
        Queue qu = new Queue(10);
        qu.insert("10");
        qu.peak();
        qu.remove();

    }

}
