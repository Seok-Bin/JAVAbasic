package fc.java.part2.MethodPack;

import java.util.Scanner;

public class MethodMakeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int a = scan.nextInt();
        System.out.print("정수 입력 : ");
        int b = scan.nextInt();
        // 만들어 놓은 add 메서드 호출

        int result =  add(a, b);
        System.out.println("총 합 = " + result);
    }

    // 매개변수로 2개의 정수를 받아 총합을 구해 리턴해주는 메서드 정의
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}

