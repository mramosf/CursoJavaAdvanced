package cursojavaadvanced.martes.abstraccion;

abstract class Bank {
    abstract float getRateOfInterest();
}

class SBI extends Bank {
    @Override
    float getRateOfInterest() {
        return 7.3f;
    }    
}

class PNB extends Bank {
    @Override
    float getRateOfInterest() {
        return 8.15f;
    }    
}

class ICICI extends Bank {
    @Override
    float getRateOfInterest() {
        return 9.45f;
    }    
}

class Test {
    public static void main(String[] args) {
        Bank b;
        String msg = "";
        b = new SBI();
        msg="Rate of interest is: " + b.getRateOfInterest() + " %";
        System.out.println(msg);
        
        b = new PNB();
        msg="Rate of interest is: " + b.getRateOfInterest() + " %";
        System.out.println(msg);
        
        b = new ICICI();
        msg="Rate of interest is: " + b.getRateOfInterest() + " %";
        System.out.println(msg);
    }
}