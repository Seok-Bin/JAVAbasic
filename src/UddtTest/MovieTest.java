package UddtTest;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타";
        m.openingDate = "2022.12.14";
        m.protagonist = "제이크 설리";
        m.movieGenre = "액션";
        m.runningTime = 192;
        m.rated = "12세";

        System.out.println(m.title + "\t" + m.openingDate + "\t" + m.protagonist + "\t" + m.movieGenre + "\t" + m.runningTime + "\t" + m.rated);

    }
}
