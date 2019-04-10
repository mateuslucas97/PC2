/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class Contador {
    private int valor;
    private int limite;
    
    public Contador(int limite){
        valor = 0;
        this.limite = limite;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getLimite(){
        return this.limite = limite;
    }
    
    public void setLimite(int limite){
        this.limite = limite;
    }
    
    public void contar(){
        if(getValor() != getLimite()){
            setValor(getValor()+1);
        }
        else
            setValor(0);
    }
    
}
    
    