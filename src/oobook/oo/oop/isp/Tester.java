package oobook.oo.oop.isp;

import java.awt.print.Paper;

public class Tester {

    public static void main(String[] args) {
        People people = new People();
        MultiFuncPrinter mfp = new MultiFuncPrinter();

        people.copy(mfp, new Paper());
        people.fax(mfp, "I love oo");
        people.print(mfp, new Document());
        people.scan(mfp, new Paper());
    }
}
