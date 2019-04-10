/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
//a classe mesa vai carregar o jogo todo
//é a famosa classe Teste
public class Mesa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);//calsse para leitura de dados do teclado
        int quantidadeCartas, empate = 1;
        Baralho b = new Baralho();//construcao do objeto em execucao
        while(empate != 0){
            System.out.println("Embaralhando as cartas");
            b.Embaralhar();//para embaralhar as 52 cartas
            Jogador[] j = new Jogador[2];//cria 2 jogadores
            Carta[] c = new Carta[2];//cria 2 colecoes de cartas para cada jogador
            System.out.println("Quantas cartas serao distribuidas para cada jogador?");
            quantidadeCartas = ler.nextInt();//define quantas cartas serao para cada jogador
            System.out.println("Cada jogador tera " +quantidadeCartas);
            for(int i = 0; i < 2; i++){
                j[i] = new Jogador(quantidadeCartas);//carrega os jogadores com a qtde de cartas definidas pelo usuario
                c[i] = new Carta();//carrega as cartas de acordo com os jogadores
            }
            //carrega as cartas para cada jogador
            for(int i =0; i < quantidadeCartas; i++){
                j[0].setCarta(i,b.getCarta(i));
                j[1].setCarta(i,b.getCarta(51 - i));
            }
            //joga as maiores cartas na mao de cada jogador
            c[0] = j[0].maiorCarta(quantidadeCartas);
            c[1] = j[1].maiorCarta(quantidadeCartas);
            //mensagem de situacao das catas na mesa
            System.out.println("O jogador 1 jogou essa carta " + c[0].getNaipe() +c[0].getNumero());
            System.out.println("O jogador 2 jogou essa carta " + c[1].getNaipe() +c[1].getNumero());
            //compara os valores de cada carta de cada jogador
            if(c[0].getNumero() == c[1].getNumero()){
                if(c[0].getNaipe().equals("Ouros")){
                    System.out.println("Jogador 1 ganhou");
                    empate = 0;
                }
                else if(c[1].getNaipe().equals("Ouros")){
                    System.out.println("O jogador 2 ganhou");
                    empate = 0;
                }
                else{
                    System.out.println("Jogo empatado");
                }
            }
            else if(c[0].getNumero() > c[1].getNumero()){
                System.out.println("Jogadpr 1 ganhou");
                empate = 0;
            }
            else{
                System.out.println("Jogador 1 ganhou");
                empate = 0;
            }
        }
    }
    
}
