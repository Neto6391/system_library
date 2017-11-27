/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Neto
 */
public class Validar {
    
    
    public void verificarCampoVazio(String objetoForm, String tipoCampo){
        if(objetoForm.isEmpty()){
           this.autenticarCampos(tipoCampo); 
        }
    }
    
    
    
    public void autenticarCampos(String tipoCampoForm){
        try{
            throw new NullPointerException("Campo Vazio");
        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, tipoCampoForm+" não pode ser vazio!"); 
        }
    }
    
    public Boolean autenticarNomes(String nome, String tipoForm){
        
        /*Expressão Regular que Inicialmente verifica na string a primeira letra([[A-Za-z]]), se possui uma letra
          Maiscula ou Minuscula se a ocorrência é de uma(+) ou mais vezes através de um agrupamento(dentro de ()) de espaços(\\s)
          iniciando letras maisculas([A-Za-z]) ou minusculas possuindo ocorrência de uma(+) ou mais vezes e por checa se 
          caractere (*)anterior aparece nenhuma ou mais vezes.
        */
        if(nome.matches("[A-Za-z]+(\\s[A-Za-z]+)*")){
            if(nome.length() <= 2){
                JOptionPane.showMessageDialog(null, tipoForm+" tem  que ser maior ou igual a 3 letras");
                return true;
            } else {
                return false;
            }
                
        } else {
            if(!nome.isEmpty()){
               JOptionPane.showMessageDialog(null, tipoForm+" não pode conter números!");
                return true; 
            } else {
                return false;
            }
            
        }
    }
    
    public Boolean autenticarValoresInteiros(String valor, String tipoForm){
        if(!valor.matches("\\d+")){
            if(!valor.equals("")){
                JOptionPane.showMessageDialog(null, tipoForm+" não pode conter letras!");
            }    
            return true;
        } else {
            if(valor.length() < 5){
                JOptionPane.showMessageDialog(null, tipoForm+" tem  que ser maior que 4 números");
                return true;
            }
        }
        return false;
    }
    
    public String tirarMascaraCPF(String cpfMascarado){
        String cpfSemMascara = "";
        for(int i = 0; i < cpfMascarado.length(); i++){
            if(Character.toString(cpfMascarado.charAt(i)).equals(".") || Character.toString(cpfMascarado.charAt(i)).equals("-")){
                continue;
            }
            cpfSemMascara += Character.toString(cpfMascarado.charAt(i));
        }
        return cpfSemMascara;
    }
    
    
    public String tirarMascaraData(String dataMascarada){
        String dataSemMascara = "";
        for(int i = 0; i < dataMascarada.length(); i++){
            if(Character.toString(dataMascarada.charAt(i)).equals("/")){
                continue;
            }
            dataSemMascara += Character.toString(dataMascarada.charAt(i));
        }
        return dataSemMascara;
    }
    
    
    
    public ArrayList<Integer> calcularDigitoCPF(ArrayList<Integer> lista, int digito){
        int resultado_pesos = 0;
        
        for(int i = 0; i < lista.size(); i++){
            resultado_pesos += lista.get(i) * (digito - i);
        }
        
        if(resultado_pesos % 11 <= 2){
            lista.add(0);
        } else {
            lista.add((11 - (resultado_pesos % 11)));
        }
       
        return lista;
    }
    
    public Boolean validarCPF(String cpf){
        ArrayList<Integer> novo_cpf = new ArrayList<Integer>();
        ArrayList<Integer> cpfOriginal = new ArrayList<Integer>();
        
        if(cpf.length() != 11 || cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999")){
            JOptionPane.showMessageDialog(null, "CPF Inválido!");
            return true;
        }
        
        for(int i = 0; i < cpf.length(); i++){
            cpfOriginal.add(Character.getNumericValue(cpf.charAt(i)));
        }
        
        for(int j = 0; j < (cpf.length()-2); j++){
            novo_cpf.add(Character.getNumericValue(cpf.charAt(j)));
        }
        
        ArrayList<Integer> novoDigitoCPF = calcularDigitoCPF(novo_cpf, 10);
        ArrayList<Integer> novoCPF = calcularDigitoCPF(novoDigitoCPF, 11);
        
        if(cpfOriginal.equals(novoCPF)){
            return false;
        } else {
            if(!cpf.contains(" ")){
                JOptionPane.showMessageDialog(null, "CPF Inválido!");
            }
            return true;
        }
    }
    
    
    public Boolean validarDataLocacao(String data){
        String date[] = data.split("/");
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy/mm/dd");
        df.setLenient(false);
        try{
            Date dataForm = df.parse(data);
            
            if(Integer.valueOf(date[0]) == 2017){
                
                return false;
            }
            //JOptionPane.showMessageDialog(null, "Apenas é permitido Livros lançados a partir da década de 80");
            return true;
        } catch(ParseException e){
            e.printStackTrace();
            return true;
        }
    }
    
    
    
    
    public Boolean validarDataLivro(String data){
        String date[] = data.split("/");
        SimpleDateFormat df = new SimpleDateFormat("yyyy/mm/dd");
        df.setLenient(false);
        try{
            Date dataForm = df.parse(data);
            if(Integer.valueOf(date[0]) >= 1980 && Integer.valueOf(date[0]) < 2017){
                
                return false;
            }
            JOptionPane.showMessageDialog(null, "Apenas é permitido Livros lançados a partir da década de 80");
            return true;
        } catch(ParseException e){
            
            return true;
        }
    }
    
    public Boolean autenticarEmail(String email){
        int resultado = 0;
        if(email.contains("@")){
            resultado++;
        }
        
        if(email.contains(".")){
            resultado++;
        }
        
        if(email.contains(" ")){
            resultado--;
        }
        
        if(resultado == 2){
            return false;
        } else {
            if(!email.equals("")){
                JOptionPane.showMessageDialog(null, "Email Inválido!");
            } 
            
            return true;
        }  
    } 
    
    
    
    public static void main(String[] args) {
        Validar v = new Validar();
        
        boolean t = v.validarDataLocacao("25/11/2017");
        System.out.println(t);
    }
    
    
}
