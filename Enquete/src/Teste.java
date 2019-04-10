
import java.security.SecureRandom;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class Teste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//contrução do objeto de leitura de dados do teclado
        SecureRandom gerador = new SecureRandom();//construção do objeto de geração de numeros aleatórios
        
        Enquete e = new Enquete();//construção do objeto enquete
        int numeroLido;//varável local
      
        System.out.println("Informe a quantidade de entrevistados:");//pede para informar a quantidade de entrevistados. Esse será o tamanho do vetor de notas
        numeroLido = input.nextInt();//para ler dados do teclado
        int []quantidade = new int[numeroLido];//construção de um novo vetor que será do tamanho do numero de pessoas informadas
        //mostra as notas geradas
        System.out.println("Notas geradas: ");
        for(int i =0; i < numeroLido; i++){//varredura do vetor
            quantidade[i] = gerador.nextInt(10)+1;//o novo vetor será de numeros aleatórios gerados do tamanho do numero de pessoas informadas
        }
        
        System.out.println("Frequencia: ");
        e.frequencia(quantidade);//mostra a frequencia de cada nota informada
        System.out.println("Media: ");
        e.setQuantidade(numeroLido);//mostra quantas pessoas foram entrevistadas
        e.media(quantidade);//mostra a média de cada nota que apareceu no vetor
        e.entrevistados();//mostra quantas pessoas foram entrevistadas
    }
    
}
