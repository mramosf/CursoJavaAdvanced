package cursojavaadvanced.lunes;

public class Estudiante2 {
    int matricula;
    String nombre, msg = "";
    static String escuela = "ITL";
    
    static void cambio(){
        escuela = "UG";
    }

    public Estudiante2(int i, String n) {
        this.matricula = i;
        this.nombre = n;
    }
    
    void display(){
        msg += "Matricula: " + matricula;
        msg += "\nNombre: " + nombre;
        msg += "\nEscuela: " + escuela;
        System.out.println(msg);
    }
    
    public static void main(String[] args) {
        Estudiante2.cambio();
        Estudiante2 s4 = new Estudiante2(211, "David");
        Estudiante2 s5 = new Estudiante2(452, "Ana");
        
        s4.display();
        s5.display();
        
        
    }
}
