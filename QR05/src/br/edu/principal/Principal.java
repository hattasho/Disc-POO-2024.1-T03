package br.edu.principal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];
        int[] U = new int[20];
        int[] D = new int[10];
        int[] S = new int[10];
        int[] P = new int[10];
        int[] IT = new int[10];

        int cont_u = 0;
        int cont_d = 0;
        int cont_i = 0;
        
        System.out.println("Este programa identifica dois vetores com 10 valores cada, em seguida, apresenta 5 possíveis grupos com os valores correspondentes a determinadas formas de organizar os valores recebidos.");
        System.out.println("Digite os 10 valores para o vetor X:");
        for (int i = 0; i < 10; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.println("Digite os 10 valores para o vetor Y:");
        for (int i = 0; i < 10; i++) {
            Y[i] = scanner.nextInt();
        }

        Set<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            uniqueSet.add(X[i]);
            uniqueSet.add(Y[i]);
        }

        int index = 0;
        for (int value : uniqueSet) {
            U[index] = value;
            index++;
        }
        cont_u = index;


        System.out.print("Vetor U (valores exclusivos em X que não estão em Y): ");
        for (int i = 0; i < cont_u; i++) {
            System.out.print(U[i] + " ");
        }
        System.out.println();

        Set<Integer> setY = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            setY.add(Y[i]);
        }

        for (int i = 0; i < 10; i++) {
            if (!setY.contains(X[i])) {
                D[cont_d] = X[i];
                cont_d++;
            }
        }

        System.out.print("Vetor D (diferença de X em relação a Y): ");
        for (int i = 0; i < cont_d; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();


        System.out.print("Vetor S (somas de X e Y): ");
        for (int i = 0; i < 10; i++) {
            S[i] = X[i] + Y[i];
            System.out.print(S[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor P (produtos de X e Y): ");
        for (int i = 0; i < 10; i++) {
            P[i] = X[i] * Y[i];
            System.out.print(P[i] + " ");
        }
        System.out.println();

        Set<Integer> intersecSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            if (setY.contains(X[i])) {
                intersecSet.add(X[i]);
            }
        }

        index = 0;
        for (int value : intersecSet) {
            IT[index] = value;
            index++;
        }
        cont_i = index;

        // Exibir interseção de X e Y (vetor IT)
        System.out.print("Vetor IT (interseção de X e Y): ");
        for (int i = 0; i < cont_i; i++) {
            System.out.print(IT[i] + " ");
        }
        System.out.println();

        // Fechar scanner
        scanner.close();
    }
}