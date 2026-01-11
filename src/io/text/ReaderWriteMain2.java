package io.text;

import static io.buffer.BufferConst.FILE_NAME;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class ReaderWriteMain2 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        // OutputStreamWriter, InputStreamReadr
        // 스트림(byte) 대신에 문자를 저장할수있게 지원
        System.out.println("writeString = " + writeString);
        
        // 파일에 저장(쓰기)
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write(writeString);
        osw.close();

        // 파일에서 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        
        StringBuilder content = new StringBuilder();

        int cnt;
        while ((cnt = isr.read()) != -1){
            content.append((char)cnt);
        }

        System.out.println("read String = " + content);
    }
}
