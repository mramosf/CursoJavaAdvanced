package cursojavaadvanced.jueves.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestIO7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\a.txt");
        FileInputStream fin2 = new FileInputStream("C:\\b.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fin, fin2);
        int j;
        
        while ((j = sis.read()) != -1) {            
            System.out.print((char)j);
        }
        System.out.println("");
        sis.close();
        fin.close();
        fin2.close();
    }
}
