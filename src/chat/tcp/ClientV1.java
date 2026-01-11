package chat.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import static chat.tcp.util.*;

public class ClientV1 {
    // 서버가 기다리고 있는 포트 번호와 동일해야함
    private static int PORT = 12345;

    public static void main(String[] args) throws IOException {
        
        log("클라이언트 시작");
        
        /*
        
        소켓 연결
            localhost : 내 컴퓨터 의미 (127.0.....)
            PORT : 서버가 열어둔 포트번호
            서버와 TCP 3-way handshake 실행
        
        */
        Socket socket = new Socket("localhost", PORT);
        // 서버와 연결되어있는 연결점

        // 입출력 스트림 생성
        // socket.getInputStream() : 서버로부터 데이터를 읽어오는 부분
        // socket.getOutputStream() : 서버로 데이터를 보내는 부분
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        log("소켓 연결 : " + socket);

        // 서버에 문자 보내기
        // writUTF() : UTF-8 방식으로 인코딩해서 보냄
        String toSend = "Hello";
        output.writeUTF(toSend);
        log("client >> server : " + toSend);

        // 서버로 부터 문자 받기
        // readUTF() : 서버가 데이터를 보낼때까지 기다렸다가(blocking)
        // 서버에서 뭔가 날라오면 그때 그걸 읽어서 실행
        String received = input.readUTF();
        log("client <<< server : " + received);

        // 자원정리 : 연결 해제
        // 통신이 끝났으므로 사용한 것들 전부다 해제
        log("연결 종료 : " + socket);
        input.close();
        output.close();
        socket.close();
    }
}
