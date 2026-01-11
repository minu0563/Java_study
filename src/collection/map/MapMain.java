package collection.map;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class MapMain {
    /*
    map 자료구조 특징 hashmap, linkedmap, treemap
    key - value  형태의 자료를 저장하는 구조
    key 자료내에서 유일해야 함. 그리고 key값을 이용해서 검색
    key 중복 될수 없지만 value(값)은 중복될수 있음
    map 순서 x 
    */

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // arrayList : hashMap = 2:8
        // 학생 데이터 추가
        studentMap.put("student1", 90);
        studentMap.put("student2", 100);
        studentMap.put("student3", 50);
        studentMap.put("student4", 70);

        System.out.println(studentMap);

        // 특정 학생 학생의 값 조회
        Integer result = studentMap.get("student3");
        System.out.println("result = " + result);

        System.out.println("keyset 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        // entrySet map 의 key-value 쌍을 예쁘게 반환 Set<Map.Entry<K, V>>
        // size() map의 크기 구하는데 key - value 쌍의 개수 반환
        // isempty() map 이 비어있는지 여부 체크
        // clear() map의 내용 비우는 기능
    }
    /*
    
    hashmap : hash 구조를 이용해서 자료 저장 key값이 해시 함수를 통해 해시코드로 변환되고
              이 해시코드는 데이터저장, 검색하는데 쓰임 순서 보장 x

    linkedmap : hashmap 과 유사한 삽입 순서 또는 접근 순서를 기억 약간 속도 느려짐

    treemap : 레드-블랙트리구조 기반으로 작동함
              모든 키는 생성자의 의해 제공된 순서로 정렬됨

    */
}
