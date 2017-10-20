package cursojavaadvanced.viernes.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test4 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            System.out.println("Nombre del Host: " + ip.getHostName());
            System.out.println("Dirección IP: " + ip.getHostAddress());
        } catch (UnknownHostException ioe) {
            ioe.printStackTrace();
        }
    }
}
