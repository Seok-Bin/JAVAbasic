package fc.java.part4;

import fc.java.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        // A 객체를 upcasting으로 생성
        //A a = new A();
        //a.display();

        Object obj = new A(); // upcasting
        ((A)obj).display();   // downcasting
    }
}
