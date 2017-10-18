package cursojavaadvanced.miercoles.carrera;

public class Carrera {
    public static void main(String[] args) {
        Tortuga tortuga = new Tortuga();
        /*Liebre l = new Liebre();
        Thread liebre = new Thread(l);*/
        Thread liebre = new Thread(new Liebre());
        
        tortuga.start();
        liebre.start();
    }
}
