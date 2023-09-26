package fc.java.course1.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // 일반사원 한명의 객체를 생성하고 데이터를 저장후 출력하기
        RempVO vo = new RempVO("홍길동", 30, "010-0000-0000", "2022-10-10", "홍보부", false);
//        RempVO vo = new RempVO();
//        vo.name = "홍길동";
//        vo.age = 30;
//        vo.phone = "010-0000-0000";
//        vo.empDate = "2022-10-10";
//        vo.dept = "홍보부";
//        vo.marriage = false;
        //출력
        System.out.println(vo);
    }
}
