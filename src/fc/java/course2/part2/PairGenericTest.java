package fc.java.course2.part2;

import fc.java.course2.model2.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
       Pair<String, Integer> pair = new Pair<>("hello", 1);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        // 검색을 빠르게 할 수 있는 자료구조 (HashMap, Hashtable)
        Map<String, Integer> maps = new HashMap<>();
        maps.put("kor", 50);
        maps.put("eng", 60);

        System.out.println(maps.get("kor"));
        System.out.println(maps.get("eng"));

        for (Map.Entry<String, Integer> entry : maps.entrySet() ){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
