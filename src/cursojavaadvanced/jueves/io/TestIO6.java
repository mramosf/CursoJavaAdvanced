package cursojavaadvanced.jueves.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestIO6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\uno.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        
        while ((i = bin.read()) != -1) {            
            System.out.print((char)i);
        }
        System.out.println("");
        bin.close();
        fin.close();
    }
}
