package cursojavaadvanced.miercoles;

public class MultiHilos2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Corriendo");
    }
    
    public static void main(String[] args) {
        MultiHilos2 m2 = new MultiHilos2();
        Thread t2 = new Thread(m2);
        t2.start();
    }
}
