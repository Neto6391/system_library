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
import model.ModelUsuario;

/**
 *
 * @author Neto
 */
public class ControllerUsuario {
    
    private ConexaoBD conex;
    private ModelUsuario mod;
    
    public ControllerUsuario(){
    }
    
    public ControllerUsuario(ConexaoBD conex, ModelUsuario mod){
        this.conex = conex;
        this.mod = mod;
    }
    
    public ControllerUsuario(ConexaoBD conex){
        this.conex = conex;
        this.mod = mod;
    }
    
    public Boolean autenticarUsuario(ConexaoBD conex, ModelUsuario mod){
       
        try{
            int qtdeRegistros = 0;
      
            conex.setPs(conex.getConexaoBD().prepareStatement("select * from cadastro_autenticacao where nome_usuario=? and senha_usuario=md5(?)"));
            conex.getPs().setString(1, mod.getNome());
            conex.getPs().setString(2, mod.getSenha());
            
            conex.setRs(conex.getPs().executeQuery());
            while(conex.getRs().next()){
                qtdeRegistros++;
            }
            
            if(qtdeRegistros == 1){
              conex.getPs().close();
              conex.desconecta();
              return true;  
            } else {
                conex.getPs().close();
                conex.desconecta();
                return false;
            }
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de conexao com o BD:\n"+ ex);
            conex.desconecta();
            return false;
        }
    }
    
    
    public void salvarUsuarioBD(){
        
        try {
            this.conex.setPs(conex.getConexaoBD().prepareStatement("INSERT INTO cadastro_autenticacao (nome_usuario, senha_usuario, matricula, cpf_usuario) VALUES (?, md5(?), ?, ?)"));
            this.conex.getPs().setString(1, mod.getNome());
            this.conex.getPs().setString(2, mod.getSenha());
            this.conex.getPs().setString(3, mod.getMatricula());
            this.conex.getPs().setString(4, mod.getCpf_cadastro());
            
            this.conex.getPs().executeUpdate();
            this.conex.getPs().close();
            this.conex.desconecta();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar dados " + e);
            this.conex.desconecta();
        }
    }
    
    public ResultSet selectTabelaUsuarioBD(){
        try {
            this.conex.setStmt(this.conex.getConexaoBD().createStatement());
            this.conex.setRs(this.conex.getStmt().executeQuery("SELECT * FROM cadastro_autenticacao"));
            return this.conex.getRs();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados " + e);
        }
        
        return null;
    }
    
    public ResultSet searchUsuarioBD(){
         try {
            
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("SELECT * FROM cadastro_autenticacao WHERE id_autenticacao like ? or nome_usuario like ? or senha_usuario like ? or matricula like ? or cpf_usuario like ?"));
            this.conex.getPs().setString(1, "%"+ this.mod.getPesquisaUsuario() +"%");
            this.conex.getPs().setString(2, "%"+ this.mod.getPesquisaUsuario() +"%");
            this.conex.getPs().setString(3, "%"+ this.mod.getPesquisaUsuario() +"%");
            this.conex.getPs().setString(4, "%"+ this.mod.getPesquisaUsuario() +"%");
            this.conex.getPs().setString(5, "%"+ this.mod.getPesquisaUsuario() +"%");
            
            this.conex.setRs(this.conex.getPs().executeQuery());
            
         } catch (SQLException ex) {
             Logger.getLogger(ControllerAluno.class.getName()).log(Level.SEVERE, null, ex);
         }
         return this.conex.getRs();
         
    }
    
    public Boolean isAdmin(int id){
        
        try {
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("SELECT nome_usuario FROM cadastro_autenticacao WHERE id_autenticacao = ? AND nome_usuario = ?"));
            
            this.conex.getPs().setInt(1, id);
            this.conex.getPs().setString(2, "admin");
            this.conex.setRs(this.conex.getPs().executeQuery());
            
            if(this.conex.getRs().first()){
                return true;
            } else {
                return false;
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public void atualizarUsuarioBD(){
         try {
            this.conex.setPs(this.conex.getConexaoBD().prepareStatement("UPDATE cadastro_autenticacao SET nome_usuario=?, senha_usuario=?, matricula=?, cpf_usuario=? WHERE id_autenticacao = ?"));
            this.conex.getPs().setString(1, mod.getNome());
            this.conex.getPs().setString(2, "md5(" + mod.getSenha() + ")");
            this.conex.getPs().setString(3, mod.getMatricula());
            this.conex.getPs().setString(4, mod.getCpf_cadastro());
            this.conex.getPs().setInt(5, mod.getIdUsuario());
            
            
            this.conex.getPs().executeUpdate();
            this.conex.getPs().close();
            this.conex.desconecta();
            JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso!");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados " + ex);
            this.conex.desconecta();
         }
    }
    
    public void deletarUsuarioBD(){
        if(this.isAdmin(this.mod.getIdUsuario())){
            JOptionPane.showMessageDialog(null, "Proibido Deletar Admin! ");
        } else {
            try {
                this.conex.setStmt(this.conex.getConexaoBD().createStatement());
                this.conex.getStmt().executeUpdate("DELETE FROM cadastro_autenticacao WHERE id_autenticacao = " + this.mod.getIdUsuario() + "");
                JOptionPane.showMessageDialog(null, "Dado Excluído com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Deletar dados " + ex);
            }
        }
        
        
    }
    
    
    
    
    
}

