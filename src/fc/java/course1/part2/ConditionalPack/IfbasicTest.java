package fc.java.course1.part2.ConditionalPack;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        // x의 값이 0 보다 큰 경우에만 "양수" 출력
        int x = 10;
        if(x > 0){
            System.out.println("양수");
        }
        System.out.println("종료");

        //정수를 입력받아 7의 배수인지 출력
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int num = scan.nextInt();

        if((num % 7) == 0){
            System.out.println("7의 배수");
        }

        // 나이를 입력 받아 19세 이상이면 성인임을 출력
        System.out.print("나이를 입력 : ");
        int age = scan.nextInt();
        if(age > 19){
            System.out.println("성인 입니다");
        }

        scan.close();
        System.out.println("종료");
    }

}
