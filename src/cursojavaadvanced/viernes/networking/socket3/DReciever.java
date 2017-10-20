package cursojavaadvanced.viernes.networking.socket3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DReciever {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        System.out.println("Servidor");
        byte[] b = new byte[1024]; //1kb
        DatagramPacket dp = new DatagramPacket(b, 1024);
        
        ds.receive(dp);
        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);
        ds.close();
    }
}
