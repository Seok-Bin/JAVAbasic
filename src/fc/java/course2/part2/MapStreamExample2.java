package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "orange");

        List<String> upperWords = words.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("upperWords = " + upperWords);

        for (String w : upperWords){
            System.out.println(w);
        }
    }
}
