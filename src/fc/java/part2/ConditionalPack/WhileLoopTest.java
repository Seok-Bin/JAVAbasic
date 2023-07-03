package fc.java.part2.ConditionalPack;

public class WhileLoopTest {
    public static void main(String[] args) {
        //0~5까지의 수를 출력
        int i = 0; //초기식
        while (i <=5){ //조건식
            System.out.println(i);
            i++; //증감식
        }
        System.out.println();

        // 배열의 원소를 모두 출력
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        i = 0;

        while (i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
        System.out.println();

        // do-while문으로 작성
        i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        }while (i < numbers.length);

    }
}
