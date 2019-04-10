
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lsi-hb
 */
public class TesteEscola {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // serão 3 turmas na Escolinha
        // todas as turmas são de mesma capacidade
        System.out.println("Informe a capacidade da(s) turma(s):");
        int capacidade = input.nextInt();
        Turma t1 = new Turma(1, capacidade);
        Turma t2 = new Turma(2, capacidade);
        Turma t3 = new Turma(3, capacidade);
        
        Aluno a1;

        for (int j = 0; j < t1.getCapacidade(); j++) {
            System.out.println("Informe o nome do aluno " + (j + 1));
            String nome = input.next();
            System.out.println("Informe a data de nascimento do aluno " + (j + 1));
            String data = input.next();

            a1 = new Aluno(nome, data);
            t1.adicionarAlunos(a1);

        }
        
        for (int j = 0; j < t2.getCapacidade(); j++) {
            System.out.println("Informe o nome do aluno " + (j + 1));
            String nome = input.next();
            System.out.println("Informe a data de nascimento do aluno " + (j + 1));
            String data = input.next();

            a1 = new Aluno(nome, data);
            t2.adicionarAlunos(a1);

        }
        
        for (int j = 0; j < t3.getCapacidade(); j++) {
            System.out.println("Informe o nome do aluno " + (j + 1));
            String nome = input.next();
            System.out.println("Informe a data de nascimento do aluno " + (j + 1));
            String data = input.next();

            a1 = new Aluno(nome, data);
            t3.adicionarAlunos(a1);

        }
    }
}
