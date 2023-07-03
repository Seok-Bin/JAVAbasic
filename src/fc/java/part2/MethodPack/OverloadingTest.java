package fc.java.part2.MethodPack;

public class OverloadingTest {
    public static void main(String[] args) {
        float v = add(3.56f, 55.5f);
        System.out.println("v = " + v);

        int vv = add(23, 4);
        System.out.println("vv = " + vv);
    }

    // 정수 두 개의 값을 매개변수로 받아 총합을 구하여 리턴하는 매서드 정의
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    // 실수 두 개의 값을 매개변수로 받아 총합을 구하여 리턴하는 매서드 정의
    public static float add(float a, float b){
        float sum = a + b ;
        return sum;
    }
}
