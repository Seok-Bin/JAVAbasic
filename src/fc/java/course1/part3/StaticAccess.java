package fc.java.course1.part3;

import fc.java.course1.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = MyUtil.hap(a , b);
        System.out.println(sum);
    }
}
