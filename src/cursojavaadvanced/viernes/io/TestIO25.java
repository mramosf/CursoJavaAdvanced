package cursojavaadvanced.viernes.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestIO25 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream  in = new ObjectInputStream(new FileInputStream("C:\\t.txt"));
        TestIO24 t = (TestIO24)in.readObject();
        System.out.println(t.id + " " + t.nameClass);
    }
}
