package cursojavaadvanced.martes.interfaces.acciones;

import cursojavaadvanced.martes.interfaces.Drawable;

class Rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }    
}

public class Figuras {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}
