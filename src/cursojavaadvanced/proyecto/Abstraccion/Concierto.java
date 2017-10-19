package cursojavaadvanced.proyecto.Abstraccion;

import cursojavaadvanced.proyecto.Artista;

public class Concierto {

    public static void main(String[] args) {
        Artista a1 = new Artista("maluma", "Mexicana", "Banda", 60);
        Artista a2 = new Artista("shakira", "Mexicana", "Banda", 50);
        AccionesArtista aa = new Presentador();
        aa.presenta(a1);
        aa.canta(a1);
        aa.presenta(a2);
        aa.canta(a2);
    }
}
