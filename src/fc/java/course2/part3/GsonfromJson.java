package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsonfromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":29,\"email\":\"ghdrlfehd@naver.com\"}";

        Gson gson = new Gson();
        Member mamber = gson.fromJson(json, Member.class);

        System.out.println("mamber = " + mamber);
    }
}
