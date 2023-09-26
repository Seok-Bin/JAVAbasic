package fc.java.course1.part4;

import fc.java.course1.model.AnimalVO;
import fc.java.course1.model.CatVO;
import fc.java.course1.model.DogVO;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        AnimalVO dog = new DogVO();
        dog.eat();

        AnimalVO cat = new CatVO();
        cat.eat();

    }
}
