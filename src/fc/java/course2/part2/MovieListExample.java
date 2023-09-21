package fc.java.course2.part2;

import fc.java.course2.model2.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        // Movie를 저장하는 ArrayList 를 생성
        ArrayList<Movie> list = new ArrayList<Movie>();

        // Movie 객체 생성, 데이터 저장
        list.add(new Movie("괴물", "이청용", 2009, "한국"));
        list.add(new Movie("주혼", "기성용", 2011, "한국"));
        list.add(new Movie("늑대소년", "이동국", 2021, "한국"));

        // 데이터 출력
        for (Movie m : list){
            System.out.println(m);
        }

        // 표를 만들어서 데이터 출력
        System.out.println("+----------------+--------+----+------+");
        System.out.println("|영화제목          |감독    |개봉년도|국가 |");
        for (Movie m : list){
            System.out.printf("|%-16s|%-8s|%-4d|%-6s|\n",m.getTitle(),m.getDirector(),m.getYear(),m.getCountry());

        }
        System.out.println("+----------------+--------+----+------+");


        // ArrayList에서 검색
        String search = "주혼";
        for (Movie m : list){
            if (m.getTitle().equals(search)){
                System.out.println(m.toString());
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equals(search)){
                System.out.println(list.get(i).getTitle());
                System.out.println(list.get(i).getDirector());
                System.out.println(list.get(i).getYear());
                System.out.println(list.get(i).getCountry() );
                break;
            }
        }

    }
}
