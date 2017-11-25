/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Neto
 */
public class ModelTabelaUsuarios extends AbstractTableModel{
    private static final String[] colNomes = {
        "Código", "Usuário","Senha", "Matrícula.", "CPF" 
    };
    
    private ArrayList<String[]> colecao;
    
    public ModelTabelaUsuarios(ResultSet rs) throws SQLException {
        setResult( rs );
    }
    
    @Override
    public int getRowCount() {
        return colecao.size();
    }

    @Override
    public int getColumnCount() {
        return colNomes.length;
    }
    
    @Override
    public String getColumnName( int param ){
        return colNomes[param];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] row = colecao.get(rowIndex);
        return row[columnIndex];
    }
    
    public void setResult(ResultSet rs ) throws SQLException{
         
        colecao = new ArrayList<String[]>();
        
        while (rs.next()){
            /* pega os registros necess?rios e os armazena em row */
            String[] row = {
                rs.getString("id_autenticacao"),
                rs.getString("nome_usuario"),
                rs.getString("senha_usuario"),
                rs.getString("matricula"),
                rs.getString("cpf_usuario")
               
                
                
            };
            //adiciona a matriz ResultSets
            colecao.add(row);                    
        }
        
        //notifica JTable das altera??es
        fireTableStructureChanged();
    }
    
    /*m?todo que excluir a linha da tabela*/
    public void deleteRow( int row ){
        colecao.remove(row);
        fireTableRowsDeleted(row, row);
    }
    
}
