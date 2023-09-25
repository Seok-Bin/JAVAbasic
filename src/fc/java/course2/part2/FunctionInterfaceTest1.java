package fc.java.course2.part2;

import fc.java.course2.model2.MathOperation;
import fc.java.course2.model2.MathOperationimpl;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationimpl();
        int result = mo.operation(10, 20);
        System.out.println(result);
    }
}
