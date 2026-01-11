package io.file;

import java.io.File;
import java.io.IOException;

public class Path {
    public static void main(String[] args) throws IOException {
        File file = new File("temp/..");
        System.out.println("path = " + file.getPath());

        // 절대경로
        System.out.println("Absolute path : " + file.getAbsolutePath());

        // 정규 경로
        System.out.println("Canonical path : " +  file.getCanonicalPath());
    }
}
