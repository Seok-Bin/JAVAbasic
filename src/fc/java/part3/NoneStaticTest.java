package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticTest st = new NoneStaticTest();
        int sum = st.add(a, b);
        System.out.println(sum);
    }

    public int add(int a, int b){
        int v = a + b;
        return v;
    }
}
