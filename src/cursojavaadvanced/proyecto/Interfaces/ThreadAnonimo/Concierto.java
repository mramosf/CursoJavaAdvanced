package cursojavaadvanced.proyecto.Interfaces.ThreadAnonimo;

import cursojavaadvanced.proyecto.Artista;
import cursojavaadvanced.proyecto.Interfaces.Hilos.Presentador;

public class Concierto {
    
    public static void main(String[] args) throws InterruptedException {
        Artista a1 = new Artista("maluma", "Mexicana", "Banda", 60);
        Artista a2 = new Artista("shakira", "Mexicana", "Banda", 50);
        Presentador c1 = new Presentador(a1);
        
        Thread t1 = new Thread(){
            @Override
            public void run() {
                c1.presenta(a1);
                c1.canta(a1);
            }
        };
        
        Thread t2 = new Thread(){
            @Override
            public void run() {
                c1.presenta(a2);
                c1.canta(a2);
            }
        };
        
        t1.start();
        t1.join();
        t2.start();
    }
}
