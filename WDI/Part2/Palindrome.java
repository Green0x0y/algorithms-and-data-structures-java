package org.WDI.Part2;
//Napisz program wczytujący liczbę naturalną z
// klawiatury i odpowiadający na pytanie, czy
//liczba naturalna jest palindromem, a następnie
// czy jest palindromem w systemie dwójkowym.
public class Palindrome {
    public static boolean palindrome(int num){
        // 101 -> "101" - > len/2 - > wskaźnik od przodu i tyłu
        String num_string = Integer.toString(num);
        if (num_string.length() == 1) return true;
        for(int i = 0; i < num_string.length()/2; i++){
            if(num_string.charAt(i) != (num_string.charAt(num_string.length()-1-i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(5));
        System.out.println(palindrome(121));
        System.out.println(palindrome(123321));
        System.out.println(palindrome(124321));

    }
}
