
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
public class TesteRelogio {
    public static void main(String[] args){
        Relogio teste;
        Scanner input = new Scanner(System.in);
        int formato;
        
        do {
            
            System.out.println("====================");
            System.out.println("(12) - Formato 12 horas");
            System.out.println("(24) - Formato 24 horas");
            System.out.println("====================");
            formato = input.nextInt();
            
            
        }while(formato != 24 && formato !=12);
        
        if (formato==24)
            
            teste = new Relogio(true);
        
        else
            
            teste = new Relogio(false);
        
        System.out.println("Formato "+formato+" horas");
        
        teste.TicTac();
        
        
    
    }
}
