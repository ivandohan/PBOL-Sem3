package K4a;

interface Drawable {
    void draw();
    default void mng() {
        System.out.println("Default method");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class TestInterfaceDefault {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
        d.mng();
    }
}
