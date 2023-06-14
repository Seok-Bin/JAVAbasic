package VDATest;

public class BinaryExam {
    public static void main(String[] args) {
        // 61를 10진수, 2진수, 8진수, 16진수로 출력
        int decimal = 123;
        System.out.println("decimal = " + decimal);
        int binary = 0b01111011;
        System.out.println("binary = " + binary);
        int octal = 0173;
        System.out.println("octal = " + octal);
        int hexa = 0x7b;
        System.out.println("hexa = " + hexa);
    }
}
