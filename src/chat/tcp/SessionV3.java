package chat.tcp;

import static chat.tcp.util.*;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SessionV3 implements Runnable {
    private final Socket socket;

    public SessionV3(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String received = input.readUTF();
                log("client >>> server : " + received);

                if (received.equals("exit")){
                    break;
                }

                // 클라이언트로 문자 보내기
                String toSend  = received + "World";
                output.writeUTF(toSend);
                log("server >>> client");
            }

            input.close();
            output.close();
            socket.close();
            
        } catch(IOException e) {
            throw new RuntimeException(e);
        }


    }
}
