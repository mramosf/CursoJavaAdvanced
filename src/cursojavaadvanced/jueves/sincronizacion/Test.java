package cursojavaadvanced.jueves.sincronizacion;

class Mesa{
    synchronized void mostrarMesa(int n){
        for (int i = 0; i < 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class MyT extends Thread{
    Mesa m;
    MyT(Mesa m){
        this.m = m;
    }

    @Override
    public void run() {
        m.mostrarMesa(100);
    }
}

class MyT2 extends Thread{
    Mesa m;
    MyT2(Mesa m){
        this.m = m;
    }

    @Override
    public void run() {
        m.mostrarMesa(5);
    }
}

public class Test {
    public static void main(String[] args) {
        Mesa m = new Mesa();
        MyT t1 = new MyT(m);
        MyT2 t2 = new MyT2(m);
        
        t1.start();
        t2.start();
    }
}
