package oobook.oo.oop.isp;

import java.awt.print.Paper;

/**
 * 扫描仪接口
 */
public interface IScanner {

    /**
     * 扫描
     * @param paper
     */
    void scan(Paper paper);
}
