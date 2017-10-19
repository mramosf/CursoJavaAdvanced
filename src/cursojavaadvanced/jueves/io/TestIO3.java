package cursojavaadvanced.jueves.io;

import java.io.FileInputStream;
import java.io.IOException;

public class TestIO3 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\uno.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
