package UddtTest;

public class BookTest {
    public static void main(String[] args) {
        //정수 한 개를 저장할 변수 선언
        int a;
        a = 10;
        System.out.println("a = " + a);
        // 한 권의 책 데이터를 저장하고 출력하시오 (6개의 변수로)
        String title = "자바";
        int price = 30000;
        String company = "한빛";
        String author = "장동건";
        int page = 700;
        String isbn = "ISBN-111990011";

        //책 한 권를 저장할 변수 선언
        Book b;
        // 한 권의 책을 변수에 저장하기 위한 [객체응 생성]하시오
        //(책 한 권을 저장하기 위한 [인스턴스 변수]를 만드시오.)
        b = new Book();
    }
}
