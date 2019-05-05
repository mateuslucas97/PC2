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
//método principal para testar a funcionalidade das outras classes
public class SistemaPagamentoTeste {
    public static void main(String[] args) {
        //criação dos objetos
        Assalariado assalariado = new Assalariado("Jose","Oi",5); //nome, sobrenome, numero indentificaçao
        Comissionado comissionado = new Comissionado("Maria","Oi", 7);
        Terceirizado terceirizado = new Terceirizado("Carlos","oi",10);
        AssalariadoComissionado assalariadocomissionado = new AssalariadoComissionado("Pedro","Oi",15);
        
        //chamada de métodos para cada objeto
        assalariado.getValorAPagar(05, 30);
        comissionado.getValorAPagar(10, 40);
        terceirizado.getValorAPagar(15, 20);
        assalariadocomissionado.getValorAPagar();
    }
    
}
