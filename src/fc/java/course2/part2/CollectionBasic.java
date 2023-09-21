package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList 에 정수를 넣고 출력
        // ArrayList -> Object[] <--x--int
        // ArrayList -> Object[] <----Integer (Wrapper)
        // ArrayList -> Object[] <--(Auto boxing)-- int

        ArrayList<Integer> arr = new ArrayList<Integer>(5);

        int a = 10;
        for (int i = 0; i < 5; i++) {
            arr.add(a);
            a += 10;
        }

        for (int data : arr){
            System.out.println(data);
        }
    }
}
