package collection.hash.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test2 {
    /*두 개의 세트 set1, set2가 주어졌을 때, 두 세트의 합집합, 교집합, 차집합을 구해서 출력하세요. 출력 결과의 순서는 상관없습니다. */

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 합집합
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합 = " + union);

        // 교집합
        Set<Integer> isn = new HashSet<>(set1);
        isn.retainAll(set2);
        System.out.println("교집합 = " + isn);

        // 차집합
        Set<Integer> dff = new HashSet<>(set1);
        dff.removeAll(set2);
        System.out.println("차집합 = " + dff);
    }
    
}
