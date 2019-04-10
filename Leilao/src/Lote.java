/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class Lote {
    private String descricao;
    private Lance maiorLance;
    //metodo construtor
    public Lote(String descricao, Lance maiorLance) {
        this.descricao = descricao;
        this.maiorLance = maiorLance;
    }

    Lote(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //mmetodos get e set
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lance getMaiorLance() {
        return maiorLance;
    }

    public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }
    //metodo para compara dois lances dados
    public void verificaLance(Lance lance){
        if(this.maiorLance.getValor() < lance.getValor()){//compara dois lances dados se o primeiro for menor do que o segundo
            this.maiorLance = lance;//deve-se atualizar o primeiro lance
        }
    }
    
}
