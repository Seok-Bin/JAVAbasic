package fc.java.course1.part2.ConditionalPack;

public class LoopLoopTest {
    public static void main(String[] args) {
        int index = 1;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println(index);
                index++;
            }//j
        }//i


        //배열 사용
        int [][] a = {
            {1,2,3,4,5},
            {1,2,3,4,5}
        };

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        //구구단
        int[][] b = new int[9][9];
        int x = 1;
        int y = 1;

        for (int i = 0; i < b.length; i++){
            y = 1;
            for (int j = 0; j < b[i].length; j++){
                int total = x * y;
                System.out.println(x + "x" + y + "=" + total);
                y++;
            }
            x++;
            System.out.println();
        }

    }


}
