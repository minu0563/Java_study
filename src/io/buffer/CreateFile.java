package io.buffer;

import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffer.BufferConst.FILE_NAME;
import static io.buffer.BufferConst.FILE_SIZE;

public class CreateFile {
    
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < FILE_SIZE; i ++){
            fos.write(i);
        }
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("file created = " + FILE_NAME);
        System.out.println("file size = " + FILE_SIZE / 1024 / 1024 + "Mb");
        System.out.println("걸린 시간 : " + (endTime - startTime) + "ms");
        
    }
}
