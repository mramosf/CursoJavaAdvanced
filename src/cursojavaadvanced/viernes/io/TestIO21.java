package cursojavaadvanced.viernes.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestIO21 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("C:\\dos.txt");
        PrintStream ps = new PrintStream(fout);
        
        ps.println(2017);
        ps.println("Hola");
        ps.println("Mundo con Archivos");
        ps.close();
        fout.close();
        System.out.println("Listo");
    }
}
