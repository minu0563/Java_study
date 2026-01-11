package collection.hash.test;

import java.util.HashSet;
import java.util.Set;

public class test1 {
    // 정수가 여러개 입력되고 중복값을 제거하고 출력
    // 30 20 20 10 10 출력되며 중복을 제거하고 출력하면됨

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();

        // 입력 부분
        for (Integer integer : inputArr) {
            set.add(integer);
        }
        
        // 출력부분
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }

}
