package fc.java.course2.part2;

public class IntegersStringTest {
    public static void main(String[] args) {
        String str = "123";
        String str2 = "123";
        System.out.println(str + str2); // 결합
        // "123" + "123" = 246(정수)
        // 문자열 -> 정수
        int num = Integer.parseInt(str)+ Integer.parseInt(str2);

        System.out.println(num);

        // 정수 -> 문자열
        int su1 = 123;
        int su2 = 123;

        String str3 = String.valueOf(su1) + (""+ su2);
        System.out.println(str3);
    }
}
