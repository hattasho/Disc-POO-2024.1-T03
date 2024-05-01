package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa receba como parâmetro um valor inteiro e positivo N e "
        		+ "\nretorne o valor de S, obtido pelo seguinte cálculo: S = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!");
    
        System.out.print("\nDigite um valor inteiro e positivo N: ");
        int num = scanner.nextInt();

        double s = sequencia(num);
        System.out.println("S = " + s);

        scanner.close();
    }

    public static double sequencia(int n) {
        double seq = 1;  
        double f = 1;   
        
        for (int a = 1; a <= n; a++) {
            f *= a;
            seq += 1 / f;
        }
        return seq;
    }
}