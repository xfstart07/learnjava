package oobook.oo.oop.lsp;

public class UnitTester {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.set_width(4);
        rectangle.set_height(5);

        assert (rectangle.getArea() == 20);

        rectangle = new Square();
        rectangle.set_width(4);
        rectangle.set_height(5);

        // false, java.lang.AssertionError
//        assert (rectangle.getArea() == 20);
        if ((rectangle.getArea() != 20)) throw new AssertionError();
    }
}
