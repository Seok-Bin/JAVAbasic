package fc.java.poly;

public class DogVO extends AnimalVO {
    // 재정의 (override)
    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }
}


