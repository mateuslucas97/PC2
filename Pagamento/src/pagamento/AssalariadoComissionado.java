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
//essa classe herda da classe Empregado e da classe Comissionado e implementa o método ValorAPagar de 
//forma unica
public class AssalariadoComissionado extends Terceirizado implements Pagavel {
    
    //construtor passado como paramentro os atributos de empregado
    public AssalariadoComissionado(String nome, String sobrenome, int numIdent){
        super(nome, sobrenome, numIdent);
    }
    
    //método getValorAPagar implementado de forma unica
    public double getValorAPagar(){
        double total;
        total = ControlePagamento.SALARIO + ControlePagamento.SALARIO * 0.6;
        return total;
    }
    
}
