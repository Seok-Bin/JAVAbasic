package fc.java.course1.part3;

import fc.java.course1.model.MyUtil;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        MyUtil u = new MyUtil();
        int sum = u.add(a, b);
        System.out.println(sum);

    }
}
