package fc.java.part4;

import fc.java.model.CatVO;
import fc.java.model.DogVO;

public class DogCatTest {
    public static void main(String[] args) {
        DogVO dog = new DogVO();
        dog.eat();

        CatVO cat = new CatVO();
        cat.eat();
        cat.night();
    }
}
