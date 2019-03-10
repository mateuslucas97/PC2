/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateu
 */
//atributos da classe aluno
public class Aluno {
    private String nome;
    private String dataNascimento;
    //método construtor da classe
    public Aluno(){
        nome = "";
        dataNascimento = "";
    }
    //inicialização das variáveis com valor zero
    Aluno(String n, String d) {
        nome = n;
        dataNascimento =d;
    }
    //métodos get e set para preencher e exibir os dados
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
    //método adicional que não foi usado nesse projeto
    public void brincar(){
        
    }
}
