package thread;

public class Receiver implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(5000);
                System.out.println("수신하는 부분 - 5초마다 뭔가 실행됨");
                System.out.print("채팅을 입력하세요 : ");
            } 
            
        }   catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
    }
}
