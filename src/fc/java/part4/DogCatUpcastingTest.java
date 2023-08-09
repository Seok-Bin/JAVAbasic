package fc.java.part4;

import fc.java.model.AnimalVO;
import fc.java.model.CatVO;
import fc.java.model.DogVO;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        AnimalVO dog = new DogVO();
        dog.eat();

        AnimalVO cat = new CatVO();
        cat.eat();

    }
}
