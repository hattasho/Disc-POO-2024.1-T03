package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vet3 = new int[20];
		int i = 0, j = 0;
		System.out.print("Este programa preenche dois vetores de dez elementos numéricos"
				+ "\ncada um e mostra o vetor resultante da intercalação deles.\n");
		
		
		for (i = 0; i<10; i++) {
			System.out.print("\nEscreva um valor para vet1[" + (i+1)+"]: ");
			vet1[i] = sc.nextInt();
			vet3[j] = vet1[i];
			j++;
			
			System.out.print("\nEscreva um valor para vet2[" + (i+1)+"]: ");
			vet2[i] = sc.nextInt();
			vet3[j] = vet2[i];
			j++;
		}
		
		System.out.println("\nO valor resultante em vetor 3 é: ");
		for(i = 0; i<20; i++) {
			System.out.print(" | "+vet3[i]);
		}
		System.out.print(" | ");
	}

}