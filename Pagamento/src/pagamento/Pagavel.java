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
//a interface Pagavel só tem a assinatura do metodo getValorAPagar
public interface Pagavel {
    
    public abstract double getValorAPagar(int dia, int hora);
    
}
