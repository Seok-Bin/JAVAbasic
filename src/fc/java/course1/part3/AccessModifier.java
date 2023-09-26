package fc.java.course1.part3;

import fc.java.course1.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO m = new MemberDTO();
        m.name = "홍길동";
        // m.age = 100; // 에러발생
        m.phone = "010-0000-0000";
        System.out.println(m.name + "\t" + m.phone);
    }
}
