/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Neto
 */
public class ModelUsuario {
    private String nome;
    private String senha;
    private String matricula;
    private String cpf_cadastro;

    //Model Login
    public ModelUsuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    
    //Model
    public ModelUsuario(String nome, String senha, String matricula, String cpf_cadastro){
        this.nome = nome;
        this.senha = senha;
        this.matricula = matricula;
        this.cpf_cadastro = cpf_cadastro;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf_cadastro() {
        return cpf_cadastro;
    }

    public void setCpf_cadastro(String cpf_cadastro) {
        this.cpf_cadastro = cpf_cadastro;
    }
    
    //Falta Atributos para o finalizar o CRUD.
    
}
