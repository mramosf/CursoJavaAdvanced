package cursojavaadvanced.lunes;

class Vehicle{
    void run(){
        System.out.println("El vehiculo esta corriendo...");
    }
}

public class Bike extends Vehicle{
    void run(){
        System.out.println("La bicicleta esta corriendo");
    }
    
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
