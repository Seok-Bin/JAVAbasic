package fc.java.course2.part1;

public class IntArrBasic {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 배열 생성 동작

        arr[0] = 1; // 저장 동작
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // 길이를 구하는 동작
        for (int i = 0; i < arr.length; i++){
            int data = arr[i]; //데이터를 얻는 동작
            System.out.println(data);
        }




    }
}
