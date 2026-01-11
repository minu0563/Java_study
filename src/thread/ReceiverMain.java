package thread;

import java.util.Scanner;

public class ReceiverMain {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Thread thread = new Thread(receiver);
        thread.start();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나 : ");
            String msg = sc.nextLine();

            System.out.println("[메인 스레드] 내가 보낸 메세지 : " + msg);

            if (msg.equals("exit")) {
                break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
