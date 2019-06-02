/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class Contato {
    private String nome;
    private String telefone;
    private String email;
    
    public Contato(String nome, String telefone, String email){
        nome = null;
        telefone = null;
        email = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String contatoToString(){
        return this.nome;
    }
    
    public boolean equals(){
        if(nome.equals(this.nome) && telefone.equals(this.telefone) && email.equals(this.email)){
            return true;
        } else{
            return false;
        }
    }
    
}
