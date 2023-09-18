package fc.java.course2.part1;

import fc.java.course2.model2.Book;
import fc.java.course2.model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        BookArray list = new BookArray();
        list.add(new Book("홍길동전", 500, "홍길동"));
        list.add(new Book("이순신전", 500, "이순신"));

        System.out.println(list.get(1));
        System.out.println(list.size());


        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
