package fc.java.part2.DataTypeTest;

public class CastingTest {
    public static void main(String[] args) {
        float f1 = .10f;
        System.out.println("f1 = " + f1);
        float f2 = 15f;
        System.out.println("f2 = " + f2);
        float f3 = 3.14f;
        System.out.println("f3 = " + f3);
        double d1 = 123.4567;
        System.out.println("d1 = " + d1);

        float x = 15.6f;
        int y = (int)x; // 강제 형 변환(손실)
        System.out.println("y = " + y);

        char ch = 'A';
        int i = ch; //자동 형 변환
        System.out.println("i = " + i);

        int dd = 5;
        double ddd = dd;
        System.out.println("ddd = " + ddd);

        double dx = 14.67;
        int dy = (int)dx;
        System.out.println("dy = " + dy);
        
        // int 타입의 정수를 double type의 실수로 형 변환하여 출력
        int a = 10;
        double b = a;
        System.out.println("b = " + b);

        //double type의 실수를 int type의 정수로 형 변환하여 출력
        double c = 14.6;
        int d = (int)c;
        System.out.println("d = " + d);
    }
}
