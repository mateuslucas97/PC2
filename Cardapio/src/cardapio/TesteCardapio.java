/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapio;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
//metodo principal para testar os outros metodos
public class TesteCardapio {
    public static void main(String[] args) {
        int dia, hora, escolha, x = 0;//para acessar as posicoes da matriz
        double calorias;//para calcular as calorias
        String descricao;//para acessar o nome de cada prato
        //classes scanner para ler dados do teclado de diferentes posiçoes da matriz
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        Cardapio c = new Cardapio();//objeto a ser manipulado
        while(x==0){
            //tela de boas vindas
            System.out.println("===================MENU===================");
            System.out.println("Escolha uma opção abaixo: ");
            System.out.println("1 - Preencher cardapio");
            System.out.println("2 - Consultar cardapio");
            System.out.println("3 - Substituir refeição");
            System.out.println("4 - Excluir refeição");
            System.out.println("5 - Listar refeições por dia");
            System.out.println("6 - Listar cardapio completo");
            System.out.println("7 - Calcular calorias consumida na semana");
            System.out.println("8 - Sair");
            System.out.print("Digite sua escolha: ");
            escolha = ler.nextInt();
            if(escolha ==1){
                //para preencher o cardapio
                System.out.println("=====PREENCHE CARDAPIO=====");
                System.out.print("Digite dia: ");
                dia = ler.nextInt();
                System.out.print("Digite hora: ");
                hora = ler.nextInt();
                System.out.print("Digite a descricao: ");
                descricao = ler2.nextLine(); 
                System.out.print("Digite qntd de calorias: ");
                calorias=ler.nextFloat();       
                c.incluiRefeicao(dia, hora, descricao, calorias);
            }
            else if(escolha == 2){
                //para consultar  o cardapio
                System.out.println("=====CONSULTA CARDAPIO=====");
                System.out.print("Informe o dia a ser consultado: ");
                dia = ler.nextInt();
                System.out.print("Informe a hora a ser consultada: ");
                hora = ler.nextInt();
                c.consultaRefeicao(dia, hora);
            }
            else if(escolha == 3){
                //para substituir uma refeicao
                System.out.println("=====SUBSTITUI REFEIÇÃO=====");
                System.out.print("Informe o dia da refeição a ser substituida: ");
                dia = ler.nextInt();
                System.out.print("Informe a hora da refeição a ser substituida: ");
                hora = ler.nextInt();
                System.out.print("Digite a descricao: ");
                descricao = ler2.nextLine(); 
                System.out.print("Digite qntd de calorias: ");
                calorias=ler.nextFloat(); 
                c.substituiRefeicao(dia, hora, descricao, calorias);
                c.consultaRefeicao(dia, hora);
            }
            else if(escolha == 4){
                //para excluir uma refeicao
                System.out.println("=====EXCLUI REFEIÇÃO=====");
                System.out.print("Informe o dia da refeição a ser excluida: ");
                dia = ler.nextInt();
                System.out.print("Informe a hora da refeição a ser excluida: ");
                hora = ler.nextInt();        
                c.excluiRefeicao(dia, hora);
            }
            else if(escolha == 5){
                //para listar uma refeicao por dia
                System.out.println("=====LISTA REFEIÇÕES=====");
                System.out.println("0 - Domingo");
                System.out.println("1 - Segunda");
                System.out.println("2 - Terça");
                System.out.println("3 - Quarta");
                System.out.println("4 - Quinta");
                System.out.println("5 - Sexta");
                System.out.println("6 - Sábado");
                System.out.print("Informe o dia: ");
                dia = ler.nextInt();
                for(int i=0;i<6;i++){
                    c.consultaRefeicao(dia, i);
                }
            }
            else if(escolha == 6){
                //para listar o cardapio completo
                System.out.println("=====CARDAPIO COMPLETO=====");
                for(int i=0;i<6;i++){
                    for(int j=0;j<7;j++){
                        c.consultaRefeicao(j,i);
                    }
                }
            }
            else if(escolha == 7){
                //para calcular as calorias consumidas na semana
                System.out.println("=====================================================");
                System.out.println("Total de calorias consumida na semana: "+c.somaCaloria());
                System.out.println("=====================================================");
            }
            else{
                //para sair da apliaçao
                x = 1;
            }
            
        }
    }
    
}
