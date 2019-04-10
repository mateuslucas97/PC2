/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.security.SecureRandom;

/**
 *
 * @author mateus
 */
//a classe Baralho possui uma colecao de cartas que será gerada aleatoriamente
public class Baralho {
    private final Carta[] baralho;
    private final SecureRandom aleatorio = new SecureRandom();
    
    //o construtor tem os vetores naipe e numero inicializados com
    //os valores de um baralho convencional
    public Baralho(){
        String[] naipe = {"Copas","Ouros","Paus","Espadas"};
        int[] numero = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int j =0;
        //construcao do objeto carta
        baralho = new Carta[52];
        //será varrido 4 e 13 vezes para escolher uma carta(naipe + numero) qualquer 
        for(int i =0; i < 4; i++){
            for(int k =0; k < 13; k++){
                if(i == 0){
                    baralho[j] = new Carta();
                    baralho[j].setNumero(k+1);
                    baralho[j].setNaipe(naipe[i]);
                }
                if(i == 1){
                    baralho[j] = new Carta();
                    baralho[j].setNumero(k+1);
                    baralho[j].setNaipe(naipe[i]);
                }
                if(i == 2){
                    baralho[j] = new Carta();
                    baralho[j].setNumero(k+1);
                    baralho[j].setNaipe(naipe[i]);
                }
                 if(i == 3){
                    baralho[j] = new Carta();
                    baralho[j].setNumero(k+1);
                    baralho[j].setNaipe(naipe[i]);
                }
                 j++;
            }
        }
    }
    
    //método para embaralhar as cartas
    //igual a troca de posicao de vetores comum
    public void Embaralhar(){
        for (Carta baralho1 : baralho) {
            int j = aleatorio.nextInt(52);
            Carta temp = baralho1;
            baralho[j] = temp;
        }
    }
    
    //método para mostrar o vetor de cartas aleatorio
    public Carta getCarta(int posicao){
        return baralho[posicao];
    }
}
