package cursojavaadvanced.viernes.networking.socket2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    public static void main(String[] args) {
        try {
            String msg = "", msg2 = "";
            ServerSocket ss = new ServerSocket(3000);
            Socket s = ss.accept();
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dot = new DataOutputStream(s.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            while (!msg.equals("stop")) {                
                //El servidor recibe mensajes del cliente
                msg = din.readUTF();
                System.out.println("El cliente dice: " + msg);
                
                //El servidor envia mensajes al cliente
                msg2 = br.readLine();
                dot.writeUTF(msg2);
                dot.flush();
            }
            closeStreams(din, dot, s, ss);
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void closeStreams(DataInputStream din, DataOutputStream dot, Socket s, ServerSocket ss) throws IOException {
        din.close();
        dot.close();
        s.close();
        ss.close();
    }
    
}
