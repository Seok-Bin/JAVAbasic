package fc.java.part2.MethodPack;

public class CallByReference {
    public static void main(String[] args) {
        //실수형의 합을 구하는 메서드 호출
        float f1 = 0.15f;
        float f2 = 1.58f;
        floatAdd(f1, f2); //call by Value
    }


    // 매개변수로 실수 2개를 받아서 합을 구하여 출력
    public static void floatAdd(float a, float b){
        float sum = a + b;
        System.out.println(sum);
    }

}
