package fc.java.course2.model2;
// MySQLDriver MySQL 회사에서 만들어서 제공한다.
public class MySQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("MySQL 접속 시도");
    }
}
