package fc.java.course1.part2.ConditionalPack;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성정 입력 : ");
        int score = scan.nextInt();

        if (score >= 0 && score <= 100){
            if(score >= 80){
                if (score >= 90){
                    System.out.println("A");
                } else if (score >= 85){
                    System.out.println("B");
                } else {
                    System.out.println("C");
                }
            } else {
                System.out.println("불합격");
            }
        } else {
            System.out.println("유효하지 않은 점수");
        }

    }
}
