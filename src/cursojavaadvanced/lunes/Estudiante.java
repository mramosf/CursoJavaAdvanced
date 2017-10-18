package cursojavaadvanced.lunes;

/**
 * 1.- variables
 * 2.- metodos
 * 3.- 
 * 4.- Clases anidadas
*/

public class Estudiante {
    int matricula;
    String nombre;
    static String escuela = "ITL";
    String msg = "";

    public Estudiante(int matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }
    
    void display(){
        msg+="matricula: " + matricula + "\nnombre: " + nombre + "\nescuela: " + escuela;
        System.out.println(msg);
    }
    
    public static void main(String[] args) {
        Estudiante est = new Estudiante(123, "jose");
        est.display();
    }
}
