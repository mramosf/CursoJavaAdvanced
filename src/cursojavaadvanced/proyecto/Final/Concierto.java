package cursojavaadvanced.proyecto.Final;

import cursojavaadvanced.proyecto.Artista;
import java.util.ArrayList;

public class Concierto {
    Artista a1 = null;
    Artista a2 = null;
    ArrayList<Artista> artistas = null;
    public static void main(String[] args) throws InterruptedException {
        Concierto concierto = new Concierto();
        Presentador c1 = new Presentador();
        
        Thread registraArtistas = new Thread(){
            @Override
            public void run() {
                concierto.a1 = c1.registroArtista("ActaRegistroMaluma.txt");
                concierto.a2 = c1.registroArtista("ActaRegistroShakira.txt");
                concierto.artistas = new ArrayList<>();
                concierto.artistas.add(concierto.a1);
                concierto.artistas.add(concierto.a2);
            }
        };
        
        Thread presentaArtista = new Thread(){
            @Override
            public void run() {
                c1.presenta(concierto.a1);
            }
        };
        
        Thread cantaArtista = new Thread(){
            @Override
            public void run() {
                c1.canta(concierto.a1);
            }
        };
        
        Thread presentaArtista2 = new Thread(){
            @Override
            public void run() {
                c1.presenta(concierto.a2);
            }
        };
        
        Thread cantaArtista2 = new Thread(){
            @Override
            public void run() {
                c1.canta(concierto.a2);
            }
        };
        
        Thread registraBitacora = new Thread(){
            @Override
            public void run() {
                c1.bitacora(concierto.artistas);
            }
        };
        
        registraArtistas.start();
        registraArtistas.join();
        presentaArtista.start();
        cantaArtista.start();
        cantaArtista.join();
        presentaArtista2.start();
        cantaArtista2.start();
        cantaArtista2.join();
        registraBitacora.start();
    }
}