package oobook.oo.oop.dip;

public class Ford implements ICar {

    @Override
    public void accelerate() {
        System.out.println("Ford accelerate: very fast!!");
    }

    @Override
    public void shift() {
        System.out.println("Ford shift: automatic transmission !!");
    }

    @Override
    public void steer() {
        System.out.println("Ford steer: very smooth, ESP && DSC && VSC !!");
    }

    @Override
    public void brake() {
        System.out.println("Ford brake: ABS");
    }
}
