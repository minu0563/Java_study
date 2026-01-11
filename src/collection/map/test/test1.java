package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class test1 {
    
    public static void main(String[] args) {
        String[][] productArr = {{"java", "10000"}, {"spring", "20000"}, {"jpa", "30000"}};

        // 배열을 Map구조로 바꾸기
        Map<String, String> bookMap = new HashMap<>();

        for (String[]  book : productArr) {
            bookMap.put(book[0], String.valueOf(book[1]));
        }

        // map 내용 전부 출력
        for (String key : bookMap.keySet()) {
            System.out.println("책 이름 : " + key + " 가격 : " + bookMap.get(key));
        }
    }
}
