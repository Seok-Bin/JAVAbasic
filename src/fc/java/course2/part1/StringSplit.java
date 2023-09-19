package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello,World,Java";

        //쉼표를 구분자로 사용하여 문자열을 분히
        String[] strArray = str.split(",");

        for (String s : strArray){
            System.out.println(s);
        }

        //정규표현식을 이용하여 문자열을 분리
        String str1 = "Hello World Java";

        String[] strArray1 = str1.split("\\s+"); //정규표현식
        for (String s : strArray1){
            System.out.println(s);
        }

        // scanner 이용
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력: ");
        String scan = scanner.nextLine();

        String[] strArray2 = scan.split("\\s+");

        for (String s : strArray2){
            System.out.println(s);
        }

        scanner.close();
    }
}
