package io.text;

import static io.buffer.BufferConst.FILE_NAME;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReaderWriteMain {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";

        // 문자 > byte UTF-8 인코딩
        byte[] writeByte = writeString.getBytes(StandardCharsets.UTF_8);
        System.out.println("writeString = " + writeString);
        System.out.println("writeByte = " + writeByte);
        
        // 파일에 저장(쓰기)
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        fos.write(writeByte);
        fos.close();

        // 파일에서 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        byte[] readByte = fis.readAllBytes();
        // readAllBytes vs BufferedOutputStream

        // byte -> string utf-8 디코딩 
        String readString = new String(readByte, StandardCharsets.UTF_8);

        System.out.println("readByte = " + readByte);
        System.out.println("readString = " + readString);
    }
}
