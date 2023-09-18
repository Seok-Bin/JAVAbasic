package fc.java.course2.part1;

import fc.java.course2.model2.A;
import fc.java.course2.model2.Book;

import java.util.ArrayList;

public class ArrayListBestTest {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>(); //기본크기 (10)
        list.add(new Book("홍길동전", 500, "홍길동"));
        list.add(new Book("이순신전", 500, "이순신"));

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
        }

    }
}