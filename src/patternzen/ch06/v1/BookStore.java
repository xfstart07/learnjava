package patternzen.ch06.v1;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<IBook>();

    static{
        bookList.add(new NovelBook("天龙八部",3200,"金庸"));
        bookList.add(new NovelBook("巴黎圣母院",5600,"雨果"));
        bookList.add(new NovelBook("悲惨世界",3500,"雨果"));
        bookList.add(new NovelBook("金瓶梅",4300,"兰陵笑笑生"));

        bookList.add(new OffNovelBook("金瓶梅定制版",4300,"兰陵笑笑生"));
    }

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        System.out.println("-----------书店卖出去的书籍记录如下：-----------");
        for(IBook book:bookList){
            System.out.println("书籍名称：" + book.getName()+"\t书籍作者：" +         book.getAuthor()+"\t书籍价格："+ formatter.format(book.getPrice()/         100.0)+"元");
        }
    }

}
