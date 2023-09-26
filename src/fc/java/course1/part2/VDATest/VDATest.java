package fc.java.course1.part2.VDATest;

public class VDATest {
    public static void main(String[] args) {
        //정수 한개를 저장하기 위한 변수 선언
        int v; //변수선언 -> 기억공간 생성
        v = 10;
        System.out.println("v = " + v);
        // 변수 a애 10을 저장하고 a애 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장
        int a = 10;
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);

        // sum이라는 변수에 1부터 5까지의 수를 누적(accumulate)해서 출력하시오
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        System.out.println("sum = " + sum);

        // x=10, y=20을 저장하고 변수의 값을 서ㅓ로 교환(swap)하여 출력하시오
        int x = 10;
        int y = 20;
        System.out.println("x = "+ x + " : y = " + y );
        // 교환 (swap)
        int tmp;
        tmp = y;
        y = x;
        x = tmp;
        System.out.println("x = "+ x + " : y = " + y );
    }
}
