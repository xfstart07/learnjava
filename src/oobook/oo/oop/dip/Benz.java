package oobook.oo.oop.dip;

public class Benz implements ICar {

    @Override
    public void accelerate() {
        System.out.println("Benz accelerate: very fast!!");
    }

    @Override
    public void shift() {
        System.out.println("Benz shift: automatic transmission !!");
    }

    @Override
    public void steer() {
        System.out.println("Benz steer: very smooth, ESP && DSC && VSC !!");
    }

    @Override
    public void brake() {
        System.out.println("Benz brake: ABS");
    }
}
