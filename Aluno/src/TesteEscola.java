
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateu
 */
//classe principal do projeto
public class TesteEscola {
    public static void main(String[] args){
        //classe scanner para preencher dados do teclado
        Scanner input = new Scanner(System.in);
        //são 3 turmas na escola
        //todas com a mesma capacidade
        System.out.println("informe a capacidade das turmas");
        int capacidade = input.nextInt(); //é assim que preenche dados do teclado em java
        System.out.println("informe o codigo das turmas");
        int codigo = input.nextInt(); //é assim que preenche dados do teclado em java
        //3 objetos para cada turma informando codigo e capacidade
        Turma t1 = new Turma(1,capacidade);
        Turma t2 = new Turma(2,capacidade);
        Turma t3 = new Turma(3,capacidade);
        
        //3 repetições para cada turma, é assim que se preencher um vetor em java
        //é necessario o método adicionar Alunos para o preenchimento
        
        for(int i = 0;i<capacidade;i++){
            System.out.println("Informe o nome do aluno "+(i+1));
            String nome = input.next();
            System.out.println("Informe a data de mascimento do aluno "+(i+1));
            String data = input.next();
             Aluno a1 = new Aluno(nome,data);
             t1.adicionarAlunos(a1);
        }
        
        for (int j = 0; j<capacidade;j++){
            System.out.println("Informe o nome do aluno "+(j+1));
            String nome = input.next();
            System.out.println("Informe a data de nascimento do aluno " +(j+1));
            String data = input.next();
            Aluno a1 = new Aluno(nome,data);
            t2.adicionarAlunos(a1);
        }
        
        for (int k = 0; k<capacidade;k++){
            System.out.println("Informe o nome do aluno:"+(k+1));
            String nome = input.next();
            System.out.println("Informe a darte de nascimento do aluno" + (k+1));
            String data = input.next();
            Aluno a1 = new Aluno(nome,data);
            t3.adicionarAlunos(a1);
        }
        
        //exibicao dos dados 
        
        System.out.println("voce criou a(s) turma(s):");
        System.out.println("Codigo ="+t1.getCodigo());
        System.out.println("Codigo ="+t2.getCodigo());
        System.out.println("Codigo ="+t3.getCodigo());
    }
    
}
