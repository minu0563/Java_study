package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("학생A", 90);
        studentMap.put("학생B", 80);
        studentMap.put("학생C", 80);
        studentMap.put("학생D", 100);
        studentMap.put("학생E", 90);

        for (String key : studentMap.keySet()){
            if (studentMap.get(key) == 80){
                System.out.println("학생 이름 : " + key);
            }
        }
    }
}
