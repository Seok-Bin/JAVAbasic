package fc.java.part4;

import fc.java.model.AnimalVO;
import fc.java.model.CatVO;
import fc.java.model.DogVO;

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
