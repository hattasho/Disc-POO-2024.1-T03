package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Este programa recebe o número sorteado por um dado em vinte jogadas; mostra os números sorteados e a frequência com que apareceram.");
        Scanner sc = new Scanner(System.in);
        int[] dado = new int[20];
        int i, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;

        for (i = 0; i < 20; i++) {
            do {
                System.out.print("Digite o número do dado (entre 1 e 6): ");
                dado[i] = sc.nextInt();
            } while (dado[i] < 1 || dado[i] > 6);
        }

        for (i = 0; i < 20; i++) {
            System.out.print(dado[i] + " ");
        }

        for (i = 0; i < 20; i++) {
            switch (dado[i]) {
                case 1:
                    num1++;
                    break;
                case 2:
                    num2++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                    break;
                case 5:
                    num5++;
                    break;
                case 6:
                    num6++;
                    break;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Número 1 foi sorteado " + num1 + " vez(es)");
        System.out.println("Número 2 foi sorteado " + num2 + " vez(es)");
        System.out.println("Número 3 foi sorteado " + num3 + " vez(es)");
        System.out.println("Número 4 foi sorteado " + num4 + " vez(es)");
        System.out.println("Número 5 foi sorteado " + num5 + " vez(es)");
        System.out.println("Número 6 foi sorteado " + num6 + " vez(es)");
    }
}