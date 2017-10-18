package cursojavaadvanced.martes.interfaces.pruebas;

import cursojavaadvanced.martes.interfaces.Bank;

class SBI implements Bank {
    
    @Override
    public float getRateOfInterest() {
        return 9.15f;
    }
}

class PNB implements Bank {
    
    @Override
    public float getRateOfInterest() {
        return 9.7f;
    }
}

class ICICI implements Bank {
    
    @Override
    public float getRateOfInterest() {
        return 8.3f;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(b.getRateOfInterest());
        
        b = new PNB();
        System.out.println(b.getRateOfInterest());
        
        b = new ICICI();
        System.out.println(b.getRateOfInterest());
    }
}
