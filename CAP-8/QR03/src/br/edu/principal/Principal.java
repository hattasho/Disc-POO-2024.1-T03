package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
    public static double divisores(double a, double b, double c) {
        double s = 0;
        for (double i = b; i <= c; i++) {
            if (i % a == 0) {
                s += i;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        double a, b, c, result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o divisor que irá dividir a soma dos números inteiros entre dois números.");
        a = sc.nextDouble();
        if (a < 1) {
            System.out.println("Digite um número maior que 1!");
        } else {
            System.out.println("Digite o primeiro número.");
            b = sc.nextDouble();
            System.out.println("Digite o segundo número.");
            c = sc.nextDouble();
            result = divisores(a, b, c);
            System.out.println("Soma dos números inteiros entre " + b + " e " + c + " que são divisíveis por " + a + ": " + result);
        }
    }
}