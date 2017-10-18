package cursojavaadvanced.martes;

public class Artista {
    private String nombre, nacionalidad, genero;
    private int edad;

    public Artista() {
    }
    
    public Artista(String nombre, String nacionalidad, String genero, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.edad = edad;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     * @return 
     */
    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     * @return 
     */
    public boolean setNacionalidad(String nacionalidad) {
        if(!nacionalidad.isEmpty()){
            this.nacionalidad = nacionalidad;
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     * @return 
     */
    public boolean setGenero(String genero) {
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     * @return 
     */
    public boolean setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
            return true;
        }else{
            return false;
        }
    }
    
    public void display(){
        System.out.println(nombre + " " + genero);
    }
    
    public static void main(String[] args) {
        Artista artista1 = new Artista("paquita","mexicana","banda",30);
        artista1.display();
    }
}