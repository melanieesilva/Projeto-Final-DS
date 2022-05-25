
package conexaoDao;

import model.UsuarioModel;
import view.TelaLogin;
import view.TelaPerfil;
import java.sql.*;
import javax.swing.JOptionPane;
import model.ModelEntrada;
import view.TelaUsuarios;

public class LoginDao {
    
    private TelaLogin loginview;

    public LoginDao(TelaLogin loginview) {
        this.loginview = loginview;
    }

    public LoginDao() {
    }

    public void autenticar() throws SQLException {
        //Buscar um usuário
        //Verificar se existe no banco de dados
        //Se existir, direciona para a tela de perfil
        
       String nome = loginview.getNomeLogin().getText();
       String email = loginview.getEmailLogin().getText();
       
       UsuarioModel objusuarioAutenticar = new UsuarioModel(nome,email);
       
       //Verificar se existe
       
       Connection conexao = ConexaoDao.conector();
       UsuarioDao usuarioDao = new UsuarioDao(conexao);
        
       boolean existe;
        existe = usuarioDao.autenticarUsuario(objusuarioAutenticar);
       
       if(existe){
           TelaUsuarios telaUsuario = new TelaUsuarios();
           telaUsuario.setVisible(true);
           telaUsuario.setLocationRelativeTo(null);
           ModelEntrada entrada = new ModelEntrada();
           entrada.setNome(nome);
           entrada.setEmail(email);
           telaUsuario.exportarDados(entrada);
       }
       else{
           JOptionPane.showMessageDialog(loginview, "Nome ou e-mail inválidos");
       }
       
       
    }
    
    
}
