package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain {
    
    public static void main(String[] args) throws IOException {
        
        /*
        aweejfio; >> 파일에 저장
        출력 스트림 <> 입력 스트림
        */

        // 파일에 데이터를 출력하는 스트림
        // 파일이 없으면 자동으로 만들고 데이터를 해당 파일에 저장
        // 폴더를 만들지 않음 폴더를 미리 만들고 작업
        FileOutputStream fos = new FileOutputStream("temp/hello.dat", true);
        // true : 기존 파일의 끝에 이어서 작성
        // false(기본값) : 기존 파일의 데이터를 지우고 처음부터 다시 작성
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.close();
        // 편집기나 개발툴에서 byte 단위의 데이터를 문자로 디코딩해서 보여줌

        // 파일에서 데이터를 읽어오는 기능
        FileInputStream fis = new FileInputStream("temp/hello.dat");
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());  // 읽을게 없으면 -1을 반환
        fis.close();
    }
}
