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
    private int id_aluno;
    private int id_livro;
    private Date pesquisaData;
    
    public ModelLocacao(){
        
    }
    
    public ModelLocacao(String periodoLocacao, int codigoAluno, int codigoLivro, int id_aluno, int id_livro){
        this.periodoLocacao = periodoLocacao;
        this.codigoAluno = codigoAluno;
        this.codigoLivro = codigoLivro;
        this.id_aluno = id_aluno;
        this.id_livro = id_livro;
        this.setPeriodoLoc(this.dataInversa(periodoLocacao));
    }
    
    public ModelLocacao(int idLocacao, String periodoLocacao, int codigoAluno, int codigoLivro, int id_aluno, int id_livro){
        this.idLocacao = idLocacao;
        this.periodoLocacao = periodoLocacao;
        this.codigoAluno = codigoAluno;
        this.codigoLivro = codigoLivro;
        this.id_aluno = id_aluno;
        this.id_livro = id_livro;
        this.setPeriodoLoc(this.dataInversa(periodoLocacao));
    }
    
    public ModelLocacao(int idLocacao){
        this.idLocacao = idLocacao;
    }
    
    public ModelLocacao(String pesquisa){
        this.setPesquisaData(this.dataInversa(pesquisa));
         
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

    
    public Date getPesquisaData() {
        return pesquisaData;
    }

    public void setPesquisaData(String pesquisa) {
        //this.pesquisa = pesquisa;
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        try {
            this.pesquisaData = df.parse(pesquisa);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
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
        System.out.println(dataArray.length + " " + data);
        return dataArray[2] +"/" + dataArray[1] + "/" + dataArray[0];
    }
    
    

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    
    
    
    
    
}
