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
//essa classe herda da classe Empregado e implementa o método ValorAPagar de 
//forma unica
public class Assalariado extends Empregado implements Pagavel {
    
    //construtor passado como paramentro os atributos de empregado
    public Assalariado(String nome, String sobrenome, int numIdent){
        super();
    }
    
    //método getValorAPagar implementado de forma unica
    @Override
    public double getValorAPagar(int dia, int hora){
        double total = 0;
        if(hora > 40){
            total = hora * ControlePagamento.HORA + ControlePagamento.SALARIO;
        }
        return total;
    }
    
}
