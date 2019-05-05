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
public class Terceirizado extends Empregado {
    
    //construtor passado como paramentro os atributos de empregado
    public Terceirizado(String nome, String sobrenome, int numIdent){
        super();
    }

    //método getValorAPagar implementado de forma unica
    @Override
    public double getValorAPagar(int dia, int hora) {
        double total;
            total = ControlePagamento.SALARIO * hora;
        return total;
    }
    
}
