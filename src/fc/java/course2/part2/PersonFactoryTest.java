package fc.java.course2.part2;

import fc.java.course2.model2.Person;
import fc.java.course2.model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        /*PersonFactory personFactory = Person::new;
        Person person = personFactory.creat("홍길동", 40);
        System.out.println(person);*/
        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person creat(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person = personFactory.creat("홍길동", 40);
        System.out.println(person);
    }
}
