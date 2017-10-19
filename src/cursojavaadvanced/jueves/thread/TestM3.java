package cursojavaadvanced.jueves.thread;
//Performing two task by two threads

class Simple extends Thread {

    @Override
    public void run() {
        System.out.println("Task one");
    }
}

class Simple2 extends Thread {

    @Override
    public void run() {
        System.out.println("Task two");
    }
}

public class TestM3 {
    public static void main(String[] args) {
        Simple s = new Simple();
        Simple2 s2 = new Simple2();
        
        s.start();
        s2.start();
    }
}
