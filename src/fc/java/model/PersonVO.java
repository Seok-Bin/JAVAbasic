package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private  String phone;

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
}
