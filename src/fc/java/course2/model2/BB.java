package fc.java.course2.model2;
// BB는 노출하지 않음
public class BB implements CC{
    @Override
    public void x() {
        System.out.println("x동작 실행");
    }

    @Override
    public void y() {
        System.out.println("y동작 실행");
    }

    @Override
    public void z() {
        System.out.println("z동작 실행");
    }
}
