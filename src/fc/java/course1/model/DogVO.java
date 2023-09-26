package fc.java.course1.model;

public class DogVO extends AnimalVO {
    // 재정의 (override)
    @Override
    public void eat() {
        System.out.println("개가 먹다");
    }
}
