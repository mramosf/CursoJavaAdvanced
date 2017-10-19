package cursojavaadvanced.proyecto.Interfaces.Hilos;

import cursojavaadvanced.proyecto.Interfaces.*;
import cursojavaadvanced.lunes.LoadImageApp;
import cursojavaadvanced.proyecto.Artista;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class Presentador extends Thread implements AccionesArtista {
    //private JFrame f;
    private Artista artista = null;
    
    public Presentador(Artista a) {
        //f = new JFrame(a.getNombre());
        artista = a;
    }
    
    @Override
    public void run() {
        presenta(artista);
        canta(artista);
    }

    @Override
    public void presenta(Artista a) {
        System.out.println("Hola soy " + a.getNombre());
        String imagen = a.getNombre().trim() + ".jpg";
        
        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.add(new LoadImageApp(imagen));
        f.pack();
        f.setVisible(true);
    }

    @Override
    public void canta(Artista a) {
        System.out.println(a.getNombre() + " va a cantar");
        String cancion = a.getNombre().trim() + ".wav";
        try{
            Clip sonido = AudioSystem.getClip();
            File file = new File(cancion);
            sonido.open(AudioSystem.getAudioInputStream(file));
            sonido.start();
            Thread.sleep(30000); // 1000 milisegundos (1 segundos)
            sonido.close();
        }catch(Exception e){
            System.out.println("" + e);
        }
    }
    
}
