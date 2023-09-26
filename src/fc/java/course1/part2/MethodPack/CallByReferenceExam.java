package fc.java.course1.part2.MethodPack;

public class CallByReferenceExam {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int result = addArray(a); // 번지전당 (Call By Reference)
        System.out.println(result);

    }

    //배열을 매개변수로 받아 배열의 총합을 구하여 리턴하는 메서드 정의
    public static int addArray(int[]a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

}
