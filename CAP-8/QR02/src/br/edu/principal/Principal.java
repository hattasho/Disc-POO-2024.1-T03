package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
    public static int somar(int num1, int num2) {
        int s = 0;
        for (int i = num1 + 1; i < num2; i++) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        int num1, num2, s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número, distinto do primeiro:");
        num2 = sc.nextInt();

        s = somar(num1, num2);
        System.out.println("A soma dos inteiros entre esses dois números é: " + s);
    }
}