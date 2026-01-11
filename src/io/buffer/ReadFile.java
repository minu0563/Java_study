package io.buffer;

import static io.buffer.BufferConst.FILE_NAME;
import static io.buffer.BufferConst.FILE_SIZE;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);

        long startTime = System.currentTimeMillis();

        int filesize = 0;
        int data;
        while ((data = fis.read()) != -1) {
            filesize++;
        }
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("file name = " + FILE_NAME);
        System.out.println("file size = " + FILE_SIZE / 1024 / 1024 + "Mb");
        System.out.println("걸린 시간 : " + (endTime - startTime) + "ms");

        /*
        
        10Mb 파일 하나 만드는데 14초 읽는데 11초
        -> 자바에서 1byte씩 디스크에 전달하는데 1000만번 반복

        */
    }
}
