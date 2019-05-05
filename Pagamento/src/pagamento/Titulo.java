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
//a classe Título herda os atributos de Conta e tem o método valorAPagar
//implementado de forma unica
public class Titulo extends Conta {
    //construtor dessa classe herdando os atributos da classe conta
    public Titulo(){
        super();
    }
    
    //método getValorAPagar para essa classe
    @Override
    public double getValorAPagar(int dia, int hora){
        if(dia > this.dia){
            valor = valor + 0.10 * valor; 
        }
        return valor;
    }
}
