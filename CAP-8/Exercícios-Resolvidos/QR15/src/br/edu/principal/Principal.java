package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] vet = new double[5];
        
        System.out.println("Este programa recebe como parâmetro um vetor A"
        		+ "\ncom cinco números reais e retorna esses números ordenados de forma crescente.");

        for (int i = 0; i < 5; i++) {
            System.out.print("\nDigite um número real: ");
            vet[i] = scanner.nextDouble();
        }
        
        ordena(vet);
        
        System.out.println("Números ordenados de forma crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vet[i]);
        }
        
        scanner.close();
    }
    
    public static void ordena(double[] v) {
        int n = v.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    double aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }
}