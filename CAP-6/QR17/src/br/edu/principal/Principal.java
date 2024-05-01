package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		int i, soma, qtde;
		String achou;
		
		for (i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			num[i] = sc.nextInt();
		}
		soma = 0;
		achou = "Falso";
		for (i = 0; i < 5; i++) {
			if(num[i] % 2 == 0) {
				achou = "verdadeiro";
				System.out.println(num[i]+";"+i);
				soma = soma + num[i];
			}
		}
		if (achou == "falso") {
			System.out.println("Número par foi digitado.");
		} else {
			System.out.println("Soma dos pares: "+soma);
			qtde = 0;
			achou = "falso";
			for (i = 0; i < 5; i++) {
				if(num[i] % 2 != 0) {
					System.out.println(num[i]+";"+i);
					qtde++;
					achou = "verdadeiro";
				}
			}
			if(achou == "falso") {
				System.out.print("Nenhum número ímpar digitado.");
			} else {
				System.out.print("quantidade de números ímpares: "+qtde);
			}
		}
	}

}