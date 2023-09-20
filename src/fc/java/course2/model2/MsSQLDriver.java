package fc.java.course2.model2;
// MsSQLDriver MsSQL 회사에서 만들어서 제공한다.
public class MsSQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("MsSQL 접속 시도");
    }
}
