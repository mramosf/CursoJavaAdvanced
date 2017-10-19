package cursojavaadvanced.jueves.thread;

public class ThreadGroupT implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        ThreadGroupT runnable = new ThreadGroupT();
        ThreadGroup tg1 = new ThreadGroup("Grupo Padre");
        
        Thread t1 = new Thread(tg1, runnable, "uno");
        t1.start();
        Thread t2 = new Thread(tg1, runnable, "dos");
        t2.start();
        Thread t3 = new Thread(tg1, runnable, "tres");
        t3.start();
        
        System.out.println("Thread Group Name: " + tg1.getName());
        tg1.list();
    }
}
