package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello, World";
        Map<Character, Integer> charCount = new HashMap<>();
        char[] strArr = str.toCharArray();

        for (char c :strArr){
            if (charCount.containsKey(c)){
                charCount.put(c, charCount.get(c)+1);
            }else {
                charCount.put(c, 1);
            }
        }

        for (char c :charCount.keySet()){
            System.out.println(c + ";" + charCount.get(c));
        }
    }
}
