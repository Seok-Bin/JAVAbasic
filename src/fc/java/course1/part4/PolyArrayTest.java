package fc.java.course1.part4;

import fc.java.course1.model.*;

public class PolyArrayTest {
    public static void main(String[] args) {
        DogVO d = new DogVO();
        CatVO c = new CatVO();
        // Dog와 Cat를 저장하는 배열을 만들자
        // 다형성 배열
        AnimalVO[] ani = new AnimalVO[2];
        // AnimalVO[] ani = {new CatVO(), new DogVO()};
        ani[0] = d;
        ani[1] = c;
        display(ani);
    }

    private static void display(AnimalVO[] ani) {
        for (int i = 0; i < ani.length; i++){
            ani[i].eat();
            if (ani[i] instanceof CatVO){
                ((CatVO)ani[i]).night();
            }
        }
    }
}



