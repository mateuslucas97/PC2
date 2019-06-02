
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */
public class ManipulaArquivoTexto {
    private final HashSet<Contato> dados;
    
    public ManipulaArquivoTexto(){
        dados = new HashSet<>();
    }
    
    public void ManipulaArquivoTexto(String nomeArquivo){
        FileWriter arquivo;
        try{
            arquivo = new FileWriter(new File(nomeArquivo));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean salvarContatoFileWriter() throws IOException{
        String dados = null, content = null;
        FileWriter fw = new FileWriter(dados);
            BufferedWriter bw = new BufferedWriter(fw);
            // Escreve e fecha arquivo
            bw.write(content);
            bw.close();
            return true;
    }
    
    public boolean lerContatoScanner() throws IOException{
        String dados = null, content = null;
        FileWriter fw = new FileWriter(dados);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.close();
            return true;
    }
}
