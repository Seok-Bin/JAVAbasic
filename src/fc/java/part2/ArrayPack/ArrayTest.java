package fc.java.part2.ArrayPack;

public class ArrayTest {
    public static void main(String[] args) {
        // 정수 5개를 배열에 초기화하고 index 0번째와 index 3 번째 값을 더하여 출력하세요
        int[] a = {10, 20, 30, 40, 50}; //초기화
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int sum = a[0] + a[3];
        System.out.println("sum = " + sum);
        System.out.println(a.length);
    }
}
