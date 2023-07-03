package fc.java.part2.ScannerPack;

import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력:");
        int num = scan.nextInt(); //블럭상태 )(멈춰있는 상태
        System.out.println("num = " + num);

        System.out.print("실수 입력:");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.print("문자 입력:"); //문자열
        String str = scan.next();
        System.out.println("str = " + str);

        scan.nextLine(); // 버퍼비우기(스트림 비우기)
        System.out.print("문자 입력:"); //문자열
        String str1 = scan.nextLine();
        System.out.println("str1 = " + str1);

        scan.close();


    }
}
