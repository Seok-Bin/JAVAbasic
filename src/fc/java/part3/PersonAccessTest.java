package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Person 클래스에 임름, 나이, 전화번호를 저장, 출력
        Person p = new Person();

        p.name = "홍길동";
        p.age = 1000;
        p.phone = "010-0000-0000";

        System.out.println(p.name + "\t" +  p.age + "\t" + p.phone);

    }
}
