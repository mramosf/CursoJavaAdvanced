package cursojavaadvanced.martes.figuras;

class Shape {
    void draw(){
        System.out.println("Drawing...");
    }
}

class Rectangule extends Shape {
    void draw(){
        System.out.println("Dibujando un rectangulo...");
    }
}

class Circule extends Shape {
    void draw(){
        System.out.println("Dibujando un circulo...");
    }
}

public class TestFiguras {
    public static void main(String[] args){
        Shape s;
        s = new Rectangule();
        s.draw();
        s = new Circule();
        s.draw();
    }
}
