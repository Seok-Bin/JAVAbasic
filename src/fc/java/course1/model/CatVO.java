package fc.java.course1.model;

public class CatVO extends AnimalVO{
    // 재정의 (override)
    @Override
    public void eat() {
        System.out.println("고양이가 먹다");
    }

    public void night(){
        System.out.println("밤에 눈이 빛난다");
    }
}
