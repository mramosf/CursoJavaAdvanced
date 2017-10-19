package cursojavaadvanced.jueves.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestIO8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\a.txt");
        FileInputStream fis2 = new FileInputStream("C:\\b.txt");
        FileOutputStream fos = new FileOutputStream("C:\\todos.txt");
        SequenceInputStream sis = new SequenceInputStream(fis, fis2);
        int i;
        
        while ((i = sis.read()) != -1) {
            fos.write(i);
        }
        sis.close();
        fos.close();
        fis.close();
        fis2.close();
    }
}
