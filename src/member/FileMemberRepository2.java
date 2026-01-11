package member;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileMemberRepository2 implements MemberRepository {

    /*
    
    try-with-resources
    try {
    // 정상흐름
    } catch {
        // 예외 발생시의 대처 방안 ex: log남기고, 메세지 남기기 등 
    } finally {
        // 자원해제, 연결해제 
    }


    try (Resource resource = new Resource()) {
    // 리소스를 사용하는 코드
    }

    */
    @Override
    public void add(Member member) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(
                FIIL_NAME, StandardCharsets.UTF_8, true))) {

            bw.write(member.getId() + DELMITER + member.getName() + DELMITER + member.getAge());
            bw.newLine();
            bw.close();

        } catch (IOException e) {

            // 로그남기기
            // 메세지 등등...
            throw new RuntimeException(e);
        }
    }
}

