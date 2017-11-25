/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerLivro;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelLivro;
import model.ModelTabelaLivros;
import modelConection.ConexaoBD;
import utilitario.Validar;

/**
 *
 * @author Neto
 */
public class FormDialogLivro extends javax.swing.JDialog {

    /**
     * Creates new form FormDialogLivro
     */
    
    Validar validar = new Validar();
    private ModelTabelaLivros tabelaLivros;
    
    public FormDialogLivro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        try {
            tabelaLivros = new ModelTabelaLivros(this.select());
        } catch (SQLException ex) {
            Logger.getLogger(FormDialogAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

        jPanel1 = new javax.swing.JPanel();
        jButtonNovoFormLivro = new javax.swing.JButton();
        jButtonSalvarFormLivro = new javax.swing.JButton();
        jButtonExcluirFormLivro = new javax.swing.JButton();
        jButtonPesquisarLivro = new javax.swing.JButton();
        jTextFieldPesquisarLivro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListagemLivros = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIdLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNomeLivro = new javax.swing.JTextField();
        jTextFieldAutorLivro = new javax.swing.JTextField();
        jTextFieldEditoraLivro = new javax.swing.JTextField();
        jSpinnerEstoqueLivro = new javax.swing.JSpinner();
        jSpinnerVolumeLivro = new javax.swing.JSpinner();
        jFormattedTextFieldDataLanc = new javax.swing.JFormattedTextField();
        jButtonFecharTelaLivro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jButtonNovoFormLivro.setText("Novo");
        jButtonNovoFormLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoFormLivroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovoFormLivro);
        jButtonNovoFormLivro.setBounds(880, 320, 130, 30);

        jButtonSalvarFormLivro.setText("Salvar");
        jButtonSalvarFormLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarFormLivroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvarFormLivro);
        jButtonSalvarFormLivro.setBounds(880, 360, 130, 30);

