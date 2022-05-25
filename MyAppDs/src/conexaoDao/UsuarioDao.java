package conexaoDao;

import model.UsuarioModel;
import java.sql.*;

public class UsuarioDao {
    
    private Connection con;
    PreparedStatement prp;
    
    public UsuarioDao(Connection con){
        this.con = con;
    }
    
    public void Cadastrar(UsuarioModel usuario){
        
        String sql = "insert into usuario (nome,email,senha) values (?,?,?)";
        con = ConexaoDao.conector();
        
        try {
            
            prp = con.prepareStatement(sql);
            prp.setString (1, usuario.getNome());
            prp.setString (2, usuario.getEmail());
            prp.setString (3, usuario.getSenha());
            
            prp.execute();
        } catch (SQLException e) {
        }
        
    }


    boolean autenticarUsuario(UsuarioModel objusuarioAutenticar) throws SQLException {
        String sqlAutentica = "select * from usuario where nome = '"+objusuarioAutenticar.getNome()+"' and email = '"+objusuarioAutenticar.getEmail()+"'";
        con = ConexaoDao.conector();
        prp = con.prepareStatement(sqlAutentica);
        prp.execute();
        
        ResultSet resultSet = prp.getResultSet();
        
        return resultSet.next();
        
    }
}
