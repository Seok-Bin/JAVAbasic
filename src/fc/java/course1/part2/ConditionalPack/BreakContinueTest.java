package fc.java.course1.part2.ConditionalPack;

public class BreakContinueTest {
    public static void main(String[] args) {
        // break문 사용
        char[]c = {'s', 'h', 'u', 't', 'd', 'o', 'w', 'n'};
        for(int i = 0; i < c.length; i ++){
            if(c[i]=='o'){
                break;
            }
            System.out.print(c[i]);
        }
        System.out.println();

        //continue문 사용
        int count = 0;
        for(int i = 1; i <= 10; i++){
            if(i % 3 !=0)continue;
                count++;
        }
        System.out.println(count);


    }
}
