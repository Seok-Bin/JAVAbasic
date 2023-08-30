package fc.java.part4;

import fc.java.poly.*;

public class InterfaceTest {
    // 다형성이 100% 보장이 된다.
    // 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬 수 있다.
    // interface는 객체생성 불가
    // interface는 부모의 역할을 할수가 있음
    public static void main(String[] args) {
        Remocom r = new Radio();
        r.chUp();
        r.chDown();
        r.volDown();
        r.volUp();
        r.internet();

        r = new TV();
        r.chUp();
        r.chDown();
        r.volUp();
        r.volDown();
        r.internet();
    }
}
