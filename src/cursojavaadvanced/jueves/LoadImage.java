package cursojavaadvanced.jueves;

import cursojavaadvanced.lunes.LoadImageApp;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class LoadImage extends Thread {
    private String imagen;
    
    public LoadImage(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public void run() {
        try{
        System.out.println("Muestra Imagen");
        Thread.sleep(500);
        //System.out.println("Imagen");
        display(this.imagen);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
    
    public static void display(String imagen){
        //String imagen = "homero.jps";
        JFrame f = new JFrame("Load");
        
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Cerrando ventana");
                System.exit(0);
            }
        });
        
        f.add(new LoadImageApp(imagen));
        f.pack();
        f.setVisible(true);
    }
    
    public static void main(String[] args) throws InterruptedException {
        LoadImage t1 = new LoadImage("homero.jpg");
        LoadImage t2 = new LoadImage("vicente.jpg");
        t1.start();
        t2.start();
        
        System.out.println("t1: " + t1.getState());
        System.out.println("t2: " + t2.getState());
    }
}
