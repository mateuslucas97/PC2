/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapio;

/**
 *
 * @author mateus
 */
//a classe cardapio é uma matriz que contem dia e horario das refeiçoes
public class Cardapio {
    private final Refeicao[][] semana;
    private final String[] dia = {"domingo","segaunda","terca","quarta","quinta","sexta","sabado"};
    private final String[] hora = {"cafe da manha","lanche da manha","almoco","lanche da tarde","jantar","ceia"};

    //construtor com os dias da semana e os horarios de cada refeiçao
    public Cardapio() {
        this.semana = new Refeicao[6][7];
        for(int i =0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                semana[i][j] = new Refeicao();
            }
        }
    }
    
    //metodo para incluir refeicao cria novo objeto refeicao para ser carregado
   public void incluiRefeicao(int dia, int hora, String descricao, double caloria){
        Refeicao r = new Refeicao();
        r.setDescricao(descricao);
        r.setCaloria(caloria);  
        semana[hora][dia] = r;
    }
    
    //metodo para excluir refeicao, ele inicializa as coisas com null(dia) e zero (caloria)
    public void excluiRefeicao(int dia, int hora){
        this.semana[dia][hora].setDescricao(null);
        this.semana[hora][dia].setCaloria(0);
    }
    
    //metodo para substituir cada refeicao
    public void substituiRefeicao(int dia, int hora, String descricao, double calorias){
        this.semana[hora][dia].setDescricao(descricao);
        this.semana[hora][dia].setCaloria(calorias);
    }
    
    //metodo para consultar uma refeicao em especifico 
    public void consultaRefeicao(int diaa, int horaa){
        System.out.println("-----------------------------");
        System.out.println("Dia: " +dia[diaa]);
        System.out.println("Hora: "+hora[horaa]);
        System.out.println("Descricao: "+this.semana[horaa][diaa].getDescricao());
        System.out.println("Dcalorias: "+this.semana[horaa][diaa].getCaloria());
        System.out.println("------------------------------");
    }
    
    //metodo para somar as calorias
    public double somaCaloria(){
        double total = 0;
        for(int i =0; i < 6; i++){
            for(int j =0; j < 7; j++){
                total = total + this.semana[i][j].getCaloria();
            }
        }
        return total;
    }
}
