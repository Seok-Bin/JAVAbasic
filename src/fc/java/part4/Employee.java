package fc.java.part4;
//사원 (vo,DTO)
public class Employee {
    protected String name;
    protected int age;
    protected String phone;
    protected String empDate;
    protected String dept;
    protected boolean marriage;

    public Employee(){
        super(); //상위 클래스의 생서자를 호출 -> new Object()  (생략가능)
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
