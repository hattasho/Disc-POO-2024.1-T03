package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Esse programa corrige uma prova de 8 questões, cada questão da prova vale 1 ponto");
        
        // Declaração dos arrays de respostas
        boolean[] gabarito = new boolean[8];
        boolean[] resposta = new boolean[8];
        
        int numAlunos = 10; // Número de alunos
        int totalAprovados = 0; // Contador para o total de alunos aprovados
        
        // Leitura das respostas do gabarito
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite a resposta da questão " + (i + 1));
            gabarito[i] = sc.nextBoolean();
        }
        
        // Processamento das respostas dos alunos
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o número do " + (i + 1) + "º aluno");
            int numAluno = sc.nextInt();
            int pontos = 0;
            
            // Reinicia o array de respostas
            for (int j = 0; j < 8; j++) {
                System.out.println("Digite a resposta dada pelo aluno " + numAluno + " à questão " + (j + 1));
                resposta[j] = sc.nextBoolean();
                
                // Verifica se a resposta do aluno está correta
                if (resposta[j] == gabarito[j]) {
                    pontos++;
                }
            }
            
            // Verifica se o aluno foi aprovado
            if (pontos >= 6) {
                totalAprovados++;
            }
            
            System.out.println("A nota do aluno " + numAluno + " foi " + pontos);
        }
        
        // Calcula o percentual de alunos aprovados
        double percentualAprovacao = (double) totalAprovados / numAlunos * 100;
        System.out.println("O percentual de alunos aprovados é de: " + percentualAprovacao + "%");
        
        sc.close(); // Fecha o scanner
    }
}