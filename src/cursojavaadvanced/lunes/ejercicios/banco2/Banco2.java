package cursojavaadvanced.lunes.ejercicios.banco2;

//Ejercicio de Polimorfismo en tiempo de ejecución
public class Banco2 {
    public float getRateOfInterest(){
        return 20.0f;
    }
}

class SBI extends Banco2{
    public float getRateOfInterest(){
        return 15.0f;
    }
}

class ICICI extends Banco2{
    public float getRateOfInterest(){
        return 25.0f;
    }
}

class AXIS extends Banco2{
    public float getRateOfInterest(){
        return 30.0f;
    }
}

class Test{
    public static void main(String[] args) {
        String msg;
        Banco2 banco = new Banco2();
        msg = "The Global Rate Of Interest is: " + 
                banco.getRateOfInterest();
        System.out.println(msg);
        
        banco = new SBI();
        msg = "The Rate Of Interest of SBI Bank is: " + 
                banco.getRateOfInterest();
        System.out.println(msg);
        
        banco = new ICICI();
        msg = "The Rate Of Interest of ICICI Bank is: " + 
                banco.getRateOfInterest();
        System.out.println(msg);
        
        banco = new AXIS();
        msg = "The Rate Of Interest of AXIS Bank is: " + 
                banco.getRateOfInterest();
        System.out.println(msg);
    }
}