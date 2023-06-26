package JavaOperatorPack;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        // 나머지 연산자를 이용하여 정수의 자릿수 구하기
        int digit = 1234;
        System.out.println(digit % 10);
        System.out.println(digit /10 % 10);
        System.out.println(digit /100 % 10);
        System.out.println(digit /1000 % 10);

        //정수의 각 자릿수를 모두 더하기
        int num = 2579;
        int sum = 0;
        sum += num % 10;
        sum += num /10 % 10;
        sum += num /100 % 10;
        sum += num /1000 % 10;
        System.out.println("sum = " + sum);

    }
}
