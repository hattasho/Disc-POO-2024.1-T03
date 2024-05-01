package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] vet = new int [10];		
		System.out.println("por favor, inserir 10 números inteiros abaixo: ");
		for (int i = 0; i <= vet.length - 1; i++) {
			System.out.println("o " + (i+1) + "°, por favor: ");
			vet[i] = sc.nextInt();
		}
		boolean achou;
		for (int i = 0; i <= vet.length - 1; i++) {
			if (vet[i] > 50) {
				System.out.printf("Número superior a 50: %d, Posição: %d\n", vet[i], i + 1);
				achou = true;
			}
		}
		if (achou = false) {
			System.out.println("Não existem números superiores a 50 no vetor");
		}
	}

}