package oobook.oo.oop.dip;

public class Chery implements ICar {

    @Override
    public void accelerate() {
        System.out.println("Chery accelerate: very fast!!");
    }

    @Override
    public void shift() {
        System.out.println("Chery shift: automatic transmission !!");
    }

    @Override
    public void steer() {
        System.out.println("Chery steer: very smooth, ESP && DSC && VSC !!");
    }

    @Override
    public void brake() {
        System.out.println("Chery brake: ABS");
    }
}
