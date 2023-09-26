package fc.java.course1.part2.JavaOperatorPack;

public class MaxMinValueTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //최소값
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);

        //최대값
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);
    }
}
