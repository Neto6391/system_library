/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerLocacao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelAluno;
import model.ModelLivro;
import model.ModelLocacao;
import model.ModelTabelaLocacao;
import modelConection.ConexaoBD;
import utilitario.Validar;



/**
 *
 * @author Neto
 */
public class FormDialogLocacao extends javax.swing.JDialog {

    /**
     * Creates new form FormDialogLocacao
     */
    
    Validar validar = new Validar();
    private ModelTabelaLocacao tabelaLocacoes;
    
    public FormDialogLocacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        try {
            tabelaLocacoes = new ModelTabelaLocacao(this.select());
        } catch (SQLException ex) {
            Logger.getLogger(FormDialogLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
        
        this.selectAluno();
        this.selectLivro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovoFormLocacao = new javax.swing.JButton();
        jButtonSalvarFormLocacao = new javax.swing.JButton();
        jButtonExcluirFormLocacao = new javax.swing.JButton();
        jButtonPesquisarLocacao = new javax.swing.JButton();
        jTextFieldPesquisarLocacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListagemLocacoes = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIdLocacao = new javax.swing.JTextField();
        jButtonFecharTelaLocacao = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxAlunos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxLivros = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextFieldPeriodoLocacao = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Locação de Livros");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jButtonNovoFormLocacao.setText("Novo");
        jButtonNovoFormLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoFormLocacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovoFormLocacao);
        jButtonNovoFormLocacao.setBounds(880, 320, 130, 30);

        jButtonSalvarFormLocacao.setText("Salvar");
        jButtonSalvarFormLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarFormLocacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvarFormLocacao);
        jButtonSalvarFormLocacao.setBounds(880, 360, 130, 30);

