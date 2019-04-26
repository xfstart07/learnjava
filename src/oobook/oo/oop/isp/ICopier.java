package oobook.oo.oop.isp;

import java.awt.print.Paper;

/**
 * 复印机接口
 */
public interface ICopier {

    /**
     * 复印
     * @param paper
     */
    void copy(Paper paper);

}
