package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet1 [] = new int [10];
		int vet2 [] = new int [5];
		boolean achou = false;
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("Digite o " + (i + 1) + "° número do 1° vetor(dividendo)");
			vet1[i] = sc.nextInt();
		}
		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite o " + (i + 1) + "° número do 2° vetor(divisor)");
			vet2[i] = sc.nextInt();
		}
		for (int i = 0; i <= 9; i++) {
		    for (int j = 0; j <= 4; j++) {
		        if (vet1[i] % vet2[j] == 0) {
		            System.out.println("O número na posição [ " + (i + 1) + " ] É divisível por " + vet2[j] + "(divisor na posição [ " + (j + 1) + " ])");
		            System.out.println("--------------------------------------------");
		            achou = true;
			}
		}
		if (achou == false) {
			System.out.println("Não possui divisores no segundo vetor");
		}
	}
 }
}