package cursojavaadvanced.jueves.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestIO11 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:\\uno.txt");
        DataInputStream din = new DataInputStream(in);
        int c = in.available();
        byte [] array = new byte[c];
        in.read(array);
        
        for (byte n : array) {
            char l = (char)n;
            System.out.print(l+"*");
        }
        System.out.println("");
        in.close();
        din.close();
    }
}
