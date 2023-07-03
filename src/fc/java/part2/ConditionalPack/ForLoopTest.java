package fc.java.part2.ConditionalPack;

public class ForLoopTest {
    public static void main(String[] args) {
        // 반복문을 이용하여 알파벳 대문자와 아스키코드 값을 출력
        char a = 'A';

        for (char c = 'A'; c <= 'Z' ; c++){
            System.out.println(c + ":" + (int)c);
        }

        // 향상된 for문 이용하기
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for ( int number : numbers){
            System.out.println(number);
        }

    }
}
