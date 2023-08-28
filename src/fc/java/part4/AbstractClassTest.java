package fc.java.part4;

import fc.java.poly.AnimalVO;
import fc.java.poly.CatVO;
import fc.java.poly.DogVO;

public class AbstractClassTest {
    public static void main(String[] args) {
        // 추상클래스는 단독으로 객체 생성 불가
        // AnimalVO ani = new AnimalVO(); //객체를 생성할 수 없음
        AnimalVO ani = new DogVO();
        ani.eat();

        ani = new CatVO();
        ani.eat();
        ani.move();
        ((CatVO)ani).night();
    }
}
