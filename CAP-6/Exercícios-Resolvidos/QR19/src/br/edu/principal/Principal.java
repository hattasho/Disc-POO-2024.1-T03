package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vet1 = new String[20];
        String[] vet2 = new String[20];
        String aux = "";
        int i, j;
        
        for (i = 0; i < 20; i++) {
            System.out.println("Escreva o " + (i + 1) + "º caractere do vetor 1. (São 20.)");
            vet1[i] = sc.next();
        }
        for (i = 0; i < 20; i++) {
            System.out.println("Escreva o " + (i + 1) + "º caractere do vetor 2. (São 20.)");
            vet2[i] = sc.next();
        }
        System.out.println("Valores do vetor 1:");
        for (i = 0; i < 20; i++) {
            System.out.println(vet1[i]);
        }
        System.out.println("Valores do vetor 2:");
        for (i = 0; i < 20; i++) {
            System.out.println(vet2[i]);
        }
        j = 19;
        for (i = 0; i < 20; i++) {
            aux = vet1[i];
            vet1[i] = vet2[j];
            vet2[j] = aux;
            j--;
        }
        System.out.println("Valores do vetor 1 após a troca:");
        for (i = 0; i < 20; i++) {
            System.out.println(vet1[i]);
        }
        System.out.println("Valores do vetor 2 após a troca:");
        for (i = 0; i < 20; i++) {
            System.out.println(vet2[i]);
        }
    }
}