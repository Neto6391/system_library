/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelAluno;
import model.ModelLivro;
import model.ModelLocacao;
import modelConection.ConexaoBD;

/**
 *
 * @author Neto
 */
public class ControllerLocacao {
    
    ConexaoBD conex;
    ModelLocacao mod; 
    
    public ControllerLocacao(ConexaoBD conex, ModelLocacao mod){
        this.conex = conex;
        this.mod = mod;
    }
    
    public ControllerLocacao(ConexaoBD conex){
        this.conex = conex;
    }
    
    
    public void salvarLocacaoBD(){
        
        try {
            this.conex.setPs(conex.getConexaoBD().prepareStatement("INSERT INTO cadastro_locacao (periodo_locacao, loc_aluno, loc_livro, id_select_aluno, id_select_livro) VALUES (?, ?, ?, ?, ?)"));
            this.conex.getPs().setDate(1, new java.sql.Date(mod.getPeriodoLoc().getTime()));
            this.conex.getPs().setInt(2, mod.getCodigoAluno());
            this.conex.getPs().setInt(3, mod.getCodigoLivro());
            this.conex.getPs().setInt(4, mod.getId_aluno());
            this.conex.getPs().setInt(5, mod.getId_livro());
           
            this.conex.getPs().executeUpdate();
            this.conex.getPs().close();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
            this.atualizarEstoqueLivro();
            this.conex.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar dados " + e);
            
            this.conex.desconecta();
        }
    }
    
    
    public ResultSet searchLocacaoBD(){
        try {
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("SELECT * FROM cadastro_locacao WHERE periodo_locacao like ? "));
            this.conex.getPs().setString(1, "%"+ new java.sql.Date(mod.getPesquisaData().getTime()) +"%");
             
             this.conex.setRs(this.conex.getPs().executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(ControllerLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.conex.getRs();
    }
    
    
    public ResultSet selectAluno(javax.swing.JComboBox select){
        try {
            this.conex.setStmt(this.conex.getConexaoBD().createStatement());
            this.conex.setRs(this.conex.getStmt().executeQuery("SELECT * FROM cadastro_aluno"));
            
            while(this.conex.getRs().next()){
                ModelAluno mod = new ModelAluno();
                mod.setId_aluno(this.conex.getRs().getInt("id_aluno"));
                mod.setNome(this.conex.getRs().getString("nome_aluno"));
                mod.setCurso(this.conex.getRs().getString("curso"));
                mod.setMatricula(this.conex.getRs().getString("matricula"));
                mod.setPeriodoCurso(this.conex.getRs().getInt("periodo"));
                select.addItem(mod);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ControllerLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.conex.getRs();
    }
    
    
    public ResultSet selectLivro(javax.swing.JComboBox select){
        try {
            this.conex.setStmt(this.conex.getConexaoBD().createStatement());
            this.conex.setRs(this.conex.getStmt().executeQuery("SELECT * FROM cadastro_livro WHERE quantidade_estoque > 0"));
            
            while(this.conex.getRs().next()){
                ModelLivro mod = new ModelLivro();
                mod.setIdLivro(this.conex.getRs().getInt("id_livro"));
                mod.setNomeLivro(this.conex.getRs().getString("nome_livro"));
                mod.setAutor(this.conex.getRs().getString("autor"));
                mod.setEditora(this.conex.getRs().getString("editora"));
                mod.setVolume(this.conex.getRs().getInt("volume"));
                mod.setQuantidadeEstoque(this.conex.getRs().getInt("quantidade_estoque"));
                select.addItem(mod);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ControllerLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.conex.getRs();
    
    }
    
    
    public ResultSet selectTabelaLocacaoBD() {
        try {
            this.conex.setStmt(this.conex.getConexaoBD().createStatement());
            this.conex.setRs(this.conex.getStmt().executeQuery("SELECT * FROM cadastro_locacao"));
            return this.conex.getRs();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados " + e);
        }
        
        return null;
    }
    
    //UPDATE cadastro_locacao SET periodo_locacao = '2017-11-24' WHERE id_locacao = 1
    public void atualizarLocacaoBD(){
        try {
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("UPDATE cadastro_locacao SET periodo_locacao=?, loc_aluno=?, loc_livro=?, id_select_aluno=?, id_select_livro=? WHERE id_locacao = ?"));
            this.conex.getPs().setDate(1, new java.sql.Date(mod.getPeriodoLoc().getTime()));
            this.conex.getPs().setInt(2, mod.getCodigoAluno());
            this.conex.getPs().setInt(3, mod.getCodigoLivro());
            this.conex.getPs().setInt(4, mod.getId_aluno());
            this.conex.getPs().setInt(5, mod.getId_livro());
            this.conex.getPs().setInt(6, mod.getIdLocacao());
            
            
            this.conex.getPs().executeUpdate();
            this.conex.getPs().close();
            this.conex.desconecta();
            JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados " + ex);
            this.conex.desconecta();
        }
    }
    
    public void deletarLocacaoBD(){
        try {
            this.conex.setStmt(this.conex.getConexaoBD().createStatement());
            this.conex.getStmt().executeUpdate("DELETE FROM cadastro_locacao WHERE id_locacao = " + this.mod.getIdLocacao() + "");
            JOptionPane.showMessageDialog(null, "Dado Excluído com Sucesso!");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar dados " + ex);
         }
    }
    
    
    
    
    
    
    public void atualizarEstoqueLivro(){
        try {
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("UPDATE cadastro_livro SET quantidade_estoque = quantidade_estoque - ? WHERE id_livro = ?"));
            this.conex.getPs().setInt(1, 1);
            this.conex.getPs().setInt(2, mod.getCodigoLivro());
            
            
            
            this.conex.getPs().executeUpdate();
            this.conex.getPs().close();
            this.conex.desconecta();
            JOptionPane.showMessageDialog(null, "Estoque Atualizado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Estoque " + ex);
            this.conex.desconecta();
        }
    }
    
        
}

