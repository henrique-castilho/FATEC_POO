import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
  private static String host = "mysql-3cdeb9e4-henrique.h.aivencloud.com";
  private static String port = "13284";
  private static String db = "defaultdb";
  private static String user = "avnadmin";
  private static String password = "AVNS_Mt3Bc35GHp9tdfR9MdZ";
  //https://google.com:80/search
  //string de conexão
  //jdbc:postgresql://localhost:5432/20241_fatec_ipi_poo_pessoas
  public static Connection getConnection() 
                              throws Exception{
    //cláusula catch or declare
      var s = String.format(
        "jdbc:postgresql://%s:%s/%s",
        host, port, db
      );
      Connection conexao = DriverManager.getConnection(s, user, password);
      return conexao;
  }
}
