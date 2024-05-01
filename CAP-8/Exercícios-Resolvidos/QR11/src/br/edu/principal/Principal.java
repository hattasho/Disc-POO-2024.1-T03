package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static int qtInd (String sexo[], String olhos[], String cabelos [], int idade[] ) {
		int qtd = 0;
		for (int i = 0; i <= 4; i++) {
			if ((sexo[i].equals("F")) && (idade[i] >= 18 && idade[i] <= 35) && (olhos[i].equals("A")) && (cabelos[i].equals("L"))) {
				qtd = qtd + 1;
			}
		}
		return qtd;
	}
	public static int maiorI(int idade[]) {
		int maior = 0;
		for (int i = 0; i <= 4; i++) {
			if (i == 1) {
				maior = idade[i];
			} else {
				if (idade [i] > maior) {
					maior = idade[i];
				}
			}
		}
 		return maior;
	}
	public static int mediaI(String olhos[], String cabelos[], int idade[]) {
		int cont = 0;
		int soma = 0, media = 0;
		for (int i = 0; i <= 4; i++) {
			if ((olhos[i].equals("C")) && (cabelos[i].equals("P"))) {
				soma = soma + idade[i];
				cont = cont +1;
			}
		}
		if (cont == 0) {
			media = 0;
		} else {
			media = soma/cont;
		} media = (int) Math.floor(media);
		return media;
	}
	public static void leitura(String sexo[], String olhos [], String cabelos[], int idade[]) {
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i <= 4; i++) {
			do {
				System.out.println("Qual é o seu gênero? OBS: M = masculino e F = feminino");
				sexo[i] = sc.next();
			} while ((sexo[i] == "M") || (sexo[i] == "F"));
			do {
				System.out.println("Qual a cor de seus olhos? OBS: A = azuis e C = castanhos");
				olhos[i] = sc.next();
			} while ((olhos[i] == "A") || (olhos[i] == "C"));
			do {
				System.out.println("Qual a cor do seu cabelo? OBS: L = louro, P = preto e C = castanhos");
				cabelos[i] = sc.next();
			} while ((cabelos[i] == "L") || (cabelos[i] == "P") || (cabelos[i] == "C"));
			System.out.println("Qual a sua idade?");
			idade[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String sexo[] = new String [5];
        String olhos[] = new String [5];
        String cabelos[] = new String [5];
        int idade[] = new int [5];
        int x, i, q, m = 0;
        leitura(sexo, olhos, cabelos, idade);
        m = mediaI(olhos, cabelos, idade);
        System.out.println("A média das idades de pessoas de olhos castanhos e cabelos pretos é: " + m);
        i = maiorI(idade);
        System.out.println(".. A maior idade no geral é: " + i);
        q = qtInd(sexo, olhos, cabelos, idade);
        System.out.println("A quantidade de mulheres loiras de olhos azuis, que têm entre 18 a 35 anos é de: " + q);
	}
}