package fc.java.course1.part3;

import fc.java.course1.model.StudentVO;

public class ClassObjectInstance {
    public static void main(String[] args) {
        StudentVO st1;  // = object
        StudentVO st2;  // = object
        StudentVO st3;  // = object

        st1 = new StudentVO("홍길동","컴공",20,"aaa@naver.com",20170302,"010-0000-0000");  // = instance
        st2 = new StudentVO("나길동","축구",22,"aaa@naver.com",20190302,"010-0000-0000");  // = instance
        st3 = new StudentVO("김길동","전기",23,"aaa@naver.com",20180302,"010-0000-0000");  // = instance

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
