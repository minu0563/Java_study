package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {
    
    public static void main(String[] args) throws IOException {
        // byte 하나씩 xxx byte[]
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = {65, 66, 67, 68};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");

        // read(byte[], offset, length)
        // byte[] : 데이터가 읽혀지는 부분
        // offset : 데이터가 기록되는 byte[]의 시작위치
        // length : 읽어올 byte의 최대 길이
        byte[] buffer = new byte[10];
        int cnt = fis.read(buffer, 0, 10);

        System.out.println("cnt = " + cnt);
        System.out.println(Arrays.toString(buffer));

        fis.close();
        
        // 한번에 읽기 vs 여러개로 나누어서 읽기
    }
}
