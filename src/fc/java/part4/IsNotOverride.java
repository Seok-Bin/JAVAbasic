package fc.java.part4;

import fc.java.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
        //다형성을 보장하기 위해서는 재정의를 강제로 하게 만들면 된다. ---> 추상클래스와 추상메서드를 사용(abstract)
        AnimalVO dog = new DogVO();
        AnimalVO cat = new CatVO();

        dog.eat();
        cat.eat();
    }
}
