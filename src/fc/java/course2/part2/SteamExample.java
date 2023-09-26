package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SteamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> isEven = n -> n%2==0;

        int sumOFSquares = numbers.stream()
                .filter(isEven)
                .sorted()
                .map(n -> n*n)
                .reduce(0, Integer::sum);

        /*int sumOFSquares = numbers.stream()
                .filter(n -> n%2==0)
                .sorted()
                .map(n -> n*n)
                .reduce(0, (a, b) -> a+b);*/

        System.out.println("sumOFSquares = " + sumOFSquares);
    }
}
