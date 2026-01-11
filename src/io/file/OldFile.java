package io.file;

import java.io.File;
import java.io.IOException;

public class OldFile {
    
    public static void main(String[] args) throws IOException {
        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");

        //  파일 존재확인  디렉토리의 존재확인
        System.out.println("file exist" + file.exists());

        // 새파일 생성
        boolean create = file.createNewFile();
        System.out.println("파일 생성 : " + create);

        // 새 디렉토리 생성
        boolean dirceate = directory.mkdir();
        System.out.println("파일 경로 : " + dirceate);

        // 파일이나 디렉토리 지우기
        boolean delete = file.delete();

        // 파일인지 확인
        System.out.println(file.isFile());

        // 디렉토리인지 확인
        System.out.println(directory.isDirectory());

        // 파일이름 변경
        File newFile = new File("temp/newExample.txt");
        boolean rename = file.renameTo(newFile);
    }
}
