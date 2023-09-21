package fc.java.course2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // Arraylist 객체 생성
        ArrayList<String> list = new ArrayList<>();

        // 과일 5개 넣기
        list.add("apple"); //new String("apple") 의 형시 이지만 Auto-boxing이 된다.
        list.add("banana");
        list.add("cherry");
        list.add("banana"); // 중복 가능

        //개별 출력
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1)); //마지막 순서의 데이터룰 출력하는 방법

        // 데이터 삭제
        list.remove(0);

        // 데이터 삭제
        list.set(0, "orange");

        //전체 출력
        for (String str : list){
            System.out.println(str);
        }
    }
}
