package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		int[] pos = new int[8];
		int[] neg = new int[8];
		
		int cont, cont_n = 1, cont_p = 1, i;

		System.out.print("Este programa preenche um vetor com oito números inteiros, calcula e mostre dois vetores"
				+ "\nresultantes. O primeiro vetor resultante deve conter os números positivos e o segundo, os números negativos. "
				+ "\nCada vetor resultante terá, no máximo, oito posições, que não poderão ser completamente utilizadas.\n");
		
		for (i = 0; i<8; i++) {
			System.out.print("\nEscreva um valor para num[]: ");
			num[i] = sc.nextInt();
			if (num[i]>=0) {
				pos[cont_p] = num[i];
				cont_p++;
			} else{
				neg[cont_n] = num[i];
				cont_n++;
			}
		}
		
		if (cont_n == 1) {
			System.out.println("\nVetor de negativos vazio");
		} else {
			System.out.print("\nVetor de negativos contém: \n{ | ");
			for (i = 1; i<= cont_n-1; i++) {
				System.out.print(neg[i] + " | ");
			}
			System.out.println("}");
		}
		if (cont_p == 1) {
			System.out.println("\nVetor de positivos vazio");
		} else {
			System.out.print("\nVetor de positivos contém: \n{ | ");
			for (i = 1; i <= cont_p-1; i++) {
				System.out.print(pos[i] + " | ");
			}
			System.out.println("}");
		}
		
	}

}