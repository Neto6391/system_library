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
public class ModelLivro {
    private int idLivro;
    private String nomeLivro;
    private String autor;
    private String editora;
    private String dataLancLivro;
    private Date date;
    private int volume;
    private int quantidadeEstoque;
    private String pesquisaLivro;

    
    public ModelLivro(){
        
    }
     
    public ModelLivro(String nomeLivro, String autor, String editora, String dataLancLivro,int volume, int quantidadeEstoque) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.editora = editora;
        this.setDate(this.dataInversa(dataLancLivro));
        this.setdataLancLivro(this.dataInversa(dataLancLivro));
        this.volume = volume;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public ModelLivro(int idLivro, String nomeLivro, String autor, String editora,String dataLancLivro , int volume, int quantidadeEstoque) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.editora = editora;
        this.setDate(this.dataInversa(dataLancLivro));
        this.setdataLancLivro(this.dataInversa(dataLancLivro));
        this.volume = volume;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public ModelLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public ModelLivro(String pesquisaLivro) {
        this.pesquisaLivro = pesquisaLivro;
    }
    
    public void setdataLancLivro(String data){
        this.dataLancLivro = data;
        
    }
    
    public String getDataLancLivro(){
        return this.dataLancLivro;
    }
    
    public String getPesquisaLivro() {
        return pesquisaLivro;
    }

    public void setPesquisaLivro(String pesquisaLivro) {
        this.pesquisaLivro = pesquisaLivro;
    }
    
    
    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    private String dataInversa(String data){
        String dataArray[] = data.split("/");
        return dataArray[2] +"/" + dataArray[1] + "/" + dataArray[0];
    }
    
    public String dataNormal(){
        String dataArray[] = this.getDataLancLivro().split("/");
        return dataArray[0] + "/" + dataArray[1] + "/" + dataArray[2];
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String data) {
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        try {
            this.date = df.parse(data);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    
    @Override
    public String toString() {
        return this.getIdLivro() + " - " + this.nomeLivro + " - " + this.autor + " - " + this.editora + " - " + this.volume + " - " + this.quantidadeEstoque;
    }
    
}
