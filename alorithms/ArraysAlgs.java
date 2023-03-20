package org.alorithms;

public class ArraysAlgs {

        private final int[] theArray = new int[50];
        private int arraySize = 10;

        public void generateRandomArray() {
            for (int i = 0; i < arraySize; i++) {
                theArray[i] = (int) (Math.random() * 10) + 10;
            }
        }

        public void printArray() {
            System.out.println("----------");
            for (int i = 0; i < arraySize; i++) {
                System.out.print("| " + i + " | ");
                System.out.println(theArray[i] + " |");
                System.out.println("----------");
            }
        }

        public int getValueAtIndex(int index) {
            if (index < arraySize)
                return theArray[index];

            else return -1;
        }

        public boolean doesArrayHaveValue(int num) {
            for (int i = 0; i < arraySize; i++) {
                if (theArray[i] == num) return true;
            }
            return false;
        }

        public void deleteAtIndex(int index) {
            for (int i = index; i < arraySize - 1; i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }

        public void insertValueEnd(int value) {
            if (arraySize < 50) {
                theArray[arraySize] = value;
                arraySize++;
            }
        }

        public String linerSearch(int value) {

            StringBuilder indicesWithValue = new StringBuilder();
            for (int i = 0; i < arraySize; i++) {
                if (theArray[i] == value) {
                    indicesWithValue.append(" ").append(i);
                }
            }
            return indicesWithValue.toString();
        }

        public static void main(String[] args) {
            ArraysAlgs newArray = new ArraysAlgs();
            newArray.generateRandomArray();
            newArray.printArray();
//        System.out.println(newArray.getValueAtIndex(3));
//        System.out.println(newArray.doesArrayHaveValue(2));
//        newArray.deleteAtIndex(4);
//        newArray.printArray();
//        newArray.insertValueEnd(11);
//        newArray.printArray();
            System.out.println(newArray.linerSearch(12));
        }


}
