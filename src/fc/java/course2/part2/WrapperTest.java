package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        int i = 10; // 기본자료형
//        Integer intObj = Integer.valueOf(i);
//        int a = intObj.intValue();
//        System.out.println(a);

        // Integer aa = new Integer(10); //사용자 정의 자료형 (boxing)
        Integer aa = 10;  // Auto-boxing
        System.out.println(aa.intValue());  // Unboxing(Integer -> int)

        Integer bb = new Integer(20); // boxing
        int b = bb; // Auto-Unboxing

        Float ff = 10.5f;  // Auto-boxing
        System.out.println(ff.floatValue());  // Unboxing
        float af = ff; // Auto-Unboxing
    }
}
