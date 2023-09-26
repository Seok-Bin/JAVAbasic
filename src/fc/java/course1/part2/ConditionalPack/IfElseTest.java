package fc.java.course1.part2.ConditionalPack;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = 10;
        if(x >= 0 ){
            System.out.println("0 or 양수");
        }else {
            System.out.println("음수");
        }

        // 정수를 입력받아 짝수인지 홀수인지 출력
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // 입력받은 수가 12의 배수인지 출력
        System.out.print("정수 입력: ");
        int num1 = scan.nextInt();

        if (num1 % 12 == 0){
            System.out.println("12의 배수");
        } else {
            System.out.println("12의 배수가 아님");
        }

        // 년도를 입력받아 해당 년도가 윤년인지 아닌지를 판단하여 출력
        //윤년 : 4의 배수 이면서 100의 배수가 아닌 년도 이거나 400의 배수인 년도
        System.out.print("년도 입력: ");
        int year = scan.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("윤년");
        } else {
            System.out.println("x");
        }

    }
}
