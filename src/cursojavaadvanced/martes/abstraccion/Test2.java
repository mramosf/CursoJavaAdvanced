package cursojavaadvanced.martes.abstraccion;

abstract class Bike {

    public Bike() {
        System.out.println("La bicicleta se ha creado");
    }
    
    abstract void run();
    void changeColor(){
        System.out.println("Color cambiado");
    }
}

class Honda extends Bike {
    @Override
    void run() {
        System.out.println("Corriendo");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Bike ob = new Honda();
        ob.run();
        ob.changeColor();
    }
}
