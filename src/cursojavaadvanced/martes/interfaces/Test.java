package cursojavaadvanced.martes.interfaces;

interface Drawable2 {
    void draw2();
}

class Rectangle implements Drawable2 {

    @Override
    public void draw2() {
        System.out.println("Drawing a rectangle");
    }    
}

class Circle implements Drawable2 {

    @Override
    public void draw2() {
        System.out.println("Drawing a circle");
    }    
}

public class Test {
    public static void main(String[] args) {
        Drawable2 d = new Rectangle();
        d.draw2();
    }
}
