package fc.java.course1.part4;

import fc.java.course1.model.AnimalVO;
import fc.java.course1.model.CatVO;
import fc.java.course1.model.DogVO;

public class PolyMethodTest {
    public static void main(String[] args) {
        DogVO dog = new DogVO();
        display(dog);
        CatVO cat = new CatVO();
        display(cat);
    }

    public static void display(AnimalVO ani){
        ani.eat();
        // CatVO 타입으로 받은 경우에만 실행 -> if문을 사용해야한다.
        if (ani instanceof CatVO){
            ((CatVO)ani).night();
        }

    }
}
