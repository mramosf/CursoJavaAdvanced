package cursojavaadvanced.jueves.sincronizacion;

class Mesa2 {
    synchronized void mostrarMesa(int n){
        for (int i = 0; i < 5; i++) {
            System.out.println("n*i");
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        final Mesa mesa = new Mesa();
        
        Thread t1 = new Thread(){
            @Override
            public void run() {
                mesa.mostrarMesa(100);
            }
        };
        
        Thread t2 = new Thread(){
            @Override
            public void run() {
                mesa.mostrarMesa(5);
            }
        };
        
        t1.start();
        t2.start();
    }
}
