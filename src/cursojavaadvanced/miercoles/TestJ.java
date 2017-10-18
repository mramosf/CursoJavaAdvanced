package cursojavaadvanced.miercoles;
//Join

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestJ extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
    
    public static void main(String[] args) {
        TestJ t1 = new TestJ(), 
                t2 = new TestJ(), 
                t3 = new TestJ();
        
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJ.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        t3.start();
    }
}
