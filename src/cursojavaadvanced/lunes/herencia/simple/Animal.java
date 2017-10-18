package cursojavaadvanced.lunes.herencia.simple;

//Herencia simple
public class Animal {
    void eat(){
        System.out.println("Comiendo...");
    }
}

class Perro extends Animal {
    void ladrar(){
        System.out.println("Ladrando...");
    }
}

class PruebaHerencia {
    public static void main(String[] args) {
        Perro p = new Perro();
        p.eat();
        p.ladrar();
    }
}
