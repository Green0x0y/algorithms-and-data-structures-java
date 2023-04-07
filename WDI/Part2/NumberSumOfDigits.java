package org.WDI.Part2;
//Napisz program wczytujący liczbę naturalną z
// klawiatury i odpowiadający na pytanie, czy
//liczba ta zawiera cyfrę równą liczbie swoich cyfr.
public class NumberSumOfDigits {
    public static boolean isSum(int num){

        String string_num = Integer.toString(num);
        int digits = string_num.length();
        while(num / 10 != 0){
            if(digits == num%10){
                return true;
            }
            num /=10;
        }
        return num % 10 == digits;
    }

    public static void main(String[] args) {
        System.out.println(isSum(100));
        System.out.println(isSum(123));
        System.out.println(isSum(1));
    }
}
