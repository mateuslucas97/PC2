/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class Relogio {
    private Contador hora;
    private Contador minuto;
    private boolean formato24;
    
    public Contador getHora(){
        return hora;
    }
    
    public void setHora(Contador hora){
        this.hora = hora;
    }
    
    public Contador getMinuto(){
        return minuto;
    }
    
    public void setMinuto(Contador minuto){
        this.minuto = minuto;
    }
    
    public boolean getFormato(){
        return formato24;
    }
    
    public void setFormato(boolean formato){
        this.formato24 = formato;
    }
    
    public Relogio(boolean formato24){
        if(formato24)
            this.hora = new Contador(23);
        else
            this.hora = new Contador(11);
        
        this.minuto = new Contador(59);
        this.formato24 = formato24;
    }
    
    public void TicTac(){
        boolean periodo = true;
        while(true){
            if(getFormato())
                System.out.println(getHora().getValor()/10+""+getHora().getValor()%10+":"+getMinuto().getValor()/10+""+getMinuto().getValor()%10);
            else{
                if(periodo)
                    System.out.println(getHora().getValor()/10+""+getHora().getValor()%10+":"+getMinuto().getValor()/10+""+getMinuto().getValor()%10+" A.M");
                else
                    System.out.println(getHora().getValor()/10+""+getHora().getValor()%10+":"+getMinuto().getValor()/10+""+getMinuto().getValor()%10+" P.M");        
            }
            getMinuto().contar();
            if(getMinuto().getValor() == 0)
                getHora().contar();
            if(getHora().getValor() == 0 && getMinuto().getValor() == 0)
                periodo = !periodo;
        }
    }
}

