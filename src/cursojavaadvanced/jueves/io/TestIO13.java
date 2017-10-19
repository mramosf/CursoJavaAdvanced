package cursojavaadvanced.jueves.io;

import java.util.Scanner;

public class TestIO13 {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        Scanner in = new Scanner(System.in);
        String nombre = in.nextLine();
        in.close();
        System.out.println("Bienvenido: " + nombre);
    }
}
