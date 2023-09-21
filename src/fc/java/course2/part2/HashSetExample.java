package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 객체 생서
        Set<String> set = new HashSet<>();

        //요소 추가
        set.add("banana");
        set.add("apple");
        set.add("cherry");
        set.add("banana"); // 중복요소는 추가되지 않음

        // Set 사이즈
        System.out.println(set.size());

        // 요소 출력
        for (String e : set){
            System.out.println(e);
        }

        // 요소 삭제
        set.remove("banana");
        for (String e : set){
            System.out.println(e);
        }

        //요소 포함 여부
        boolean contains = set.contains("cherry");
        System.out.println("contains cherry?" + contains);

        // Set 비우기
        set.clear();

        boolean empty = set.isEmpty();
        System.out.println("is empty?" + empty);

    }
}
