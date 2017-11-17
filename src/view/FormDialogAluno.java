/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerAluno;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelAluno;
import model.ModelTabelaAlunos;
import modelConection.ConexaoBD;
import utilitario.Validar;


/**
 *
 * @author Neto
 */
public class FormDialogAluno extends javax.swing.JDialog {

    /**
     * Creates new form FormAluno2
     */
    
    Validar validar = new Validar();
    private ModelTabelaAlunos tabelaAlunos;
    
    
    
    public FormDialogAluno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        try {
            tabelaAlunos = new ModelTabelaAlunos(this.select());
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNumMatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerPeriodoCurso = new javax.swing.JSpinner();
        jButtonNovoFormAluno = new javax.swing.JButton();
        jButtonSalvarFormAluno = new javax.swing.JButton();
        jButtonExcluirFormAluno = new javax.swing.JButton();
        jButtonPesquisarAluno = new javax.swing.JButton();
        jTextFieldPesquisarAluno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldCPFAluno = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListagemAlunos = new javax.swing.JTable();
        jTextFieldEmailAluno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIdAluno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Aluno:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 387, 120, 20);
        jPanel1.add(jTextFieldNomeAluno);
        jTextFieldNomeAluno.setBounds(250, 380, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome do Curso:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 427, 120, 30);
        jPanel1.add(jTextFieldNomeCurso);
        jTextFieldNomeCurso.setBounds(250, 430, 240, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nº da Matrícula:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(510, 337, 97, 20);
        jPanel1.add(jTextFieldNumMatricula);
        jTextFieldNumMatricula.setBounds(640, 330, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CPF do Aluno:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(510, 377, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Período do Curso: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 467, 115, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("E-Mail do Aluno:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 430, 130, 30);

        jSpinnerPeriodoCurso.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(jSpinnerPeriodoCurso);
        jSpinnerPeriodoCurso.setBounds(250, 470, 62, 30);

        jButtonNovoFormAluno.setText("Novo");
        jButtonNovoFormAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoFormAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovoFormAluno);
        jButtonNovoFormAluno.setBounds(870, 330, 80, 30);

        jButtonSalvarFormAluno.setText("Salvar");
        jButtonSalvarFormAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarFormAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvarFormAluno);
        jButtonSalvarFormAluno.setBounds(870, 380, 80, 30);

        jButtonExcluirFormAluno.setText("Excluir");
        jButtonExcluirFormAluno.setEnabled(false);
        jButtonExcluirFormAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirFormAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluirFormAluno);
        jButtonExcluirFormAluno.setBounds(870, 430, 80, 30);

        jButtonPesquisarAluno.setText("Pesquisar");
        jButtonPesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisarAluno);
        jButtonPesquisarAluno.setBounds(610, 40, 90, 30);

        jTextFieldPesquisarAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarAlunoKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldPesquisarAluno);
        jTextFieldPesquisarAluno.setBounds(140, 40, 430, 31);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pesquisar Aluno: ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 50, 120, 20);

        try {
            jFormattedTextFieldCPFAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextFieldCPFAluno);
        jFormattedTextFieldCPFAluno.setBounds(640, 380, 150, 32);

        jTableListagemAlunos.setModel(tabelaAlunos);
        jTableListagemAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListagemAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListagemAlunos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 1040, 220);
        jPanel1.add(jTextFieldEmailAluno);
        jTextFieldEmailAluno.setBounds(640, 430, 200, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Código do Aluno:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 330, 120, 30);

        jTextFieldIdAluno.setEnabled(false);
        jPanel1.add(jTextFieldIdAluno);
        jTextFieldIdAluno.setBounds(250, 330, 240, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Alunos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(388, 388, 388))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void limparCampos(){
        jTextFieldNomeAluno.setText("");
        jTextFieldNomeCurso.setText("");
        jTextFieldNumMatricula.setText("");
        jFormattedTextFieldCPFAluno.setText("");
        jTextFieldEmailAluno.setText("");
        jSpinnerPeriodoCurso.setValue(1);
        jTextFieldIdAluno.setText("");
        jTextFieldPesquisarAluno.setText("");
    }

      
    private void jButtonNovoFormAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoFormAlunoActionPerformed
        this.limparCampos();
        jButtonExcluirFormAluno.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoFormAlunoActionPerformed

    private void jButtonSalvarFormAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarFormAlunoActionPerformed
        if(jTextFieldIdAluno.getText().equals("")){
            this.insert();
            
        } else {
            this.update();
        }
        
        try {
            tabelaAlunos.setResult(select());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButtonSalvarFormAlunoActionPerformed

    private void jButtonExcluirFormAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirFormAlunoActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que você deseja excluir esse registro?",
                "Exclusão de Cadastro",
                JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            this.delete(Integer.valueOf(jTextFieldIdAluno.getText()));
            this.limparCampos();
            
            try {
                tabelaAlunos.setResult(select());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            jButtonExcluirFormAluno.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonExcluirFormAlunoActionPerformed

    private void jButtonPesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAlunoActionPerformed
        try {
            tabelaAlunos.setResult(this.search(jTextFieldPesquisarAluno.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(FormDialogAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonPesquisarAlunoActionPerformed

    private void jTableListagemAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListagemAlunosMouseClicked
        jTextFieldIdAluno.setText(jTableListagemAlunos.getValueAt(jTableListagemAlunos.getSelectedRow(), 0).toString());
        jTextFieldNomeAluno.setText(jTableListagemAlunos.getValueAt(jTableListagemAlunos.getSelectedRow(), 1).toString());
        jTextFieldNomeCurso.setText(jTableListagemAlunos.getValueAt(jTableListagemAlunos.getSelectedRow(), 2).toString());
        jTextFieldNumMatricula.setText(jTableListagemAlunos.getValueAt(jTableListagemAlunos.getSelectedRow(), 3).toString());
        jFormattedTextFieldCPFAluno.setText(jTableListagemAlunos.getValueAt(jTableListagemAlunos.getSelectedRow(), 4).toString());
        jSpinnerPeriodoCurso.setValue(Integer.valueOf(jTableListagemAlunos.getValueAt(jTableListagemAlunos.getSelectedRow(), 5).toString()));
        jTextFieldEmailAluno.setText(jTableListagemAlunos.getValueAt(jTableListagemAlunos.getSelectedRow(), 6).toString());
        
        jButtonExcluirFormAluno.setEnabled(true);
        
    }//GEN-LAST:event_jTableListagemAlunosMouseClicked

    private void jTextFieldPesquisarAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarAlunoKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                tabelaAlunos.setResult(this.search(jTextFieldPesquisarAluno.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(FormDialogAluno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextFieldPesquisarAlunoKeyReleased
    
    public ResultSet search(String pesquisa){
        ModelAluno mod = new ModelAluno(pesquisa);
        ControllerAluno control = new ControllerAluno(new ConexaoBD(), mod);
        return control.searchAlunoBD();
    }
    
    public void insert(){
       this.validar.verificarCampoVazio(jTextFieldNomeAluno.getText(), "Campo Nome");
       this.validar.verificarCampoVazio(jTextFieldNomeCurso.getText(), "Campo Curso");
       this.validar.verificarCampoVazio(jTextFieldNumMatricula.getText(), "Campo Matricula");
       if(this.validar.tirarMascaraCPF(jFormattedTextFieldCPFAluno.getText()).contains(" ")){
        validar.autenticarCampos("Campo CPF");
       }
       this.validar.verificarCampoVazio(jTextFieldEmailAluno.getText(), "Campo Email");
        
       ModelAluno mod = new ModelAluno(jTextFieldNomeAluno.getText(), jTextFieldNomeCurso.getText(), jTextFieldNumMatricula.getText(), jFormattedTextFieldCPFAluno.getText(), Integer.parseInt(jSpinnerPeriodoCurso.getValue().toString()), jTextFieldEmailAluno.getText());
       ControllerAluno control = new ControllerAluno(new ConexaoBD(), mod);
       
        if(this.autenticarValoresForm(mod)){
            control.salvarAlunoBD();
            this.limparCampos();
        } else {
            System.out.println("Erro...");
        }
    }
    
    public ResultSet select(){
        ControllerAluno control = new ControllerAluno(new ConexaoBD());
        return control.selectTabelaAlunoBD();
    }
    
    public void update(){
       this.validar.verificarCampoVazio(jTextFieldNomeAluno.getText(), "Campo Nome");
       this.validar.verificarCampoVazio(jTextFieldNomeCurso.getText(), "Campo Curso");
       this.validar.verificarCampoVazio(jTextFieldNumMatricula.getText(), "Campo Matricula");
       if(this.validar.tirarMascaraCPF(jFormattedTextFieldCPFAluno.getText()).contains(" ")){
        validar.autenticarCampos("Campo CPF");
       }
       this.validar.verificarCampoVazio(jTextFieldEmailAluno.getText(), "Campo Email");
        
       ModelAluno mod = new ModelAluno(jTextFieldNomeAluno.getText(), jTextFieldNomeCurso.getText(), jTextFieldNumMatricula.getText(), jFormattedTextFieldCPFAluno.getText(), Integer.parseInt(jSpinnerPeriodoCurso.getValue().toString()), jTextFieldEmailAluno.getText(), Integer.valueOf(jTextFieldIdAluno.getText()));
       ControllerAluno control = new ControllerAluno(new ConexaoBD(), mod);
       
       if(this.autenticarValoresForm(mod)){
            control.atualizarAlunoBD();
            this.limparCampos();
            this.jButtonExcluirFormAluno.setEnabled(false);
        } else {
            System.out.println("Erro...");
        }
    }
    
    public void delete(int id){
        ModelAluno mod = new ModelAluno(id);
        ControllerAluno control = new ControllerAluno(new ConexaoBD(), mod);
        control.deletarAlunoBD();
        
    }
 
    
    public Boolean autenticarValoresForm(ModelAluno mod){
        int errosForm = 0;
        
        if(validar.autenticarNomes(mod.getNome(), "Campo de Nome")){
            errosForm++;
        }
        
        if(validar.autenticarNomes(mod.getCurso(), "Campo de Curso")){
            errosForm++;
        }
        
        if(validar.autenticarValoresInteiros(mod.getMatricula(), "Campo de Matricula")){
            errosForm++;
        }
        
        if(validar.validarCPF(validar.tirarMascaraCPF(mod.getCPFAluno()))){
            errosForm++;
        }
        
        if(validar.autenticarEmail(mod.getEmailAluno())){
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
            java.util.logging.Logger.getLogger(FormDialogAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDialogAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDialogAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDialogAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormDialogAluno dialog = new FormDialogAluno(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonExcluirFormAluno;
    private javax.swing.JButton jButtonNovoFormAluno;
    private javax.swing.JButton jButtonPesquisarAluno;
    private javax.swing.JButton jButtonSalvarFormAluno;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPFAluno;
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
    private javax.swing.JSpinner jSpinnerPeriodoCurso;
    private javax.swing.JTable jTableListagemAlunos;
    private javax.swing.JTextField jTextFieldEmailAluno;
    private javax.swing.JTextField jTextFieldIdAluno;
    private javax.swing.JTextField jTextFieldNomeAluno;
    private javax.swing.JTextField jTextFieldNomeCurso;
    private javax.swing.JTextField jTextFieldNumMatricula;
    private javax.swing.JTextField jTextFieldPesquisarAluno;
    // End of variables declaration//GEN-END:variables
}
