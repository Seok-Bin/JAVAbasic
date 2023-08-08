package fc.java.part4;

import fc.java.part4.Employee;

// 일반사원(vo)
public class RempVO extends Employee {
    public RempVO(){
        super(); // ==> new Employee()
    }

    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
        // 초기화(자식이 부모의 기억공간에 접근하여 초기화)
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }
}
