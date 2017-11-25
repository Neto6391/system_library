/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import modelConection.ConexaoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelAluno;

/**
 *
 * @author Neto
 */
public class ControllerAluno {
    
    private ConexaoBD conex;
    private ModelAluno mod;
    
    public ControllerAluno(ConexaoBD conex, ModelAluno mod){
        this.conex = conex;
        this.mod = mod;
    }
    
    public ControllerAluno(ConexaoBD conex){
        this.conex = conex;
        this.mod = mod;
    }
    
    public void salvarAlunoBD(){
        try{
           this.conex.setPs(conex.getConexaoBD().prepareStatement("INSERT INTO cadastro_aluno (nome_aluno, curso, matricula, cpf_aluno, periodo, email_aluno) VALUES (?, ?, ?, ?,?, ?)"));
           this.conex.getPs().setString(1, this.mod.getNome());
           this.conex.getPs().setString(2, this.mod.getCurso());
           this.conex.getPs().setString(3, this.mod.getMatricula());
           this.conex.getPs().setString(4, this.mod.getCPFAluno());
           this.conex.getPs().setInt(5, this.mod.getPeriodoCurso());
           this.conex.getPs().setString(6, this.mod.getEmailAluno());
           
           this.conex.getPs().executeUpdate();
           this.conex.getPs().close();
           this.conex.desconecta();
           JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao enviar dados " + e);
            this.conex.desconecta();
        }
    }
    
    public ResultSet selectTabelaAlunoBD(){
        try {
            this.conex.setStmt(this.conex.getConexaoBD().createStatement());
            this.conex.setRs(this.conex.getStmt().executeQuery("SELECT * FROM cadastro_aluno"));
            return this.conex.getRs();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados " + e);
        }
        
        return null;
    }
    
    public ResultSet searchAlunoBD(){
         try {
            
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("SELECT * FROM cadastro_aluno WHERE id_aluno like ? or nome_aluno like ? or curso like ? or matricula like ? or cpf_aluno like ? or periodo like ? or email_aluno like ?"));
            this.conex.getPs().setString(1, "%"+ this.mod.getPesquisa() +"%");
            this.conex.getPs().setString(2, "%"+ this.mod.getPesquisa() +"%");
            this.conex.getPs().setString(3, "%"+ this.mod.getPesquisa() +"%");
            this.conex.getPs().setString(4, "%"+ this.mod.getPesquisa() +"%");
            this.conex.getPs().setString(5, "%"+ this.mod.getPesquisa() +"%");
            this.conex.getPs().setString(6, "%"+ this.mod.getPesquisa() +"%");
            this.conex.getPs().setString(7, "%"+ this.mod.getPesquisa() +"%");
            this.conex.setRs(this.conex.getPs().executeQuery());
            
         } catch (SQLException ex) {
             Logger.getLogger(ControllerAluno.class.getName()).log(Level.SEVERE, null, ex);
         }
         return this.conex.getRs();
         
    }
    
    public void atualizarAlunoBD(){
         try {
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("UPDATE cadastro_aluno SET nome_aluno=?, curso=?, matricula=?, cpf_aluno=?, periodo=?, email_aluno=? WHERE id_aluno = ?"));
            this.conex.getPs().setString(1, this.mod.getNome());
            this.conex.getPs().setString(2, this.mod.getCurso());
            this.conex.getPs().setString(3, this.mod.getMatricula());
            this.conex.getPs().setString(4, this.mod.getCPFAluno());
            this.conex.getPs().setInt(5, this.mod.getPeriodoCurso());
            this.conex.getPs().setString(6, this.mod.getEmailAluno());
            this.conex.getPs().setInt(7, this.mod.getId_aluno());
            
            this.conex.getPs().executeUpdate();
            this.conex.getPs().close();
            this.conex.desconecta();
            JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso!");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados " + ex);
            this.conex.desconecta();
         }
    }
    
    public void deletarAlunoBD(){
         try {
             this.conex.setStmt(this.conex.getConexaoBD().createStatement());
             this.conex.getStmt().executeUpdate("DELETE FROM cadastro_aluno WHERE id_aluno = " + this.mod.getId_aluno() + "");
             JOptionPane.showMessageDialog(null, "Dado Excluído com Sucesso!");
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Deletar dados " + ex);
         }
        
    }
    
}
