package cursojavaadvanced.viernes.networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test3 {
    public static void main(String[] args) {
        try {
            //URL url = new URL("http://www.google.com");
            //URL url = new URL("http://www.coppel.com");
            URL url = new URL("http://www.codigofacilito.com");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
            
            for (int i = 1; i < 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
