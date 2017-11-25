/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Neto
 */
public class ModelLocacao {
    private int idLocacao;
    private String periodoLocacao;
    private Date periodoLoc;
    private int codigoAluno;
    private int codigoLivro;
    private String pesquisa;
    
    
    public ModelLocacao(){
        
    }
    
    public ModelLocacao(String periodoLocacao, int codigoAluno, int codigoLivro){
        this.periodoLocacao = periodoLocacao;
        this.codigoAluno = codigoAluno;
        this.codigoLivro = codigoLivro;
        this.setPeriodoLoc(this.dataInversa(periodoLocacao));
    }
    
    public ModelLocacao(int idLocacao, String periodoLocacao, int codigoAluno, int codigoLivro, String dataLocacao){
        this.idLocacao = idLocacao;
        this.periodoLocacao = periodoLocacao;
        this.codigoAluno = codigoAluno;
        this.codigoLivro = codigoLivro;
        this.setPeriodoLoc(this.dataInversa(periodoLocacao));
    }
    
    public ModelLocacao(int idLocacao){
        this.idLocacao = idLocacao;
    }
    
    public ModelLocacao(String pesquisa){
        this.pesquisa = pesquisa;
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public String getPeriodoLocacao() {
        return periodoLocacao;
    }

    public void setPeriodoLocacao(String periodoLocacao) {
        this.periodoLocacao = periodoLocacao;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    
    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    private void setPeriodoLoc(String data){
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        try {
            this.periodoLoc = df.parse(data);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
    
    public Date getPeriodoLoc(){
        return this.periodoLoc;
    }
    
    public String dataInversa(String data){
        String dataArray[] = data.split("/");
        return dataArray[2] +"/" + dataArray[1] + "/" + dataArray[0];
    }
    
    
    
    
    
}
