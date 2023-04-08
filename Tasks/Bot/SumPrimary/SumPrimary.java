package org.Tasks.Bot.SumPrimary;

public class SumPrimary {
    private static boolean isPrimary(int num){
        for(int i =2; i <= Math.sqrt(num); i++){
            if( num % i == 0){
                return false;
            }

        }
        return true;
    }
    public static int sumPr(int num){
        int sum = 0;
        for( int i = 2; i < num; i++){

            if(isPrimary(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumPr(10));
        //2 + 3 + 5 + 7 = 17
    }
}