        jButtonExcluirFormLivro.setText("Excluir");
        jButtonExcluirFormLivro.setEnabled(false);
        jButtonExcluirFormLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirFormLivroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluirFormLivro);
        jButtonExcluirFormLivro.setBounds(880, 400, 130, 30);

        jButtonPesquisarLivro.setText("Pesquisar");
        jButtonPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarLivroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisarLivro);
        jButtonPesquisarLivro.setBounds(600, 30, 130, 40);

        jTextFieldPesquisarLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarLivroKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldPesquisarLivro);
        jTextFieldPesquisarLivro.setBounds(150, 30, 430, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pesquisar Livro: ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 40, 110, 20);

        jTableListagemLivros.setModel(tabelaLivros);
        jTableListagemLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListagemLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListagemLivros);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 1040, 220);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Código do Livro:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 330, 120, 30);

        jTextFieldIdLivro.setEnabled(false);
        jPanel1.add(jTextFieldIdLivro);
        jTextFieldIdLivro.setBounds(250, 330, 240, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Livro:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 390, 110, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Autor:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 450, 60, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Editora: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 500, 80, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Data de Lançamento:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, 450, 140, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Volume:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(530, 340, 80, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Estoque:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(530, 390, 80, 17);
        jPanel1.add(jTextFieldNomeLivro);
        jTextFieldNomeLivro.setBounds(250, 380, 240, 40);
        jPanel1.add(jTextFieldAutorLivro);
        jTextFieldAutorLivro.setBounds(250, 430, 240, 40);
        jPanel1.add(jTextFieldEditoraLivro);
        jTextFieldEditoraLivro.setBounds(250, 490, 240, 40);

        jSpinnerEstoqueLivro.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        jPanel1.add(jSpinnerEstoqueLivro);
        jSpinnerEstoqueLivro.setBounds(710, 380, 80, 40);

        jSpinnerVolumeLivro.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(jSpinnerVolumeLivro);
        jSpinnerVolumeLivro.setBounds(710, 320, 80, 40);

        try {
            jFormattedTextFieldDataLanc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataLanc.setText("dd/mm/aaaa    ");
        jPanel1.add(jFormattedTextFieldDataLanc);
        jFormattedTextFieldDataLanc.setBounds(710, 440, 100, 40);

        jButtonFecharTelaLivro.setText("Fechar Tela");
        jButtonFecharTelaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharTelaLivroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFecharTelaLivro);
        jButtonFecharTelaLivro.setBounds(880, 440, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Livros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(391, 391, 391))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoFormLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoFormLivroActionPerformed
        this.limparCampos();
        
    }//GEN-LAST:event_jButtonNovoFormLivroActionPerformed

    private void jButtonSalvarFormLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarFormLivroActionPerformed
        if(jTextFieldIdLivro.getText().equals("")){
            this.insert();

        } else {
            this.update();
        }

        try {
            tabelaLivros.setResult(select());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSalvarFormLivroActionPerformed

    private void jButtonExcluirFormLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirFormLivroActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this,
            "Tem certeza que você deseja excluir esse registro?",
            "Exclusão de Cadastro",
            JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            this.delete(Integer.valueOf(jTextFieldIdLivro.getText()));
            this.limparCampos();
            
            try {
                tabelaLivros.setResult(select());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            jButtonExcluirFormLivro.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonExcluirFormLivroActionPerformed

    private void jButtonPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarLivroActionPerformed
        try {
            tabelaLivros.setResult(this.search(jTextFieldPesquisarLivro.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(FormDialogAluno.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonPesquisarLivroActionPerformed

    private void jTextFieldPesquisarLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarLivroKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                tabelaLivros.setResult(this.search(jTextFieldPesquisarLivro.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(FormDialogAluno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextFieldPesquisarLivroKeyReleased

    private void jTableListagemLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListagemLivrosMouseClicked
        jTextFieldIdLivro.setText(jTableListagemLivros.getValueAt(jTableListagemLivros.getSelectedRow(), 0).toString());
        jTextFieldNomeLivro.setText(jTableListagemLivros.getValueAt(jTableListagemLivros.getSelectedRow(), 1).toString());
        jTextFieldAutorLivro.setText(jTableListagemLivros.getValueAt(jTableListagemLivros.getSelectedRow(), 2).toString());
        jTextFieldEditoraLivro.setText(jTableListagemLivros.getValueAt(jTableListagemLivros.getSelectedRow(), 3).toString());
        jFormattedTextFieldDataLanc.setText(this.formatarDataTabela(jTableListagemLivros.getValueAt(jTableListagemLivros.getSelectedRow(), 4).toString()));
        jSpinnerVolumeLivro.setValue(Integer.valueOf(jTableListagemLivros.getValueAt(jTableListagemLivros.getSelectedRow(), 5).toString()));
        jSpinnerEstoqueLivro.setValue(Integer.valueOf(jTableListagemLivros.getValueAt(jTableListagemLivros.getSelectedRow(), 6).toString()));
        
        jButtonExcluirFormLivro.setEnabled(true);
    }//GEN-LAST:event_jTableListagemLivrosMouseClicked

    private void jButtonFecharTelaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharTelaLivroActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharTelaLivroActionPerformed

    
    public void limparCampos(){
        jTextFieldIdLivro.setText("");
        jTextFieldNomeLivro.setText("");
        jTextFieldAutorLivro.setText("");
        jTextFieldEditoraLivro.setText("");
        jSpinnerVolumeLivro.setValue(1);
        jSpinnerEstoqueLivro.setValue(1);
        jFormattedTextFieldDataLanc.setText("");
        jTextFieldPesquisarLivro.setText("");
        jButtonExcluirFormLivro.setEnabled(false);
    }
    
    
    public ResultSet search(String pesquisa){
        ModelLivro mod = new ModelLivro(pesquisa);
        ControllerLivro control = new ControllerLivro(new ConexaoBD(), mod);
        return control.searchLivroBD();
    }
    
    
    
    public void insert(){
        this.validar.verificarCampoVazio(jTextFieldNomeLivro.getText(), "Campo Nome Livro");
        this.validar.verificarCampoVazio(jTextFieldAutorLivro.getText(), "Campo Nome Autor");
        this.validar.verificarCampoVazio(jTextFieldEditoraLivro.getText(), "Campo Nome Editora");
        if(this.validar.tirarMascaraData(jFormattedTextFieldDataLanc.getText()).contains(" ")){
            validar.autenticarCampos("Campo Data Lancamento");
        }
        this.validar.verificarCampoVazio(jFormattedTextFieldDataLanc.getText(), "Campo Data Lançamento");
        
        ModelLivro mod = new ModelLivro(jTextFieldNomeLivro.getText(), jTextFieldAutorLivro.getText(), jTextFieldEditoraLivro.getText(), jFormattedTextFieldDataLanc.getText(), Integer.parseInt(jSpinnerVolumeLivro.getValue().toString()), Integer.parseInt(jSpinnerEstoqueLivro.getValue().toString()));
        ControllerLivro control = new ControllerLivro(new ConexaoBD(), mod);
        
        if(this.autenticarValoresForm(mod)){
            control.SalvarLivroBD();
            this.limparCampos();
        } else {
            System.out.println("Erro...");
        }
        
    }
    
    public ResultSet select(){
        ControllerLivro control = new ControllerLivro(new ConexaoBD());
        return control.selectTabelaLivroBD();
    }
    
    public void update(){
       this.validar.verificarCampoVazio(jTextFieldNomeLivro.getText(), "Campo Nome Livro");
       this.validar.verificarCampoVazio(jTextFieldAutorLivro.getText(), "Campo Nome Autor");
       this.validar.verificarCampoVazio(jTextFieldEditoraLivro.getText(), "Campo Nome Editora");
       if(this.validar.tirarMascaraData(jFormattedTextFieldDataLanc.getText()).contains(" ")){
            validar.autenticarCampos("Campo Data Lancamento");
        }
       this.validar.verificarCampoVazio(jFormattedTextFieldDataLanc.getText(), "Campo Data Lançamento");
        
       ModelLivro mod = new ModelLivro(Integer.valueOf(jTextFieldIdLivro.getText()), jTextFieldNomeLivro.getText(), jTextFieldAutorLivro.getText(), jTextFieldEditoraLivro.getText(), jFormattedTextFieldDataLanc.getText(), Integer.parseInt(jSpinnerVolumeLivro.getValue().toString()), Integer.parseInt(jSpinnerEstoqueLivro.getValue().toString()));
       ControllerLivro control = new ControllerLivro(new ConexaoBD(), mod);
       
       if(this.autenticarValoresForm(mod)){
            control.atualizarLivroBD();
            this.limparCampos();
            this.jButtonExcluirFormLivro.setEnabled(false);
        } else {
            System.out.println("Erro...");
        }
    }
    
    public void delete(int id){
        ModelLivro mod = new ModelLivro(id);
        ControllerLivro control = new ControllerLivro(new ConexaoBD(), mod);
        control.deletarLivroBD(); 
    }
    
    public String formatarDataTabela(String data){
        String date[] = data.split("-");
        return date[2] + "/" + date[1] + "/" + date[0];
    }
    
    public Boolean autenticarValoresForm(ModelLivro mod){
        int errosForm = 0;
        
        if(validar.autenticarNomes(mod.getNomeLivro(), "Campo de Nome Livro")){
            errosForm++;
        }
            
        if(validar.autenticarNomes(mod.getAutor(), "Campo de Autor")){
            errosForm++;
        }
            
        if(validar.autenticarNomes(mod.getEditora(), "Campo de Editora")){
            errosForm++;
        }
        //errosForm++;
        if(validar.validarDataLivro(mod.getDataLancLivro())){
            errosForm++;
        }
            
        
            
        if(errosForm == 0){
            return true;
        } else {
            return false;
        }
        
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
            java.util.logging.Logger.getLogger(FormDialogLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDialogLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDialogLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDialogLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormDialogLivro dialog = new FormDialogLivro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluirFormLivro;
    private javax.swing.JButton jButtonFecharTelaLivro;
    private javax.swing.JButton jButtonNovoFormLivro;
    private javax.swing.JButton jButtonPesquisarLivro;
    private javax.swing.JButton jButtonSalvarFormLivro;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataLanc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerEstoqueLivro;
    private javax.swing.JSpinner jSpinnerVolumeLivro;
    private javax.swing.JTable jTableListagemLivros;
    private javax.swing.JTextField jTextFieldAutorLivro;
    private javax.swing.JTextField jTextFieldEditoraLivro;
    private javax.swing.JTextField jTextFieldIdLivro;
    private javax.swing.JTextField jTextFieldNomeLivro;
    private javax.swing.JTextField jTextFieldPesquisarLivro;
    // End of variables declaration//GEN-END:variables
}
