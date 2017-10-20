package cursojavaadvanced.viernes.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test2 {
    public static void main(String[] args) {
        try {
            //URL url = new URL("http://www.coppel.com");
            //URL url = new URL("http://www.codigofacilito.com");
            //URL url = new URL("http://www.bancoppel.com");
            URL url = new URL("http://www.google.com");
            URLConnection urlcon = url.openConnection();
            InputStream stram = urlcon.getInputStream();
            
            int i;
            while ((i = stram.read()) != -1) {                
                System.out.print((char)i);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
