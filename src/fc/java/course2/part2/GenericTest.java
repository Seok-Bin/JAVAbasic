package fc.java.course2.part2;

import fc.java.course2.model2.Book;
import fc.java.course2.model2.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {
     /*   ObjectArr<String> arr = new ObjectArr<>(5);
        arr.set(0, "Hello");
        arr.set(1, "World");
        arr.set(2, "Java");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println(arr.size());*/
        ObjectArr<Book> bList = new ObjectArr<>(5);
        bList.set(0, new Book("홍길동전", 500, "홍길동"));
        bList.set(1, new Book("불멸의 이순신", 450, "이순신"));

        for (int i = 0 ; i < bList.size(); i++){
            System.out.println(bList.get(i));
        }

    }
}
