package fc.java.course1.part2.ArrayPack;

import fc.java.course1.part2.UddtTest.Movie;

public class ObjectArrayExam {
    public static void main(String[] args) {
        // 영화 3 편을 저장 할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력
        Movie[] m = new Movie[3];

        m[0] = new Movie() ;
        m[0].title = "아바타";
        m[0].openingDate = "2022.12.14";
        m[0].protagonist = "제이크 설리";
        m[0].movieGenre = "액션";
        m[0].runningTime = 192;
        m[0].rated = "12세";

        m[1] = new Movie() ;
        m[1].title = "법죄도시3";
        m[1].openingDate = "2023.5.14";
        m[1].protagonist = "제이크 설리마동석";
        m[1].movieGenre = "액션";
        m[1].runningTime = 192;
        m[1].rated = "15세";

        m[2] = new Movie() ;
        m[2].title = "익스트랙션2";
        m[2].openingDate = "2023.6.14";
        m[2].protagonist = "크리스 햄스워스";
        m[2].movieGenre = "액션";
        m[2].runningTime = 122;
        m[2].rated = "18세";

        for(int i = 0; i < m.length; i++){
           System.out.println(m[i].title + "\t" + m[i].openingDate + "\t" + m[i].protagonist + "\t" + m[i].movieGenre + "\t" + m[i].runningTime + "\t" + m[i].rated);
        }

    }
}
