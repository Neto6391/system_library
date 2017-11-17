/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



/**
 *
 * @author Neto
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */

    public TelaPrincipal() {
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jButtonCadAluno = new javax.swing.JButton();
        jButtonCadLivro = new javax.swing.JButton();
        jButtonUsuarios = new javax.swing.JButton();
        jButtonLocacaoLivro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelUsuarioAutenticado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTelaFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadAluno = new javax.swing.JMenuItem();
        jMenuItemCadLivro = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jMenuLocacao = new javax.swing.JMenu();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jButtonCadAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_aluno_icon_Resize.jpg"))); // NOI18N
        jButtonCadAluno.setToolTipText("Alunos");
        jButtonCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAlunoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonCadAluno);
        jButtonCadAluno.setBounds(30, 210, 130, 130);

        jButtonCadLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_livro_icon_Resize.jpg"))); // NOI18N
        jButtonCadLivro.setToolTipText("Livros");
        jInternalFrameBemVindo.getContentPane().add(jButtonCadLivro);
        jButtonCadLivro.setBounds(170, 210, 130, 130);

        jButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_user_icon_Resize.jpg"))); // NOI18N
        jButtonUsuarios.setToolTipText("Usuários");
        jInternalFrameBemVindo.getContentPane().add(jButtonUsuarios);
        jButtonUsuarios.setBounds(330, 210, 130, 129);

        jButtonLocacaoLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_livro_locado_icon_Resize.jpg"))); // NOI18N
        jButtonLocacaoLivro.setToolTipText("Locar Livros");
        jInternalFrameBemVindo.getContentPane().add(jButtonLocacaoLivro);
        jButtonLocacaoLivro.setBounds(600, 200, 130, 129);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Locação de Livros");
        jInternalFrameBemVindo.getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 160, 190, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cadastros");
        jInternalFrameBemVindo.getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 140, 140, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_fundoInternalFrame.jpg"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 110, 1260, 420);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_fechar_icon.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Tela Bem-Vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(1210, 0, 60, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ao Sistema de Controle de Biblioteca");
        jInternalFrameBemVindo.getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 20, 400, 50);

        jLabelUsuarioAutenticado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelUsuarioAutenticado);
        jLabelUsuarioAutenticado.setBounds(200, 30, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Seja Bem Vindo");
        jInternalFrameBemVindo.getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 180, 50);

        getContentPane().add(jInternalFrameBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1280, 560));

        jLabelTelaFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela_fundo_principal.jpg"))); // NOI18N
        getContentPane().add(jLabelTelaFundoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadAluno.setText("Alunos");
        jMenuItemCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAlunoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadAluno);

        jMenuItemCadLivro.setText("Livros");
        jMenuCadastro.add(jMenuItemCadLivro);

        jMenuItemCadUsuario.setText("Usuários");
        jMenuCadastro.add(jMenuItemCadUsuario);

        jMenuBar1.add(jMenuCadastro);

        jMenuLocacao.setText("Locação de Livros");
        jMenuBar1.add(jMenuLocacao);

        jMenuRelatorio.setText("Relatórios");
        jMenuBar1.add(jMenuRelatorio);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        TelaPrincipal telaAutenticada = new TelaPrincipal();
        telaAutenticada.setVisible(true);
        
        telaAutenticada.setUsuarioAutenticado(this.jLabelUsuarioAutenticado.getText());
        jLabelUsuarioAutenticado.setText("");
        dispose();
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItemCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAlunoActionPerformed
        FormDialogAluno telaCadastro = new FormDialogAluno(this, true);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadAlunoActionPerformed

    private void jButtonCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAlunoActionPerformed
        FormDialogAluno telaCadastro = new FormDialogAluno(this, true);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_jButtonCadAlunoActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    public void setUsuarioAutenticado(String user) {
         
         jLabelUsuarioAutenticado.setText(user);
        
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadAluno;
    private javax.swing.JButton jButtonCadLivro;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JButton jButtonLocacaoLivro;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTelaFundoPrincipal;
    private javax.swing.JLabel jLabelUsuarioAutenticado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemCadAluno;
    private javax.swing.JMenuItem jMenuItemCadLivro;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuLocacao;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
