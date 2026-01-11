package chat.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static chat.tcp.util.*;


public class ClientV2 {
    private static int PORT = 12345;
    // 클라이언트 <-> 서버 메시지 주고받기 exit 입력하면 그때 종료

    public static void main(String[] args) throws IOException {
        log("클라이언트 시작");
        Socket socket = new Socket("localhost", PORT);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        log("소켓 연결 : " + socket);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String toSend = scanner.nextLine();

            // 서버에 문자 보내기
            output.writeUTF(toSend);
            log("clinet >>> server : " + toSend);

            if (toSend.equals("exit")){
                break;
            }

            // 서버로부터 문자 받기
            String received = input.readUTF();
            log("clinet <<< server : " + received);
        }

        log("연결 종료 : " + socket);
        input.close();
        output.close();
        scanner.close();
        socket.close();
    }
}
