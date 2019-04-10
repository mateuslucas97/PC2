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
//a classe refeicao é composta por uma descricao do prato e as calorias deste prato
public class Refeicao {
    private String descricao;
    private double caloria;

    //metodos get e set para descricao e calorias
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCaloria(double caloria) {
        this.caloria = caloria;
    }

    public double getCaloria() {
        return caloria;
    }

}
