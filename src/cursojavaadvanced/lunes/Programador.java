package cursojavaadvanced.lunes;
/*
Herencia: Es un mecanismo que permite que un objeto adquiera todas las
propiedades y comportamientos de un objeto padre.

La idea de la herencia es que puedas crear nuevas clases a partir de las ya
existentes.

Existen diversas clasificaciones de la relacion en la herencia.

Relaciones entre clases: Asociacion, Composicion, Agrecacion y Herencia

Hay un termino que permite distinguir los distintos tipos de relaciones,
llamado, ACOPLAMIENTO.

*- Medida de dependencia que hay entre 2 modulos, existen grados de
acoplamiento (bajo/alto).
*- Cada clase y metodo hace una sola cosa y la hace bien (COHESION), numero de
tareas que tiene cada clase o metodo.

Es deseable que 2 o mas modulos de un programa mantengan alta cohesion y bajo
acomplamiento.

Relaciones entre clases:
Asociacion (Es Un): Cuando entre 2 o mas clases se da una interaccion que
no modifica en nada el comportamiento de los objetos antes o despues de
terminada la relacion. La asociacion es un modo de interacción entre objetos
donde uno utiliza los servicios de otro a corto plazo. La asociación es una
relacion de objetos debilmente acoplados.

Agregacion (Tiene Un): Es una relacion entre objetos que afecta el
comportamiento entre ellos, mientras que dura la relacion. Es decir, un objeto
depende de los servicios de otro a largo plazo.

Composicion (Contiene Un): Cunado un objeto complejo usa otros objetos
permanentemente. La composicion es una relacion entre objetos cuya escencia
tiene sentido solo cuando ellos estan acoplados. Por ultimo podemos decir que
la composicion es un tipo de agregacion a muy largo plazo.

Herencia: Cuando un objeto tiene las caracteristicas de otro
permanentemente, tendremos una relacion entre objetos intimamente acoplados
cuya existencia depende de un ancestro padre.
*/

class Empleado {
    float salario = 40000;
}

//Herencia con relación de tipo Asociacion.
public class Programador extends Empleado{
    int bono = 10000;
    
    public static void main(String[] args) {
        Programador p = new Programador();
        String msg = "";
        msg += "El salario del programador es: " + p.salario;
        System.out.println(msg);
        System.out.println("El bono es: " + p.bono);
    }
}
