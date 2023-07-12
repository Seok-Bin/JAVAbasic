package fc.java.part3;

import fc.java.model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        StudentVO[] std = new StudentVO[4];

        std[0] = new StudentVO("홍길동","컴공",20,"aaa@naver.com",20170302,"010-0000-0000");
        std[1] = new StudentVO("나길동","축구",22,"aaa@naver.com",20190302,"010-0000-0000");
        std[2] = new StudentVO("김길동","전기",23,"aaa@naver.com",20180302,"010-0000-0000");
        std[3] = new StudentVO("이길동","체교",24,"aaa@naver.com",20180302,"010-0000-0000");

        for (int i =0; i < std.length; i++){
            System.out.println(std[i].toString());
        }

        System.out.println();

        for(StudentVO st : std){
            System.out.println(st);
        }
    }
}
