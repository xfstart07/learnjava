package oobook.oo.ch2demo;

public class Person {

    private String _name;
    private int _age;
    private float _height;
    private float _weight;
    private int _gender;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public float get_height() {
        return _height;
    }

    public void set_height(float _height) {
        this._height = _height;
    }

    public float get_weight() {
        return _weight;
    }

    public void set_weight(float _weight) {
        this._weight = _weight;
    }

    public int get_gender() {
        return _gender;
    }

    public void set_gender(int _gender) {
        this._gender = _gender;
    }


    // “玩” 是一个动词
    public void playFootball() {
        System.out.println("My name is: " + _name);
        System.out.println("I am playing football...");
    }

}
