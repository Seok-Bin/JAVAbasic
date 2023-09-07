package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.course2.model2.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"Tom\",\"age\":24}";
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);
        System.out.println(person);
    }
}
