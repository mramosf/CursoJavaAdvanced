package cursojavaadvanced.proyecto.Interfaces.Hilos;

import cursojavaadvanced.proyecto.Artista;

public class Concierto {
    public static void main(String[] args) throws InterruptedException {
        Artista a1 = new Artista("maluma", "Mexicana", "Banda", 60);
        Artista a2 = new Artista("shakira", "Mexicana", "Banda", 50);
        Presentador c1 = new Presentador(a1);
        Presentador c2 = new Presentador(a2);
        
        c1.start();
        c1.join();
        c2.start();
    }
}
