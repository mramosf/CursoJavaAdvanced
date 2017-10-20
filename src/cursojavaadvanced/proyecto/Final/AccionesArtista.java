package cursojavaadvanced.proyecto.Final;

import cursojavaadvanced.proyecto.Artista;
import java.util.ArrayList;

public interface AccionesArtista {
    Artista registroArtista(String actaRegistro);
    void presenta(Artista a);
    void canta(Artista a);
    void bitacora(ArrayList<Artista> a);
}
