package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[5];
		int i = 0, cod;
		for(i = 0; i < 5; i++) {
		System.out.println("Qual o "+(i + 1)+"º número de seu vetor? (insira 5 números.)");
		vet[i] = sc.nextInt();
		}
		System.out.println("Qual o código que deseja inserir? (escreva '0' pra encerrar;");
		System.out.println("'1' para mostrar o vetor na ordem direta; e 2 para a ordem inversa.)");
		cod = sc.nextInt();
		if(cod == 0) {
			System.out.println("Fim do programa.");
		}else if(cod == 1) {
			for(i = 0; i < 5; i++) {
				System.out.println(vet[i]);
			}
		} else if(cod == 2) {
			for(i = 4; i >= 0; i--) {
				System.out.println(vet[i]);
			}
		} else {
			System.out.println("Código invalido.");
		}
	}
}