package fc.java.part4;

import fc.java.part4.Employee;

// 일반사원(vo)
public class RempVO extends Employee {
    public RempVO(){
        super(); // ==> new Employee()
    }

    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
        // 부모에게 데이터 전송
        super(name, age, phone, empDate,dept, marriage); //  부모의 생성자를 호출
    }
}
