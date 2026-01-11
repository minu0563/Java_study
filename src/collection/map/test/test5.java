package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class test5 {
    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana", "orange");
        List<String> list2 = List.of("apple", "strawberry", "banana");

        Map<String, Integer> word = new HashMap<>();

        for (String i : list1){
            word.put(i, word.getOrDefault(i, 0) + 1);
        }

        for (String i : list2){
            word.put(i, word.getOrDefault(i, 0) + 1);
        }

        for (String key : word.keySet()){
            if (word.get(key) > 1) {
                System.out.println(key);
            }
        }
    }   
}
