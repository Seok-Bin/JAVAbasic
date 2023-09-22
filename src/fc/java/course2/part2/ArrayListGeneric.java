package fc.java.course2.part2;

import fc.java.course2.model2.Movie;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List list = new ArrayList(); // Object[]
        list.add(new Movie("괴물", "봉준호", 2006, "한국"));
        list.add("hello");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
