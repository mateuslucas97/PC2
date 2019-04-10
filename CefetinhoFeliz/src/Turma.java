/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lsi-hb
 */
public class Turma {
    private int codigo;
    private int capacidade;
    private Aluno[] alunos;
    
    public Turma(){
        codigo = 0;
        capacidade = 0;
        alunos = null;
    }
    
    public Turma(int c, int ca){
        codigo = c;
        capacidade = ca;
        alunos = new Aluno[capacidade];
    }
   
    public void setCodigo(int c){
        codigo = c;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCapacidade(int ca){
        capacidade = ca;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    
    public void setAlunos(Aluno[] a){
        alunos = a;
    }
    
    public Aluno[] getAlunos(){
        return alunos;
    }
    
    public void adicionarAlunos(Aluno a){
        for(int i=0;i<capacidade;i++){
            if(alunos[i] == null){
                alunos[i] = a;
                break;
            }
        }
        
    }
    
}
