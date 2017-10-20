package cursojavaadvanced.viernes.networking;

import java.net.MalformedURLException;
import java.net.URL;

/*
IP: Es una dirección logica que puede ser cambiada.
    Esta compuesta por octetos en un ranto de 0 a 255.

Protolo: Un conjunto de reglas asignadas a un nodo de un canal de comunicación.
    TCP, FTP, Telnet, SMTP, Pop.

Número de puerto: (Endpoint), esta asociado a la dirección IP.

MAC: Dirección con identificador unico NIC (Network Interface Controller).
    Un canal puede tener multiples NIC pero cada uno tiene una unica MAC.

Conection-Oriented: Protocolo TCP.

Connection-Less: Protocolo UDP.

Socket: Es un endpoint entre 2 vias de comunición (puente).
    Un socket es usado para la comunicación entre aplicaciones que poseen
    diferentes JRE.
    
Java Sockets pueden ser usados tanto para Connection-Oriented como para 
Connection-Less.

Connection-Oriented: Java usa las clases Socket y ServerSocket.
Connection-Less: Java usa las clases DatagramSocket y DatagramPacket.

En el cliente un socket debe tener dos datos.1
1.- IP sel Server.2
2.-Puerto.
*/
public class Test {
    public static void main(String[] args) {
        try {
            //URL url = new URL("http://www.coppel.com");
            URL url = new URL("https://www.codigofacilito.com");
            System.out.println("Protocolo: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
        } catch (MalformedURLException ioe) {
            ioe.printStackTrace();
        }
    }
}
