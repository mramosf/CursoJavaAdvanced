package cursojavaadvanced.viernes.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestIO18 {
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        FileWriter fr = new FileWriter("C:\\uno.txt");
        BufferedWriter bw = new BufferedWriter(fr);
        String cadena = "";
        
        while (!cadena.equals("stop")) {            
            cadena = br.readLine();
            System.out.println("Cadena: " + cadena);
            bw.write(cadena);
        }
        bw.close();
        br.close();
        in.close();
    }
}
