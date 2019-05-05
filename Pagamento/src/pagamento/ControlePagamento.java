/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

import java.util.ArrayList;

/**
 *
 * @author mateus
 */
//Essa classe tem variaveis constantes salário e hora e um array para juntar
//todos os tipos de empregados da empresa
public class ControlePagamento {
    public static final double SALARIO = 954.0;
    public static final double HORA = 8.0;
    private ArrayList <Pagavel> aPagar;
    
    public ControlePagamento(){
        aPagar = new ArrayList<>();
    }

    public ArrayList<Pagavel> getaPagar() {
        return aPagar;
    }

    public void setaPagar(ArrayList<Pagavel> aPagar) {
        this.aPagar = aPagar;
    }
}
