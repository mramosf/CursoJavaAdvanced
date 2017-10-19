package cursojavaadvanced.jueves.thread;
//A single task by multiple threads
public class TestM2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Task one");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new TestM2());
        Thread t2 = new Thread(new TestM2());
        
        t1.start();
        t2.start();
    }
}
