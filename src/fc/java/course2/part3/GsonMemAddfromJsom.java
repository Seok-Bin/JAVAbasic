package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Person;

public class GsonMemAddfromJsom {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":29,\"email\":\"ghdrlfehd@naver.com\",\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}";

        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);

        System.out.println("person = " + person);
    }
}
