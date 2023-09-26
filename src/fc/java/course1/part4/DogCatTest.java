package fc.java.course1.part4;

import fc.java.course1.model.CatVO;
import fc.java.course1.model.DogVO;

public class DogCatTest {
    public static void main(String[] args) {
        DogVO dog = new DogVO();
        dog.eat();

        CatVO cat = new CatVO();
        cat.eat();
        cat.night();
    }
}
