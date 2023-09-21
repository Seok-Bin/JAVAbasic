package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2,4,6,8,7,1,5};

        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i : nums){
            uniqueNumbers.add(i);
        }

        System.out.println("Unique numbers......?");
        for (int number : uniqueNumbers){
            System.out.print(number);
        }
    }
}
