package fc.java.model;

public class DogVO extends AnimalVO {
    @Override
    public void eat() {
        System.out.println("개가 먹다");
    }
}
