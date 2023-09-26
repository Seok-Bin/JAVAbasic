package fc.java.course1.part3;

import fc.java.course1.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO m = new MovieVO("아바타", "2022-12-14", "제이크 셜리", "액션", 192, "12세");
        System.out.println(m);
        System.out.println(m.getLevel());
    }


}

