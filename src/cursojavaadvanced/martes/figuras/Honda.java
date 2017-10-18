package cursojavaadvanced.martes.figuras;

class Bike{
    int speedLimit = 90;
}

public class Honda extends Bike {
    int speedLimit = 150;
    
    public static void main(String[] args) {
        Bike obj = new Honda();
        System.out.println(obj.speedLimit);
    }
}
