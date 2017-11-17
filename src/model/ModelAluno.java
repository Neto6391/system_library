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
public class ModelAluno {
    private int id_aluno;
    private String nome;
    private String curso;
    private String matricula;
    private String CPFAluno;
    private int periodoCurso;
    private String emailAluno;
    private String dataCadastro;
    private String pesquisa;

    public ModelAluno(String nome, String curso, String matricula, String CPFAluno, int periodoCurso, String emailAluno) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.CPFAluno = CPFAluno;
        this.periodoCurso = periodoCurso;
        this.emailAluno = emailAluno;
    }
    
    public ModelAluno(String nome, String curso, String matricula, String CPFAluno, int periodoCurso, String emailAluno, int id) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.CPFAluno = CPFAluno;
        this.periodoCurso = periodoCurso;
        this.emailAluno = emailAluno;
        this.id_aluno = id;
    }
    
    public ModelAluno(int id){
        this.id_aluno = id;
    }
    
    public ModelAluno(String pesquisa){
        this.pesquisa = pesquisa;
    }
    
    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPFAluno() {
        return CPFAluno;
    }

    public void setCPFAluno(String CPFAluno) {
        this.CPFAluno = CPFAluno;
    }
    
    public void setPesquisa(String pesquisa){
        this.pesquisa = pesquisa;
    }
    
    public String getPesquisa(){
        return this.pesquisa;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPeriodoCurso() {
        return periodoCurso;
    }

    public void setPeriodoCurso(int periodoCurso) {
        this.periodoCurso = periodoCurso;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }
    
    
    
    
}
