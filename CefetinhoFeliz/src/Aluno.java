/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lsi-hb
 */
public class Aluno {
    private String nome;
    private String dataNascimento;
    
    public Aluno(String n, String data){
        nome = n;
        dataNascimento = data;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setDataNascimento(String d){
        dataNascimento = d;
    }
    
    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public void brincar(){
        
    }
    
}
