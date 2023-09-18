package fc.java.course2.part1;

import fc.java.course2.model2.*;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); //기본크기 (10)
        list.add(new Book("홍길동전", 500, "홍길동"));
        list.add(new Book("이순신전", 500, "이순신"));
        list.add(new A());

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Book){
                System.out.println(list.get(i));
            } else {
                System.out.println(list.get(i));
                ((A) list.get(i)).display();
            }
        }
        A vo = ((A)list.get(2));
        vo.display();

    }
}

