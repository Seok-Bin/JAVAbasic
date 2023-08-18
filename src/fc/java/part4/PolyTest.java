package fc.java.part4;

import fc.java.model.*;

public class PolyTest {
    public static void main(String[] args) {
        //업캐스팅으로 객체를 생성
        //상속관계, 재정의(override), 동적바인딩
        //다형성(message polymorphism)
        //상위 클래스가 동일한 메세지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리
        AnimalVO x = new DogVO();
        x.eat(); //실행시점에서 사용될 메서드가 뎔정되는 바인딩(동적바인딩)

        AnimalVO y = new CatVO();
        y.eat();
        //다운캐스팅
        ((CatVO)y).night();
        //overloading(오버로딩) : 정적바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램의 실행속도와 무관
        //override(재정의)      : 동적바인딩 = 실행시점에서 사용될 메서드가 결정되는 바인딩
        //-> 프로그램의 실행 속도와 관계가 있다.
    }
}
