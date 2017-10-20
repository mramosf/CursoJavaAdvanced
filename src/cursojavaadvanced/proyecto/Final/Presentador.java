package cursojavaadvanced.proyecto.Final;

import cursojavaadvanced.proyecto.Interfaces.*;
import cursojavaadvanced.lunes.LoadImageApp;
import cursojavaadvanced.proyecto.Artista;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class Presentador implements AccionesArtista {
    
    public Presentador() {
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
    
    @Override
    public Artista registroArtista(String actaRegistro) {
        Artista art = null;
        try {
            FileReader fr = new FileReader(actaRegistro);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            String[] array = new String[4];
            int i = 0;
            while((linea = br.readLine()) != null){
                array[i] = linea;
                i++;
            }
            br.close();
            fr.close();
            
            art = new Artista(array[0], array[1], array[2], Integer.parseInt(array[3]));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return art;
    }
    
    @Override
    public void bitacora(ArrayList<Artista> artista) {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("BitacoraConcierto.txt");
            PrintStream ps = new PrintStream(fout);
            for (Artista a : artista) {
                ps.println("Nombre artista: " + a.getNombre());
                ps.println("Nacionalidad artista: " + a.getNacionalidad());
                ps.println("Genero artista: " + a.getGenero());
                ps.println("Edad artista: " + a.getEdad());
            }
            ps.close();
            fout.close();fout.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
