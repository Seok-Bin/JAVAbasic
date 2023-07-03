package fc.java.part2.UddtTest;

public class BookExam {
    public static void main(String[] args) {
        // 책 한 권을 저장할 변수를 선언하시오
        // Book b;
        // b = new Book();

        // 한 권의 책 데이터를 저장하기 위한 객체를 생성하사오.(인스턴스를 만드시오)
        Book b = new Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "한빛";
        b.author = "장동건";
        b.page = 700;
        b.isbn = "1199110";

        System.out.println(b.title + "\t" + b.price + "\t" + b.company + "\t" + b.author + "\t" + b.page + "\t" + b.isbn);
    }


}