        jButtonExcluirFormLocacao.setText("Excluir");
        jButtonExcluirFormLocacao.setEnabled(false);
        jButtonExcluirFormLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirFormLocacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluirFormLocacao);
        jButtonExcluirFormLocacao.setBounds(880, 400, 130, 30);

        jButtonPesquisarLocacao.setText("Pesquisar");
        jButtonPesquisarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarLocacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisarLocacao);
        jButtonPesquisarLocacao.setBounds(620, 30, 130, 40);
        jPanel1.add(jTextFieldPesquisarLocacao);
        jTextFieldPesquisarLocacao.setBounds(170, 30, 430, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pesquisar Locacao: ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 40, 130, 20);

        jTableListagemLocacoes.setModel(tabelaLocacoes);
        jTableListagemLocacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListagemLocacoesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListagemLocacoes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 1040, 220);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Livro:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 460, 110, 30);

        jTextFieldIdLocacao.setEnabled(false);
        jPanel1.add(jTextFieldIdLocacao);
        jTextFieldIdLocacao.setBounds(250, 330, 240, 40);

        jButtonFecharTelaLocacao.setText("Fechar Tela");
        jButtonFecharTelaLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharTelaLocacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFecharTelaLocacao);
        jButtonFecharTelaLocacao.setBounds(880, 440, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Período Locação:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(520, 330, 130, 30);

        jComboBoxAlunos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código - Aluno - Curso - Matrícula - Período" }));
        jPanel1.add(jComboBoxAlunos);
        jComboBoxAlunos.setBounds(250, 390, 400, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Aluno:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(110, 390, 110, 30);

        jComboBoxLivros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código - Nome - Autor - Editora - Vol. - Estoque" }));
        jPanel1.add(jComboBoxLivros);
        jComboBoxLivros.setBounds(250, 450, 400, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Código da Locação:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(110, 330, 130, 30);

        try {
            jFormattedTextFieldPeriodoLocacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPeriodoLocacao.setText("00/00/0000");
        jPanel1.add(jFormattedTextFieldPeriodoLocacao);
        jFormattedTextFieldPeriodoLocacao.setBounds(650, 330, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void limparCampos(){
        jTextFieldIdLocacao.setText("");
        jComboBoxAlunos.setSelectedIndex(0);
        jComboBoxLivros.setSelectedIndex(0);
        jFormattedTextFieldPeriodoLocacao.setText("00/00/0000");
        
        jButtonExcluirFormLocacao.setEnabled(false);
    }
    
    private void jTableListagemLocacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListagemLocacoesMouseClicked
        jTextFieldIdLocacao.setText(jTableListagemLocacoes.getValueAt(jTableListagemLocacoes.getSelectedRow(), 0).toString());
        jComboBoxAlunos.setSelectedIndex(Integer.valueOf(jTableListagemLocacoes.getValueAt(jTableListagemLocacoes.getSelectedRow(), 4).toString()));
        jComboBoxLivros.setSelectedIndex(Integer.valueOf(jTableListagemLocacoes.getValueAt(jTableListagemLocacoes.getSelectedRow(), 5).toString()));
        jFormattedTextFieldPeriodoLocacao.setText(formatarDataTabela(jTableListagemLocacoes.getValueAt(jTableListagemLocacoes.getSelectedRow(), 1).toString()));
        //System.out.println(jTableListagemLocacoes.getValueAt(jTableListagemLocacoes.getSelectedRow(), 1).toString());
        jButtonExcluirFormLocacao.setEnabled(true);
    }//GEN-LAST:event_jTableListagemLocacoesMouseClicked

    private void jButtonFecharTelaLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharTelaLocacaoActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharTelaLocacaoActionPerformed

    private void jButtonSalvarFormLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarFormLocacaoActionPerformed
        
        if(jTextFieldIdLocacao.getText().equals("")){
            this.insert();

        } else {
            this.update();
        }

        try {
            tabelaLocacoes.setResult(select());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_jButtonSalvarFormLocacaoActionPerformed

    private void jButtonNovoFormLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoFormLocacaoActionPerformed
        this.limparCampos();
        
        try {
            tabelaLocacoes.setResult(select());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonNovoFormLocacaoActionPerformed

    private void jButtonExcluirFormLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirFormLocacaoActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this,
            "Tem certeza que você deseja excluir esse registro?",
            "Exclusão de Cadastro",
            JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            this.delete(Integer.valueOf(jTextFieldIdLocacao.getText()));
            this.limparCampos();
            
            try {
                tabelaLocacoes.setResult(select());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            jButtonExcluirFormLocacao.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonExcluirFormLocacaoActionPerformed

    private void jButtonPesquisarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarLocacaoActionPerformed
        String tamanhoStringData[] = jTextFieldPesquisarLocacao.getText().split("/");
        if(tamanhoStringData.length == 3){
            try {
                tabelaLocacoes.setResult(this.search(jTextFieldPesquisarLocacao.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(FormDialogAluno.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Somente Datas com a seguinte formatação DD/MM/AAAA");
        }
        
    }//GEN-LAST:event_jButtonPesquisarLocacaoActionPerformed
    
    public ResultSet select(){
        ControllerLocacao control = new ControllerLocacao(new ConexaoBD());
        return control.selectTabelaLocacaoBD();
    }
    
    
    public void insert(){
        
        if(jComboBoxAlunos.getSelectedIndex() > 0 && jComboBoxLivros.getSelectedIndex() > 0){
            if(this.validar.tirarMascaraData(jFormattedTextFieldPeriodoLocacao.getText()).contains(" ")){
                validar.autenticarCampos("Campo Data Lancamento");
            }
            
            ModelLocacao mod = new ModelLocacao(jFormattedTextFieldPeriodoLocacao.getText(), ((ModelAluno)jComboBoxAlunos.getSelectedItem()).getId_aluno(), ((ModelLivro)jComboBoxLivros.getSelectedItem()).getIdLivro(), jComboBoxAlunos.getSelectedIndex(), jComboBoxLivros.getSelectedIndex());
            
            ControllerLocacao control = new ControllerLocacao(new ConexaoBD(), mod);
            if(this.autenticarValoresForm(mod) && mod.getPeriodoLoc().compareTo(new Date()) > 0){
                control.salvarLocacaoBD();
                this.limparCampos();
                
            } else {
                if(mod.getPeriodoLoc().compareTo(new Date()) < 0){
                    JOptionPane.showMessageDialog(null, "Data tem que ser após Data Atual");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro");
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Enviar dados, tanto Aluno e Livro devem serem selecionados ou tanto Aluno e Livro, devem ser escolhida a segunda opção ignorando a primeira!");
        }
    }
    
    public void update(){
        if(jComboBoxAlunos.getSelectedIndex() > 0 && jComboBoxLivros.getSelectedIndex() > 0){
            if(this.validar.tirarMascaraData(jFormattedTextFieldPeriodoLocacao.getText()).contains(" ")){
                validar.autenticarCampos("Campo Data Lancamento");
            }
            
            ModelLocacao mod = new ModelLocacao(Integer.parseInt(jTextFieldIdLocacao.getText()), jFormattedTextFieldPeriodoLocacao.getText(), ((ModelAluno)jComboBoxAlunos.getSelectedItem()).getId_aluno(), ((ModelLivro)jComboBoxLivros.getSelectedItem()).getIdLivro(), jComboBoxAlunos.getSelectedIndex(), jComboBoxLivros.getSelectedIndex());
            System.out.println(mod.getPeriodoLocacao() + " " + mod.getCodigoAluno() + " " + mod.getCodigoLivro());
            ControllerLocacao control = new ControllerLocacao(new ConexaoBD(), mod);
            if(this.autenticarValoresForm(mod) && mod.getPeriodoLoc().compareTo(new Date()) > 0){
                control.atualizarLocacaoBD();
                this.limparCampos();
                
            } else {
                if(mod.getPeriodoLoc().compareTo(new Date()) < 0){
                    JOptionPane.showMessageDialog(null, "Data tem que ser após Data Atual");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Enviar dados, tanto Aluno e Livro devem serem selecionados ou tanto Aluno e Livro, devem ser escolhida a segunda opção ignorando a primeira!");
        }
    }
    
    public void delete(int id){
        ModelLocacao mod = new ModelLocacao(id);
        ControllerLocacao control = new ControllerLocacao(new ConexaoBD(), mod);
        control.deletarLocacaoBD(); 
    }
    
    
    public ResultSet selectAluno(){
        ControllerLocacao control = new ControllerLocacao(new ConexaoBD());
        
        
        
        return control.selectAluno(this.jComboBoxAlunos);
    }
    
    public ResultSet selectLivro(){
        ControllerLocacao control = new ControllerLocacao(new ConexaoBD());
        
        return control.selectLivro(this.jComboBoxLivros);
    }
    
    public ResultSet search(String pesquisa){
        ModelLocacao mod = new ModelLocacao(pesquisa);
        ControllerLocacao control = new ControllerLocacao(new ConexaoBD(), mod);
        return control.searchLocacaoBD();
    }
    
    
    public String formatarDataTabela(String data){
        String date[] = data.split("-");
        return date[2] + "/" + date[1] + "/" + date[0];
    }
    
    
    public Boolean autenticarValoresForm(ModelLocacao mod){
                
        if(validar.validarDataLocacao(mod.dataInversa(mod.getPeriodoLocacao()))){
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(FormDialogLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDialogLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDialogLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDialogLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormDialogLocacao dialog = new FormDialogLocacao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonExcluirFormLocacao;
    private javax.swing.JButton jButtonFecharTelaLocacao;
    private javax.swing.JButton jButtonNovoFormLocacao;
    private javax.swing.JButton jButtonPesquisarLocacao;
    private javax.swing.JButton jButtonSalvarFormLocacao;
    private javax.swing.JComboBox<String> jComboBoxAlunos;
    private javax.swing.JComboBox<String> jComboBoxLivros;
    private javax.swing.JFormattedTextField jFormattedTextFieldPeriodoLocacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListagemLocacoes;
    private javax.swing.JTextField jTextFieldIdLocacao;
    private javax.swing.JTextField jTextFieldPesquisarLocacao;
    // End of variables declaration//GEN-END:variables
}
