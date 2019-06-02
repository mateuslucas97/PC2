/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class TesteAgenda {
    public static void main(String[] args) {
        AgendaPessoal ap = new AgendaPessoal();
        Contato c = new Contato("Carlos","32565313","carlossilva@gmail.com");
        ap.listaAgenda();
        ap.lerAgendaSalva();
        ap.pesquisaNome("Carlos");
        ap.pesquisaTelefone("32565313");
        ap.salvarAgenda();
        c.getNome();
        c.getTelefone();
        c.getEmail();
        
    }
    
}
