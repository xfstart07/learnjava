package oobook.oo.oop.isp;

import java.awt.print.Paper;

public class People {

    /**
     * 依赖 ICopier 接口，而不是 MultiFuncPrinter
     */
    public void copy(ICopier copier, Paper paper) {
        copier.copy(paper);
    }

    /**
     * 依赖 IPrinter 接口，而不是 MultiFuncPrinter
     */
    public void print(IPrinter printer, Document doc) {
        printer.print(doc);
    }

    /**
     * 依赖 IFaxMachine 接口，而不是 MultiFuncPrinter
     */
    public void fax(IFaxMachine faxer, String message) {
        faxer.fax(message);
    }

    /**
     * 依赖 IScanner 接口，而不是 MultiFuncPrinter
     */
    public void scan(IScanner scanner, Paper paper) {
        scanner.scan(paper);
    }

}
