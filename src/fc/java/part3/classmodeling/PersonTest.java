package fc.java.part3.classmodeling;

public class PersonTest {
    public static void main(String[] args) {
        // 한 사람의 데이터를 저장할 변수 선언.
        // Person 클래스를 이용하여 객체를 메모리에 생성 (인스턴스를 만드는 과정)
        Person p = new Person();
        p.name = "박장사";
        p.age = 23;
        p.phone = "010-0000-0000";

        System.out.println(p.name + "\t" +  p.age + "\t" + p.phone);
        p.eat();
        p.play();
        p.walk();
    }
}
