package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void fatoriais(int a[], int b []) {
		int i, numero, f = 0;
		for (i = 0; i < 10; i++) {
            numero = a[i];
            f = 1;
            for (int j = 1; j <= numero; j++) {
            	f = f * j;
          }
           b[i] = f;
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = 0;
		int vet1 [] = new int [10];
		int vet2 [] = new int [10];
		for (x = 0; x < 10; x++) {
			System.out.println("Pode me dar o valor de um número inteiro positivo? OBS: até dez números. "+(x + 1)+"° número");
			vet1[x] = sc.nextInt();
		}
		fatoriais(vet1, vet2);
		System.out.println("Os fatoriais dos números citados são: ");
		for(x = 0; x < 10; x++) {
			System.out.println("Do elemento " + (x + 1)+ ": " + vet2[x]);
		}
	}
}