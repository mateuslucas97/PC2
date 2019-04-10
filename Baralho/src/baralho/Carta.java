/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

/**
 *
 * @author mateus
 */
//A classe Carta é definida por um naipe e um numero
public class Carta {
    private String naipe;
    private int numero;
    
    //Metodos get e set para os campos
    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
     
    //esse método concatena o numero da carta com o nome do naipe
    @Override
    public String toString(){
        return numero + "de" + naipe;
    }
    
}
