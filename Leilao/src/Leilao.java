/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class Leilao {
    private Lote[] leilao;

    public Leilao(Lote[] leilao) {
        this.leilao = leilao;
    }

    public Lote[] getLeilao() {
        return leilao;
    }

    public void setLeilao(Lote[] leilao) {
        this.leilao = leilao;
    }
    
    public boolean adicionaLote(Lote lote){
        for(int i = 0; i < leilao.length; i++){
            if(leilao[i] == null){
                leilao[i] = lote;
            }
        }
        return true;
    }
    
    public boolean recebeLance(Lance lance, String descricao){
        for (Lote leilao1 : leilao) {
            if (descricao.equals(leilao1.getDescricao())) {
            }   
        }
        return true;
    }
    
    public String imprimeLances(){
        for (Lote lote1 : this.leilao) {
            System.out.println(""+lote1.getDescricao() + "" +lote1.getMaiorLance().getValor());
        }
        return "resultados";
    }
    
    public String encerraLeilao(){
        String retorno = null;
        for(Lote posicao : leilao){
            retorno = posicao.getDescricao() + "vendido por" + posicao.getMaiorLance().getValor() + "para" + posicao.getMaiorLance().getPessoa().getNome() + "\n";
        }
        return retorno;
    }
}
