package cursojavaadvanced.proyectoConAbstraccion;

import cursojavaadvanced.lunes.LoadImageApp;
import cursojavaadvanced.proyecto.Artista;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class Concierto extends AccionesArtista {
    //private JFrame f = new JFrame("Load Image Sample");

    public static void main(String[] args) {
        Artista a1 = new Artista("maluma", "Mexicana", "Banda", 60);
        Artista a2 = new Artista("shakira", "Mexicana", "Banda", 50);
        AccionesArtista aa = new Concierto();
        aa.presenta(a1);
        aa.canta(a1);
        aa.presenta(a2);
        aa.canta(a2);
    }

    @Override
    void presenta(Artista a) {
        System.out.println("Hola soy " + a.getNombre());
        String imagen = a.getNombre().trim() + ".jpg";
        
        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.add(new LoadImageApp(imagen));
        f.pack();
        f.setVisible(true);
    }

    @Override
    void canta(Artista a) {
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
