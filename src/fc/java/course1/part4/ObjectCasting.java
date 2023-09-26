package fc.java.course1.part4;

import fc.java.course1.model.AnimalVO;
import fc.java.course1.model.CatVO;
import fc.java.course1.model.DogVO;

public class ObjectCasting {
    public static void main(String[] args) {
        //업캐스팅
        AnimalVO ani = new DogVO();
        ani.eat();

        ani = new CatVO();
        ani.eat();

        //다운캐스팅
        CatVO d = (CatVO)ani;
        d.night();

        //다운캐스팅 한줄로 작성
        ((CatVO)ani).night();
    }
}
