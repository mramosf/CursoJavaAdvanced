package cursojavaadvanced.miercoles;
//Name, ID, Priority, Estado, Current Thread
public class TestN extends Thread{

    @Override
    public void run() {
        System.out.println("Running");
    }
    
    public static void main(String[] args) {
        TestN t1 = new TestN();
        TestN t2 = new TestN();
        
        System.out.println("Nombre t1: " + t1.getName());
        System.out.println("ID t1: " + t1.getId());
        System.out.println("Priority t1: " + t1.getPriority());
        System.out.println("Estado t1: " + t1.getState());
        System.out.println("Nombre T1: " + Thread.currentThread());
        System.out.println("toString T1: " + t1.toString());
        
        System.out.println("");
        
        System.out.println("Nombre t2: " + t2.getName());
        System.out.println("ID t2: " + t2.getId());
        System.out.println("Priority t2: " + t2.getPriority());
        System.out.println("Estado t2: " + t2.getState());
        System.out.println("Nombre T2: " + Thread.currentThread());
        System.out.println("toString T2: " + t2.toString());
        
        t1.start();
        System.out.println("Estado t1: " + t1.getState());
        t2.start();
        System.out.println("Estado t2: " + t2.getState());
        
    }
}
