package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        //IntStream stream = Arrays.stream(numbers);
        int sumOfEvens = Arrays.stream(numbers)
                .filter(n -> n%2==0)
                .sum();

        System.out.println("sumOfEvens = " + sumOfEvens);

        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n -> n%2==0)
                        .toArray();


        for (int n : evenNumbers){
            System.out.println(n);
        }


    }
}

