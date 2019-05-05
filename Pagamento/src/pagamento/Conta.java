/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

/**
 *
 * @author mateus
 */

//essa é uma classe abstrata que contém atributos que só serão herdados para 
//Título e Concessionária 
public abstract class Conta implements Pagavel {
    protected int dia;
    protected int mes;
    protected double valor;
    
    public Conta(){
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }
    
}
