package oobook.oo.base.polymorphism;

public class Test2 {

    public static void writeDog(Dog a) {
        System.out.println(a.talk());
    }

    public static void writePig(Pig a) {
        System.out.println(a.talk());

    }

    public static void main(String[] args) {
        writeDog(new Dog());
        writePig(new Pig());
    }
}
