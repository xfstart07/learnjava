package oobook.oo.oop.lsp;

public class Rectangle {

    protected int _width;
    protected int _height;

    public int get_width() {
        return _width;
    }

    public void set_width(int _width) {
        this._width = _width;
    }

    public int get_height() {
        return _height;
    }

    public void set_height(int _height) {
        this._height = _height;
    }

    public int getArea() {
        return this._width * this._height;
    }

}
