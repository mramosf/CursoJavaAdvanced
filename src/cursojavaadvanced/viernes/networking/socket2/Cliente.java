package cursojavaadvanced.viernes.networking.socket2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3000);
            String msg = "", msg2 = "";
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dot = new DataOutputStream(s.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            while (!msg.equals("stop")) {                
                //El cliente envia mensajes al servidor
                msg = br.readLine();
                dot.writeUTF(msg);
                dot.flush();
                
                //El cliente recibe mensajes del servidor
                msg2 = din.readUTF();
                System.out.println("El servidor dice: " + msg2);
            }
            closeStrams(din, dot, s);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void closeStrams(DataInputStream din, DataOutputStream dot, Socket s) throws IOException {
        din.close();
        dot.close();
        s.close();
    }
}
