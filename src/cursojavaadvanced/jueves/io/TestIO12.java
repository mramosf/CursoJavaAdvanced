package cursojavaadvanced.jueves.io;

import java.io.Console;
//Solo por consola
public class TestIO12 {
    public static void main(String[] args) {
        Console c = System.console();
        String n = null;
        if(c != null){
            n = c.readLine("Introduce tu nombre:");
        }
        
        System.out.println("Bienvenido: " +n);
    }
}
