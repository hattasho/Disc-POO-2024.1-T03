package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa preenche um vetor com nove números inteiros, calcula e mostra os números\r\n"
				+ " primos e suas respectivas posições.");
		int[] num = new int[9];
		int i, j, cont = 0;
		
		//Início do primeiro laço for
		for (i = 0; i < 9; i++){
			System.out.println("Digite um número qualquer: ");
			num[i]=sc.nextInt();		
		}
		//Início do segundo e terceiro laço for
			
		for (i = 0; i < 9; i++){
			cont = 0;
			for (j = 1; j <= num[i]; j++){
				if (num[i]%j==0) {
					cont++;
			}
		}
		if (cont <= 2) {
			System.out.println("Levando em consideração que um vetor array começa em 0, o número " + num[i] + " é primo, e se localiza na posição, " + i);

		}	
		
	}
	}
}
