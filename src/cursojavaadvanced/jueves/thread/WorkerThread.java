package cursojavaadvanced.jueves.thread;

public class WorkerThread implements Runnable{
    private String msg;

    public WorkerThread(String s) {
        this.msg = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() 
                + "(Start) mensaje: " + msg);
        System.out.println(Thread.currentThread().getName() + "(END)");
    }
    
    private void processMsg(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
