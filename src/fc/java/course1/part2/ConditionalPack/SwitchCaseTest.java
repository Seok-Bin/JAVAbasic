package fc.java.course1.part2.ConditionalPack;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("요일을 입력 : ");
        String day = scan.next();

        switch (day){
            case "Sunday":
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
