package fc.java.course1.part2.DataTypeTest;

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

        //자바 API이용
        int data = 123;
        String binary1 = java.lang.Integer.toBinaryString(data);
        System.out.println("binary1 = " + binary1); //0b01111011
        String octal1 = java.lang.Integer.toOctalString(data);
        System.out.println("octal1 = " + octal1); //0173
        String hexa1 = java.lang.Integer.toHexString(data);
        System.out.println("hexa1 = " + hexa1); //0x7b
    }
}
