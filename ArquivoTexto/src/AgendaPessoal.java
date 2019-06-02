
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class AgendaPessoal {
    private final HashMap<String, Contato> agenda;
    
    public AgendaPessoal(){
        agenda = new HashMap<>();
    }
    
    public Contato pesquisaNome(String nome){
        return agenda.get(nome);
    }
    
    public Contato pesquisaTelefone(String telefone){
        return agenda.get(telefone);
    }
    
    public String listaAgenda(){
        Set<String> chaves = agenda.keySet();
        for (String chave : chaves) {
            if(chave != null)
                System.out.println(chave + agenda.get(chave));
        }
        return null;
        
    }
    
    public void salvarAgenda(){
        HashSet dados = new HashSet(agenda.keySet());
    }
    
    public void lerAgendaSalva(){
        HashSet dados = new HashSet(agenda.keySet());
        Set<String> chaves;
        chaves = agenda.keySet();
        for (String chave : chaves) {
            if(chave != null)
                System.out.println(chave + agenda.get(chave));
        }
    }
}
