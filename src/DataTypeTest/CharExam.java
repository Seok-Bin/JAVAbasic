package DataTypeTest;

public class CharExam {
    public static void main(String[] args) {
        // '1' + '2' + '3' + '4' + '5' = 15가 나오도록 프로그래밍
        char a = '1';
        char b = '2';
        char c = '3';
        char d = '4';
        char e = '5';
        int sum = (a - '0') + (b - '0') + (c - '0') + (d - '0') +(e - '0');
        System.out.println(a + "+" + b + "+" + c + "+" + d + "+" + e + "+" + sum);
        System.out.println("sum = " + sum);
    }
}
