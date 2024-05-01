package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[15];
		int p[] = new int[5];
		int i[] = new int[5];
		int cont, k = 0, posLivreP = 0, posLivreI = 0;
		
		System.out.println("Este programa recebe 15 valores inteiros e verifica se sao pares ou impares,\narmazenando-os em listas de acordo com sua classificaçao.\n");

		for (cont = 0; cont < 15; cont++) {
			
			System.out.print("Digite o " + (cont+1) + "° numero: ");
			vet[cont] = sc.nextInt();
		}
		
		for (cont = 0; cont < 15; cont++) {
			
			if (vet[cont] % 2 == 0) {
				
				p[posLivreP] = vet[cont];
				posLivreP++;
			}
			else {
				
				i[posLivreI] = vet[cont];
				posLivreI++;
			}
			
			if (posLivreP == 5) {
				
				System.out.println("\nA lista dos pares esta cheia!");
				
				for (k = 0; k < (posLivreP); k++) {
					
					System.out.println((k + 1) + "° numero par: " + p[k]);
				}
				posLivreP = 0;
				System.out.println("Preenchendo novamente...");
				
			}
			
			if (posLivreI == 5) {
				
				System.out.println("\nA lista dos impares esta cheia!");
				
				for (k = 0; k < (posLivreI); k++) {
					
					System.out.println((k + 1) + "° numero impar: " + i[k]);
				}
				posLivreI = 0;
				System.out.println("Preenchendo novamente...");
			}
			
		}
		
		if (posLivreP != 0) {
			
			System.out.println("\nA lista dos pares esta incompleta...");
			
			for (k = 0; k < (posLivreP); k++) {
				
				System.out.println((k + 1) + "° numero par: " + p[k]);
			}
		
		}
			
		if (posLivreI != 0) {
				
			System.out.println("\nA lista dos impares esta incompleta...");
				
			for (k = 0; k < (posLivreI); k++) {
					
					System.out.println((k + 1) + "° numero impar: " + i[k]);
			}
				
		}
			
		System.out.print("\nFim de programa.");
		
	}
		
}

