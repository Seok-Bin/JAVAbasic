package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO p = new PersonVO();

        System.out.println(p.getName() + "\t" + p.getAge() + "\t" + p.getPhone());

        // 개발자가 원하는 값으로 초기화
    }
}
