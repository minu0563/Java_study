package collection.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class ex1 {
    /*HashSet : 해시자료구조를 이요해서 저장
    순서 무시, 데이터만 중요하고 순서가 중요하지않을때
    
    LinkedHashSet : HashSet + Linked set 자료 구조를 유지하면서 순서가 필요할때
    HashSet
    
    TreeSet : 트리구조, 안에 요소들이 정렬된 상태로 저장*/

    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
