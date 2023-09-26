package fc.java.course1.poly;

//추상 클래스 (불완전한 클래스)
public abstract class AnimalVO {
    public abstract void eat(); //추상메서드 (불완전한 메서드) : 메서드의 구현부가 없음
    public void move(){
        System.out.println("무리지어 움직인다.");
    }
}
