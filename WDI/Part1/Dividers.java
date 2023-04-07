package org.WDI.Part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Dividers {
   public static void dividers(int a){
      ArrayList<Integer> div = new ArrayList<>();
      if (a == 1){
         div.add(1);
      }
      else if (a == 2){
         div.add(1);
         div.add(2);
      }
       for(int i =1; i < Math.sqrt(a); i++){
          if( a % i == 0){
             div.add(i);
             div.add(a/i);
          }
       }
       if (a%Math.sqrt(a) == Math.sqrt(a)){
          div.add((int) Math.sqrt(a));

       }
      Collections.sort(div);
       div.forEach(n -> System.out.println(n + " "));

   }

   public static void main(String[] args) {
      dividers(7);
      dividers(3);
      dividers(323);


   }
}
