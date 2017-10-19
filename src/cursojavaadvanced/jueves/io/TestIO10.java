package cursojavaadvanced.jueves.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO10 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\a.txt");
        DataOutputStream data = new DataOutputStream(fos);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Listo");
    }
}
