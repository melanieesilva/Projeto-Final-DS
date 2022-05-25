package conexaoDao;
import java.sql.*;


public class ConexaoDao {
    
    
    //metodo para estabelecer conexao
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        //chamar o driver de conexão
        
        String driver = "com.mysql.jdbc.Driver";
        
        //Armazenando informações referente ao banco
        
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "mel";
        String password = "78955123";
        
        //estabelecendo conexão
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println("conexaoDao "+e);
                    
            return null;
        }
        
 
    }
}
