/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelLivro;
import modelConection.ConexaoBD;

/**
 *
 * @author Neto
 */
public class ControllerLivro {
    
    private ConexaoBD conex;
    private ModelLivro mod;
    
    public ControllerLivro(ConexaoBD conex, ModelLivro mod){
        this.conex = conex;
        this.mod = mod;
    }
    
    public ControllerLivro(ConexaoBD conex){
        this.conex = conex;
        this.mod = mod;
    }
    
    public void SalvarLivroBD(){
        try {
            this.conex.setPs(conex.getConexaoBD().prepareStatement("INSERT INTO cadastro_livro (nome_livro, autor, editora, lancamento_livro, volume, quantidade_estoque) VALUES (?, ?, ?, ?, ?, ?)"));
            this.conex.getPs().setString(1, mod.getNomeLivro());
            this.conex.getPs().setString(2, mod.getAutor());
            this.conex.getPs().setString(3, mod.getEditora());
            this.conex.getPs().setDate(4, new java.sql.Date(mod.getDate().getTime()));
            this.conex.getPs().setInt(5, mod.getVolume());
            this.conex.getPs().setInt(6, mod.getQuantidadeEstoque());
            
            this.conex.getPs().executeUpdate();
            this.conex.getPs().close();
            this.conex.desconecta();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar dados " + e);
            this.conex.desconecta();
        }
    }
    
    public ResultSet selectTabelaLivroBD(){
        try {
            this.conex.setStmt(this.conex.getConexaoBD().createStatement());
            this.conex.setRs(this.conex.getStmt().executeQuery("SELECT * FROM cadastro_livro"));
            return this.conex.getRs();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados " + e);
        }
        
        return null;
    }
    
    public ResultSet searchLivroBD(){
         try {
            
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("SELECT * FROM cadastro_livro WHERE id_livro like ? or nome_livro like ? or autor like ? or editora like ? or volume like ? or quantidade_estoque like ?"));
            this.conex.getPs().setString(1, "%"+ this.mod.getPesquisaLivro() +"%");
            this.conex.getPs().setString(2, "%"+ this.mod.getPesquisaLivro() +"%");
            this.conex.getPs().setString(3, "%"+ this.mod.getPesquisaLivro() +"%");
            this.conex.getPs().setString(4, "%"+ this.mod.getPesquisaLivro() +"%");
            this.conex.getPs().setString(5, "%"+ this.mod.getPesquisaLivro() +"%");
            this.conex.getPs().setString(6, "%"+ this.mod.getPesquisaLivro() +"%");
            this.conex.setRs(this.conex.getPs().executeQuery());
            
         } catch (SQLException ex) {
             Logger.getLogger(ControllerAluno.class.getName()).log(Level.SEVERE, null, ex);
         }
         return this.conex.getRs();
         
    }
    
    public void atualizarLivroBD(){
         try {
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("UPDATE cadastro_livro SET nome_livro=?, autor=?, editora=?, lancamento_livro=?, volume=?, quantidade_estoque=? WHERE id_livro = ?"));
            this.conex.getPs().setString(1, mod.getNomeLivro());
            this.conex.getPs().setString(2, mod.getAutor());
            this.conex.getPs().setString(3, mod.getEditora());
            this.conex.getPs().setString(4, mod.getDataLancLivro());
            this.conex.getPs().setInt(5, mod.getVolume());
            this.conex.getPs().setInt(6, mod.getQuantidadeEstoque());
            this.conex.getPs().setInt(7, mod.getIdLivro());
            
            this.conex.getPs().executeUpdate();
            this.conex.getPs().close();
            this.conex.desconecta();
            JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso!");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados " + ex);
            this.conex.desconecta();
         }
    }
    
    public void deletarLivroBD(){
         try {
             this.conex.setStmt(this.conex.getConexaoBD().createStatement());
             this.conex.getStmt().executeUpdate("DELETE FROM cadastro_livro WHERE id_livro = " + this.mod.getIdLivro() + "");
             JOptionPane.showMessageDialog(null, "Dado Excluído com Sucesso!");
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Deletar dados " + ex);
         }
        
    }
    
}
