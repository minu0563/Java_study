package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class test4 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> word = new HashMap<>();
        
        String[] words = text.split(" ");

        for (String i : words){
            word.put(i, word.getOrDefault(i, 0) + 1);
        }

        for (String key : word.keySet()){
            System.out.println(key + " : " + word.get(key));
        }
    }
}
