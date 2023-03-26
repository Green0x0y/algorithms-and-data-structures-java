package org.Alorithms;

public class SortAlgsN2 {
    private final int arraySize = 10;
    private final int[] arr = new int[arraySize];

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            arr[i] = (int) (Math.random() * 10) + 10;
        }
    }
    public void printArray() {

        for (int i = 0; i < arraySize; i++) {

            System.out.print("| " + arr[i] + " ");

        }
        System.out.println(" ");
    }
    public void bubbleSort(){
        for(int i = 0; i < arraySize -1; i++){
            for(int j = 0; j < arraySize - i - 1 ; j++){
                if (arr[j] > arr[j+1]){
                    arr[j] = arr[j+1] + arr[j];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] -= arr[j+1];

                }
            }
        }
    }
    public void insertionSort(){
        // na lewo od key tablica posortowana
        // ma prawo do posortowania
        int key;
        for(int i =1; i< arraySize; i++){
            key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public void selectionSort(){
        // szukamy najmniejszych liczb i układamy od lewej
        for( int i = 0; i< arraySize-1; i++){
            for( int j = i+1; j<arraySize; j++){
                if (arr[i] > arr[j]){
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
    }

    public static void main(String[] args){
        SortAlgsN2 array = new SortAlgsN2();
        array.generateRandomArray();
        array.printArray();
        array.selectionSort();
        array.printArray();
    }
}

