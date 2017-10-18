package cursojavaadvanced.miercoles;

//Daemons
public class TestD extends Thread{

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread work");
        }else{
            System.out.println("User thread work");
        }
    }
    
    public static void main(String[] args) {
        TestD t1 = new TestD();
        TestD t2 = new TestD();
        TestD t3 = new TestD();
        
        t1.setDaemon(true);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
