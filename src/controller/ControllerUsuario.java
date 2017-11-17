/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import modelConection.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelUsuario;

/**
 *
 * @author Neto
 */
public class ControllerUsuario {
    
    private ConexaoBD conex;
    private ModelUsuario mod;
    
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
    
    //Falta outros métodos do CRUD de usuário.
    
}

