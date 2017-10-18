package cursojavaadvanced.martes.abstraccion;

abstract class Shape {
    abstract void draw();
}

class Rectangule extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangule...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

public class Figuras {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
