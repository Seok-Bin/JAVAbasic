package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.course2.model2.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("Tom", 24);
        Gson json = new Gson();
        String j = json.toJson(person);
        System.out.println(j);
    }
}
