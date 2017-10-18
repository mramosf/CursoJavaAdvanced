package cursojavaadvanced.miercoles;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiHilos extends Thread {
    public void run(){
        System.out.println("Corriendo");
    }
    
    public static void main(String[] args) {
        MultiHilos t1 = new MultiHilos();
        t1.start();
    }
}
