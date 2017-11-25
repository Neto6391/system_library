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
            this.conex.setPs(conex.getConexaoBD().prepareStatement("INSERT INTO cadastro_locacao (periodo_locacao, loc_aluno, loc_livro) VALUES (?, ?, ?)"));
            this.conex.getPs().setDate(1, new java.sql.Date(mod.getPeriodoLoc().getTime()));
            this.conex.getPs().setInt(2, mod.getCodigoAluno());
            this.conex.getPs().setInt(3, mod.getCodigoLivro());
            
            
            this.conex.getPs().executeUpdate();
            this.conex.getPs().close();
            this.conex.desconecta();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar dados " + e);
            this.conex.desconecta();
        }
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
            this.conex.setRs(this.conex.getStmt().executeQuery("SELECT * FROM cadastro_livro"));
            
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
        
}

