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
//a classe jogador possui um vetor de cartas que estará na mão do jogador
public class Jogador {
    public Carta[] mao;
    
    //construtor com um parametro sera inicializado com um numero determinado
    //de cartas
    public Jogador(int quantidade){
        mao = new Carta[quantidade];
        for(int i = 0; i < quantidade; i++){
        mao[i] = new Carta();
        }
    }

    //metodo para carregar uma carta em uma posicao especifica
    public void setCarta(int posicao, Carta mao) {
        this.mao[posicao] = mao;
    }
    
    //metodo para mostrar uma carta da mao do jogador 
    public Carta getMao(int posicao, Carta mao){
        return this.mao[posicao];
    }
    
    //metodo para comparar a maior carta da mao do jogador
    public Carta maiorCarta(int quantidade){
        Carta ordenar; //variavel do tipo carta
        //sera varrido cada carta na mao do jogador, sera comparado e mostrara
        //a maior de todas que estiver na mao dele
        for(int i =0; i < quantidade - 1; i++){
            for(int j = i + 1; j < quantidade; j++){
                if(mao[i].getNumero() > mao[j].getNumero()){
                ordenar = mao[j];
                mao[j] = mao[i];
                mao[i] = ordenar;
                }
            }    
        }
        return mao[quantidade - 1];
    }
    
}
