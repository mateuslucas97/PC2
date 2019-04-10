/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class Enquete {//declaração da classe e dos campos
    private int nota;
    private int quantidade;
    private float media;
       //métodos get e set para cada um dos campos
    public void setNota(int n){
        nota = n;
    }
    
    public int getNota(){
        return nota;
    }
    
    public void setQuantidade(int q){
        quantidade = q;
    }
    
    public int getQuantidade(){
        return quantidade;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;//sobrecarga de variável
    }
    
   public void entrevistados(){
       System.out.println("A quantidade de entrevistados foi: "+this.getQuantidade());
   }
    //método da frequencia passando um vetor de notas como parâmetro
    public void frequencia(int []notas){
        int cont = 1;//variável local para contar as posições do vetor começando pelo 1
        int []novoVetor = new int[10];//instanciamento do novo vetor para receber as frequencias de cada nota
        for(int i=0; i< novoVetor.length; i++){//varredura do vetor
            novoVetor[i] = cont;//para cada posição de vetor associa a variavel cont
            cont++;//que será contada um por um
        }
        for(int i =0; i <novoVetor.length; i++){
            System.out.printf("Nota %d apareceu %d vezes\n", novoVetor[i], aparicoes(novoVetor[i],notas));//mostra quantas vezes todas as notas apareceram na pesquisa
        }
    }
    //este método calcula quantas vezes uma nota apareceu na pesquisa
    public int aparicoes(int nota, int notas[]){//passa uma nota em especifico e um vetor de notas pra ser comṕarado
        int cont = 0;//váriavel para contar as aparições
        for(int i =0; i < notas.length; i++){//varredura de todo o vetor de notas
            if(notas[i]==nota){//se em alguma posição do vetor aparecer alguma nota em especifico
                cont++;//soma mais um
            }
        }
        return cont;
    }
    //método para calcular a média passando o vetor de notas como parametro
    public void media(int notas[]){
        int cont =0;//variavel para contar as posiçoes do veotor
        for(int i =0; i < notas.length; i++){//varredura do vetor
            cont = notas[i]+cont;//para cada posição de vetor gerada sera somada com o próximo
        }
        this.setMedia(cont/this.getQuantidade());//pega os numeros que foram somados e divide com a quantidade de entrevistados informada
        System.out.println("A media foi "+this.getMedia());//mensagem exibida na tela
    }
}
