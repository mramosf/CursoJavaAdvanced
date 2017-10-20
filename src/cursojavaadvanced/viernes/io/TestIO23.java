package cursojavaadvanced.viernes.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class TestIO23 {
    public static void main(String[] args) throws IOException{
        char[] a = new char[512];
        StringWriter w = new StringWriter();
        FileInputStream in = null;
        BufferedReader br = null;
        
        in = new FileInputStream("C:\\uno.txt");
        br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
        
        int i;
        while((i = br.read(a)) != -1) {
            w.write(a, 0, i);
        }
        System.out.println(w.toString());
        w.close();
        br.close();
        in.close();
    }
}
