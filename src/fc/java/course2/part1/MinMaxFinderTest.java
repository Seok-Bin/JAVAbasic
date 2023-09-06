package fc.java.course2.part1;

import fc.java.course2.model2.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr = {5,3,9,1,7};
        int min = MinMaxFinder.FindMin(arr);
        int max = MinMaxFinder.FindMax(arr);

        System.out.println(min);
        System.out.println(max);

    }
}
