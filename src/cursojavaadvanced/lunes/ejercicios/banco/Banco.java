package cursojavaadvanced.lunes.ejercicios.banco;

//Ejercicio de Override
public class Banco {
    public float getRateOfInterest(){
        return 20.0f;
    }
}

class SBI extends Banco{
    public float getRateOfInterest(){
        return 15.0f;
    }
}

class ICICI extends Banco{
    public float getRateOfInterest(){
        return 25.0f;
    }
}

class AXIS extends Banco{
    public float getRateOfInterest(){
        return 30.0f;
    }
}

class Test{
    public static void main(String[] args) {
        Banco banco = new Banco();
        SBI bancoSBI = new SBI();
        ICICI bancoICICI = new ICICI();
        AXIS bancoAXIS = new AXIS();
        String msg;
        
        msg = "The Global Rate Of Interest is: " + 
                banco.getRateOfInterest();
        System.out.println(msg);
        
        msg = "The Rate Of Interest of SBI Bank is: " + 
                bancoSBI.getRateOfInterest();
        System.out.println(msg);
        
        msg = "The Rate Of Interest of ICICI Bank is: " + 
                bancoICICI.getRateOfInterest();
        System.out.println(msg);
        
        msg = "The Rate Of Interest of AXIS Bank is: " + 
                bancoAXIS.getRateOfInterest();
        System.out.println(msg);
    }
}