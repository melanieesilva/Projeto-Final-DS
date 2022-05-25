package view;
import java.sql.*;
import conexaoDao.ConexaoDao;
import conexaoDao.UsuarioDao;
import model.UsuarioModel;

public class TelaCadastro extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement prp = null;
    private ResultSet rs = null;
    
    
    public TelaCadastro() {
        initComponents();
        
        conexao = ConexaoDao.conector();
        System.out.println(conexao);
        
 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DisplayCadastro = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeTexto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailTexto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senhaTexto = new javax.swing.JPasswordField();
        btnCadastro = new javax.swing.JButton();
        btnVoltarCadastro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My App D.S.");
        setMinimumSize(new java.awt.Dimension(584, 584));
        setResizable(false);
        getContentPane().setLayout(null);

        DisplayCadastro.setBackground(new java.awt.Color(255, 255, 255));
        DisplayCadastro.setForeground(new java.awt.Color(255, 255, 255));
        DisplayCadastro.setDoubleBuffered(false);

        jPanel2.setBackground(new java.awt.Color(47, 46, 65));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setDoubleBuffered(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign Up");

        nomeTexto.setBackground(new java.awt.Color(255, 255, 255));
        nomeTexto.setForeground(new java.awt.Color(0, 0, 0));
        nomeTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeTexto.setBorder(null);
        nomeTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your name:");

        emailTexto.setBackground(new java.awt.Color(255, 255, 255));
        emailTexto.setForeground(new java.awt.Color(0, 0, 0));
        emailTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailTexto.setBorder(null);
        emailTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your e-mail:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your password:");

        senhaTexto.setBackground(new java.awt.Color(255, 255, 255));
        senhaTexto.setForeground(new java.awt.Color(0, 0, 0));
        senhaTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaTexto.setBorder(null);
        senhaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextoActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(102, 51, 255));
        btnCadastro.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Next");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnVoltarCadastro.setBackground(new java.awt.Color(102, 51, 255));
        btnVoltarCadastro.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnVoltarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarCadastro.setText("Back");
        btnVoltarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomeTexto)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(senhaTexto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVoltarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarCadastro)
                    .addComponent(btnCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/space_astro 1.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel5.setMinimumSize(new java.awt.Dimension(320, 320));
        jLabel5.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 33)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 255));
        jLabel6.setText("starts here.");

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 33)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 255));
        jLabel7.setText("Your journey");

        javax.swing.GroupLayout DisplayCadastroLayout = new javax.swing.GroupLayout(DisplayCadastro);
        DisplayCadastro.setLayout(DisplayCadastroLayout);
        DisplayCadastroLayout.setHorizontalGroup(
            DisplayCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayCadastroLayout.createSequentialGroup()
                .addGroup(DisplayCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DisplayCadastroLayout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addGroup(DisplayCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(DisplayCadastroLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DisplayCadastroLayout.setVerticalGroup(
            DisplayCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayCadastroLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(DisplayCadastro);
        DisplayCadastro.setBounds(0, -10, 580, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextoActionPerformed

    private void emailTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextoActionPerformed

    private void senhaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextoActionPerformed

    
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        String nome, email, senha;
        
        nome = nomeTexto.getText();
        email = emailTexto.getText();
        senha = senhaTexto.getText();
        
        UsuarioModel objusuario = new UsuarioModel();
        objusuario.setNome(nome);
        objusuario.setEmail(email);
        objusuario.setSenha(senha);
        
        Connection conexao = new ConexaoDao().conector();
        UsuarioDao objusuariodao = new UsuarioDao(conexao);
        objusuariodao.Cadastrar(objusuario);
        
        TelaPerfil telaPerfil = new TelaPerfil();
        telaPerfil.setVisible(true);
        telaPerfil.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnVoltarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVoltarCadastroActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DisplayCadastro;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnVoltarCadastro;
    private javax.swing.JTextField emailTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeTexto;
    private javax.swing.JPasswordField senhaTexto;
    // End of variables declaration//GEN-END:variables
}
