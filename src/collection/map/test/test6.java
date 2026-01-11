package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "EUC-KR");  // UTF-8 사용시 한국어 깨짐?? 왜이런지 모르겠ㅇ므;;;;
        Map<String, String> wordMap = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true){
            System.out.print("단어를 입력하세요 (종료는 'q'): ");
            String eword = scanner.nextLine();
            if (eword.equals("q")){
                break;
            }

            System.out.print("한글 뜻을 입력하세요: ");
            String kword = scanner.nextLine();

            wordMap.put(eword, kword);
        }
        
        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String eword = scanner.nextLine();
            if (eword.equals("q")){
                break;
            }

            if (wordMap.containsKey(eword)){
                System.out.println(wordMap.get(eword));
            }
            else {
                System.out.println(eword + "은(는) 사전에 없는 단어입니다.");
            }
        }
        scanner.close();
    }
}
