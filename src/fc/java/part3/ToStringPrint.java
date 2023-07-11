package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("홍길동", 50, "010-0000-0000");

        System.out.println(vo.toString());
        System.out.println(vo);// 자동적으로 vo.toString()가 자동적으로 나온다
    }
}
