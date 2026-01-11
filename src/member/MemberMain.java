package member;

import java.util.Scanner;
import java.util.List;

public class MemberMain {
    
    // 정보 메모리 저장 버전
    // private static final MemberRepository repository = new MemoryMemberRepository();

    // 정보 파일 저장 버전
    private static final MemberRepository repository = new FileMemberRepository();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "EUC-KR");
        
        while (true) {
            System.out.println("1. 회원등록 | 2. 회원목록 조회 | 3. 종료");
            System.out.print("선택 :");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 한라인 비는거 제거

            switch (choice) {
                case 1:
                    registerMember(scanner);
                    break;
                case 2:
                    displayMember();
                    break;
                case 3:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }
    }

    private static void registerMember(Scanner scanner) {
        System.out.print("ID 입력 : ");
        String id = scanner.nextLine();

        System.out.print("NAME 입력 : ");
        String name = scanner.nextLine();

        System.out.print("AGE 입력 : ");
        int age = scanner.nextInt();
        scanner.nextLine();  // 빈라인 제거

        Member newMember = new Member(id, name, age);
        repository.add(newMember);
        System.out.println("새로운 회원이 등록 되었습니다.");
    }

    private static void displayMember() {
        List<Member> members = repository.findAll();
        System.out.println("회원 목록입니다.");
        for (Member member : members) {
            System.out.printf("id = " + member.getId() + " name = " + member.getName() + 
            " age = " + member.getAge() + "\n");
        }
        System.out.println();
    }



    /*
    
    컴퓨터간에 주고받을때

    XML
    <member>
    <id>minu</id> ....

    json - 자바스크립트 호환
    { "member": { "id": "id1" ...... }}

    DB 실질적으로 데이터 저장

    */
}
