package modelConection;

import java.sql.*;

import javax.swing.JOptionPane;
/**
 *
 * @author Neto
 */
public class ConexaoBD {
    
    private PreparedStatement ps; //Faz a pesquisa no BD
    private ResultSet rs; //Armazena o resultado da pesquisa do SQL
    private Statement stmt;
    private Connection con; //Será responsável pra fazer a conexão com o banco de dados.
    
    
    public ConexaoBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/controle_biblioteca", "root", "");
        } catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados:\n"+ e.getMessage());
        }
    }
    
   
    public Connection getConexaoBD(){
        return this.con;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }
    
    
    
    public void desconecta(){
        try{
         con.close();
         //JOptionPane.showMessageDialog(null, "Desconectado com Sucesso!");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com o banco de dados:\n"+ ex.getMessage());
        }
        
    }
    
}
