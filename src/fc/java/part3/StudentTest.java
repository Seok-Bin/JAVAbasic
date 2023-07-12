package fc.java.part3;

import fc.java.model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        // 정수 6개를 저장할 배열을 생성
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 67;
        arr[3] = 98;
        arr[4] = 55;
        arr[5] = 32;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // 학생 한명의 데이터를 저장할 객체 생성 출력
        StudentVO s = new StudentVO("홍길동", "컴퓨터공학과", 37, "aaa@naver.com", 20230110, "010-0000-0000");
        System.out.println(s);

    }
}
