package JavaOperatorPack;

public class AssignOperTest {
    public static void main(String[] args) {
        int a = 1;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);

        System.out.println();

        int b = 1;
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b = b + 1);
        System.out.println(b += b);
    }
}
