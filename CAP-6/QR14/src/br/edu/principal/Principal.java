package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nome[] = new String [5];
		int sal[] = new int [5];
		int quant[] = new int [5];
		double novo_sal = 0;
		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite o " + (i + 1) + "° nome");
			nome[i] = sc.next();
			System.out.println("--------------------------------------------");
			System.out.println("Agora o salário do nome citado anteriormente");
			sal[i] = sc.nextInt();
			System.out.println("--------------------------------------------");
			System.out.println("E quantos anos essa pessoa trabalhou: ");
			quant[i] = sc.nextInt();
			System.out.println("--------------------------------------------");
		}
		for (int i = 0; i <= 4; i++) {
			if ((quant[i] <= 5) && (sal[i] >= 800)) {
				System.out.printf("a pessoa %s, Sua posição: %d\n", nome[i] + " não receberá aumento", i + 1);
			}
		}
		for (int i = 0; i <= 4; i++) {
			if ((quant[i] > 5) || (sal[i] < 800)) {
				if ((quant[i] > 5) && (sal[i] < 800)) {
					novo_sal = sal[i] + sal[i] * 35 / 100;
				} else {
					if (quant[i] > 5) {
						novo_sal = sal[i] + sal[i] * 25 / 100;
					} else {
						novo_sal = sal[i] + sal[i] * 15 / 100;
					}
				}
				System.out.printf("aumento para o trabalhador(a) %s, Seu novo salário é de: %s\n", nome[i], novo_sal);
			}
		}
	}
}