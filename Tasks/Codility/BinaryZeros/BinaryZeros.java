package org.Tasks.Codility.BinaryZeros;

public class BinaryZeros {
    public static int countZeros(int N){
        String bin = "";
        int currentMax = 0;
        int globalMax = 0;
        while( N > 0){
            bin  = N%2 + bin;
            N = N/2;
        }
        for(int i = 0 ; i < bin.length(); i++){
            if(Integer.parseInt(String.valueOf(bin.charAt(i)))%2 == 1){
                globalMax = Math.max(currentMax, globalMax);
                currentMax = 0;
            }
            else{
                currentMax++;
            }
        }
        System.out.println(bin);
        return globalMax;
    }

    public static void main(String[] args) {
        System.out.println(countZeros(2147483645));
    }
}
