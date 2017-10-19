package cursojavaadvanced.jueves.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO5 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("C:\\uno.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Hola a todos";
        byte b[] = s.getBytes();
        
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        
        System.out.println("Listo");
    }
}
