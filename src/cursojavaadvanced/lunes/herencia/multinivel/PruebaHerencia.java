package cursojavaadvanced.lunes.herencia.multinivel;

class Animal {
    void comer(){
        System.out.println("Comiendo...");
    }
}

class Perro extends Animal {
    void ladrar(){
        System.out.println("Ladrando...");
    }
}

class Cachorro extends Perro {
    void correr(){
        System.out.println("Corriendo...");
    }
}

public class PruebaHerencia {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.comer();
        c.ladrar();
        c.correr();
    }
}
