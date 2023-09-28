package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "833b131eef18c1f1d3e8cb99ac716404";
        String city = "Seoul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q="+ city +"&appid="+apiKey + "&units=metric";

        //예외처리
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();
            if(responseCode == 200){
                //스트림(입력, 출력)의 연결
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                // SttingBuffer 을 이용하여 넘어오는 스트링을 모아준다.
                StringBuffer content = new StringBuffer();
                while((inputLine=in.readLine()) != null){
                    content.append(inputLine);
                }
                //스트림을 닫는다.
                in.close();
                System.out.println("content.toString() = " + content.toString());
                //데이터 뽑아내기
                JsonObject weatherData= JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = weatherData.getAsJsonObject("main");
                // 온도를 double 타입으로 받는다.
                Double temp = mainData.get("temp").getAsDouble();
                System.out.println(temp);
                connection.disconnect();
            }else {
                System.out.println("오류");
            }

        }catch (Exception e){
            e.printStackTrace(); // 에러메세지 출력
        }

    }
}
