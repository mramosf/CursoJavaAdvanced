package cursojavaadvanced.jueves.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\uno.txt");
            fout.write(65);
            fout.close();
            System.out.println("Listo");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
