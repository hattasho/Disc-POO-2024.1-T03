package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        maiorMenor();
    }

    public static void maiorMenor() {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        System.out.println("Este código recebe 5 valores e apresenta o maior e o menor número digitados");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = scanner.nextInt();

            if (i == 1) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);

        scanner.close();
    }
}