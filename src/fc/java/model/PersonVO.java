package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private  String phone;

    // 생략된 생성자 메서드가 있다. => 기본생성자
    public PersonVO(){
        // 객체를 생성하는 코드는 내부에서 만들어진다.
        // 객체의 초기화
    }

    //생성자 오버로딩
    public  PersonVO(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age < 120 && age > 0){
            this.age = age;
        }else {
            System.out.println("잘못된 요청");
        }

    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //getter method
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }

    // toString() 메서드에 모든 값을 문자열로 만들기
    public String toString(){
        return name + "\t" + age + "\t" + phone;
    }
}
