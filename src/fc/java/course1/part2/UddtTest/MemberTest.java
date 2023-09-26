package fc.java.course1.part2.UddtTest;

public class MemberTest {
    public static void main(String[] args) {
        // 한 명의 헬스클럽 회원 데이터를 저장하고 출력
        Member m = new Member();
        m.name = "홍길동";
        m.age = 20;
        m.tel = "010-0000-0000";
        m.email = "ac@naver.com";
        m.addr = "서울시";
        m.weight = 62.2f;

        System.out.println(m.name + "\t" + m.age + "\t" + m.tel + "\t" + m.email + "\t" + m.addr + "\t" + m.weight);
    }
}
