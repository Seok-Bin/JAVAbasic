package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = StaticTest.add(a, b); // 클래스명은 생략 가능
        System.out.println(sum);
    }

    public static int add(int a, int b){
        int v = a + b;
        return v;
    }
}
