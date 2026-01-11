package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class test3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("학생A", 50);

        // 학생 A의 점수가 100점으로 다시 들어온다면?
        int a;
        String name = "학생A";
        int score = 100;

        for (String key : studentMap.keySet()){
            a = studentMap.get(key);

            if (key.equals(name) && a < score){
                studentMap.put(name, score);
            }
        }

        System.out.println(studentMap);        
    }
}
