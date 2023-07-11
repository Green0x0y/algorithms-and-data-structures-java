package org.Tasks.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsCode {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("German");
        languages.add("Polish");
        processLangs(languages);
    }
    private static void processLangs(List<String> data){
        String lanuage= data.get(0);
        System.out.println(lanuage);
    }

}
