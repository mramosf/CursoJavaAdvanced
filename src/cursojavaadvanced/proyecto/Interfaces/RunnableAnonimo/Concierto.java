package cursojavaadvanced.proyecto.Interfaces.RunnableAnonimo;

import cursojavaadvanced.proyecto.Artista;
import cursojavaadvanced.proyecto.Interfaces.Hilos.Presentador;

public class Concierto {
    
    public static void main(String[] args) throws InterruptedException {
        Artista a1 = new Artista("maluma", "Mexicana", "Banda", 60);
        Artista a2 = new Artista("shakira", "Mexicana", "Banda", 50);
        Presentador c2 = new Presentador(a1);
        Presentador c1 = new Presentador(a2);
        
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                c1.presenta(a1);
                c1.canta(a1);
            }
        };
        
        Runnable r2 = new Runnable(){
            @Override
            public void run() {
                c2.presenta(a2);
                c2.canta(a2);
            }
        };
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t1.join();
        t2.start();
    }
}
