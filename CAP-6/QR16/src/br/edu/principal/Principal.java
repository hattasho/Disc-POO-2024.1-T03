package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet_result1 = new int[10];
        int[] vet_result2 = new int[5];
        int[] vet1 = new int[10];
        int[] vet2 = new int[5];
        int i, j, poslivre1 = 0, poslivre2 = 0, soma;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número da lista: ");
            vet1[i] = sc.nextInt();
        }

        for (j = 0; j < 5; j++) {
            System.out.print("Digite o " + (j + 1) + "º número da lista: ");
            vet2[j] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            soma = vet1[i];
            for (j = 0; j < 5; j++) {
                soma += vet2[j];
            }
            if (soma % 2 == 0) {
                vet_result1[poslivre1] = soma;
                poslivre1++;
            } else {
                vet_result2[poslivre2] = soma;
                poslivre2++;
            }
        }

        System.out.println("Resultados pares:");
        for (i = 0; i < poslivre1; i++) {
            System.out.print(vet_result1[i] + " ");
        }

        System.out.println("\nResultados ímpares:");
        for (i = 0; i < poslivre2; i++) {
            System.out.print(vet_result2[i] + " ");
        }
    }
}