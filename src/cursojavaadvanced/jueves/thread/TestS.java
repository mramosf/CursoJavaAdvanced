package cursojavaadvanced.jueves.thread;

class MThread extends Thread{
    @Override
    public void run() {
        System.out.println("Shutdown task");
    }
}

public class TestS{
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MThread());
        
        System.out.println("No main... press ctrl+c");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
