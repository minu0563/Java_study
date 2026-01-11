package chat.tcp;

import java.io.IOException;
import java.net.InetAddress;

public class IPMain {
    
    public static void main(String[] args) throws IOException {
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println(localhost);

        InetAddress google = InetAddress.getByName("google.com");
        System.out.println(google);
    }
}
