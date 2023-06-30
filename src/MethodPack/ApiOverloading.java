package MethodPack;

public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(1.5f);
        System.out.println('a');
        System.out.println("apple");

        int max = maxValue(4, 9);
        System.out.println("max = " + max);

        int min = minValue( 8, 1);
        System.out.println("min = " + min);
    }

    // 정수 두 개를 매개변수로 받아 최대 값을 리턴하는 메서드 정의
    public static int maxValue(int a, int b){
        return (a > b) ? a: b;
    }

    // 정수 두 개를 매개변수로 받아 최소 값을 리턴하는 메서드 정의
    public static int minValue(int a, int b){
        return (a < b) ? a: b;
    }



}
