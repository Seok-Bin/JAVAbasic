package fc.java.course1.part3;
// 객체(Object) = 상태정보(멤버 변수) + 행위정보(멤버메소드)
public class Person {
    public String name;
    public int age;
    public  String phone;


    public void play(){
        System.out.println("운동을 한다.");
    }

    public void eat(){
        System.out.println("음식을 먹다.");
    }

    public void walk(){
        System.out.println("걷다.");
    }
}
