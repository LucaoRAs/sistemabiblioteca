import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaDB {
    // atributo
    private Connection conexao;
    // construtor
    public ConectaDB(){
        // sao as credenciais da sua conexao com BD
        String url = "jdbc:mariadb://localhost:3306/ed2";
        String user = "root";
        String pwd = "root";
        try {
            conexao = DriverManager.getConnection(url, user, pwd);
            System.out.println("Conexão realizada!");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error" + e.getMessage());
        }
    }

    public Connection getConexaoDB(){
        return conexao;
    }
}