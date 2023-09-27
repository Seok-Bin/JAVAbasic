package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsontoJson {
    public static void main(String[] args) {
        Member member = new Member("홍길동", 29, "ghdrlfehd@naver.com");


        //객체 생성
        Gson gson = new Gson();
        // Object -> JSON
        String json = gson.toJson(member);

        System.out.println("json = " + json);
    }
}
