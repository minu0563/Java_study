package chat.tcp;

import static chat.tcp.util.*;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    private static int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작 ");
        ServerSocket serverSocket = new ServerSocket(PORT);
        // 서버소켓 서버쪽에서만 사용하는 특별한 소켓
        log("서버 소켓 시작 - 리스닝포인트" + PORT);

        Socket socket = serverSocket.accept();
        // 실제 클라이언트와 서버가 주고 받기 위해 준비가 되었다
        log("소켓 연결 : " + socket);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        //클라이언트로 부터 문자 받기
        String received = input.readUTF();
        log("client >>> server : " + received);

        // 클라이언트로 문자 보내기
        String toSend  = received + "World";
        output.writeUTF(toSend);
        log("server >>> client");

        // 자원정리 - 연결 해제
        input.close();
        output.close();
        socket.close();
        serverSocket.close();
    }
}
