package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse programa atribui números inteiros a um vetor com 10 elementos e os coloca em ordem decrescente");
		
		int vet [] = new int[10];
		int i,j,aux = 0;
		
		for(i = 0 ; i <=  9 ; i++) {
			System.out.println("Digite qualquer número inteiro");
			vet[i] = sc.nextInt();
		}
		
		for(i = 0; i <= 9; i++) {
			for(j = 0 ; j <= 8 ; j++) {
				if (vet[j] < vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet [j+1];
					vet[j+1] = aux;
				}
			}
		}
		System.out.println("O vetor em ordem decrescente é:");
		for (i = 0 ; i <= 9 ; i++) {
			System.out.print( "|" +vet[i] );
			}
		System.out.print("|");
		}

}

