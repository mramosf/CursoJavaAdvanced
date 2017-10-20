package cursojavaadvanced.viernes.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO17 {
    public static void main(String[] args) throws IOException{
        FileWriter fr = new FileWriter("C:\\uno.txt");
        BufferedWriter bw = new BufferedWriter(fr);
        
        bw.write("Java Coppel");
        bw.close();
        System.out.println("Listo");
    }
}
