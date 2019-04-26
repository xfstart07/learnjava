package oobook.oo.base.polymorphism;

public class Test1 {

    public static void write(Animal a) {

        System.out.println(a.talk());

    }

    public static void main(String[] args) {
        write(new Dog());
        write(new Pig());
    }
}
