package cursojavaadvanced.jueves.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestIO14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre = br.readLine();
        System.out.println("Bienvenido " + nombre);
    }
}
