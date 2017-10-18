package cursojavaadvanced.martes.interfaces;

public class Printable implements print{

    @Override
    public void print() {
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        Printable p = new Printable();
        p.print();
    }
}
