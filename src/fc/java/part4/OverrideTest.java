package fc.java.part4;

import fc.java.model.AnimalVO;
import fc.java.model.CatVO;
import fc.java.model.DogVO;

public class OverrideTest {
    public static void main(String[] args) {
        // upcasting(업캐스팅) : Dog.java(x), Dog.class(o) 이런 상황에서 사용하기 위해
        AnimalVO dog = new DogVO();
        dog.eat(); //Animal ---(동젖바인딩) ---> Dog

        AnimalVO cat = new CatVO();
        cat.eat(); //Animal ---(동젖바인딩) ---> Cat
    }
}
