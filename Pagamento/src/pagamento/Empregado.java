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
//essa classe abstrata contém atributos que só serão herdados para
//Assalariado, Comissionado, Terceirizado e AssalariadoComissionado
public abstract class Empregado implements Pagavel {
    protected String nome;
    protected String sobrtenome;
    protected int numIdent;
    
    public Empregado(){
        this.nome = "";
        this.sobrtenome = "";
        this.numIdent = 0;
    }
    
}
