/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
import java.util.Scanner;
public class Teste {
    public static void main(String[] args){
        Leilao l = new Leilao(3);
        Scanner input = new Scanner(System.in);
        String d = input.next();
        l.adicionaLote(new Lote("aviao", new Lance(new Pessoa(), 100)));
        l.recebeLance(lance, "aviao");
    }  
}
