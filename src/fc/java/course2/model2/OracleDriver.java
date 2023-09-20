package fc.java.course2.model2;
// OracleDriver는 Oracle 회사에서 만들어서 제공한다.
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("Oracle 접속 시도");
    }
}
