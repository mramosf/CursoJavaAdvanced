package cursojavaadvanced.lunes;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class LoadImageApp extends Component {
          
    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public LoadImageApp(String imgagen) {
       try {
            img = ImageIO.read(new File(imgagen));
       } catch (IOException e) {
       }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }

    public static void main(String[] args) {
        String imagen = "homero.jpg";

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
}
