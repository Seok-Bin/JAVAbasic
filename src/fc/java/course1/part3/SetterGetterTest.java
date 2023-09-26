package fc.java.course1.part3;

import fc.java.course1.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO p = new PersonVO();

        p.setName("홍길동");
        p.setAge(50);
        p.setPhone("010-0000-0000");

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getPhone());
    }
}
