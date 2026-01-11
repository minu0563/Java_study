package io.text;

import static io.buffer.BufferConst.FILE_NAME;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReaderWriteMain4 {
    
    public static final int BUFFER_SIZE = 8196;  // 8kb

    public static void main(String[] args) throws IOException {
        /*
        BufferedReader BufferedWriter  >>>  한줄단위로 읽는 기능
        */

        String writString = "ABC \n가나다";
        System.out.println("=======================");
        System.out.println("writeString = " + writString);

        // 파일에 쓰기
        FileWriter fw = new FileWriter(FILE_NAME, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE);
        bw.write(writString);
        bw.close();

        // 파일에서 읽기
        StringBuilder content = new StringBuilder();
        FileReader fr = new FileReader(FILE_NAME, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);
        
        String line;
        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }
        br.close();

        System.out.println("=======================");
        System.out.println("read String = " + content);
    }
}
