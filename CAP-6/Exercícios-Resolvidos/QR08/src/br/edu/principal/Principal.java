package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse programa coloca valores inteiros em 2 vetores e depois junta os valores em um vetor resultado na ordem crescente");
		
		int x[] = new int[5];
		int y[] = new int[5];
		int result[] = new int[10];
		int i, j, z, aux = 0;
		
		for(i= 0; i <= 4 ; i++) {
			System.out.println("Digite um valor para x");
			x[i] = sc.nextInt();
		}
		
		for(i = 0; i <= 4; i++) {
			for(j = 0; j <= 3; j++ ) {
				if(x[j] > x[j+1]) {
					aux = x[j];
					x[j] = x[j+1];
					x[j+1] = aux;
				}
			}
		}
		
		for(i = 0; i <= 4; i++) {
			System.out.println("Digite um valor para Y");
			y[i] = sc.nextInt();			
		}
		
		for(i = 0; i <= 4; i++) {
			for(j = 0; j <= 3; j++ ) {
				if(y[j] > y[j+1]) {
					aux = y[j];
					y[j] = y[j+1];
					y[j+1] = aux;
				}
			}
		}
		
		j = 0;
		
		for(i = 0; i <= 4; i++) {
			result[j] = x[i];
			j = j + 1;
			result[j] = y[i];
			j = j + 1;
		}
		
		for(i = 0; i <= 9; i++) {
			for(j = 0; j <= 8; j++) {
				if(result[j] > result[j+1]) {
					aux = result[j];
					result[j] = result[j+1];
					result[j+1] = aux;
				}
			}
		}
		System.out.println("O vetor x é: ");
		for(i = 0; i <= 4; i++) {
			System.out.print("|" + x[i]);
		}
		System.out.println("|");
		
		System.out.println("O vetor y é: ");
		for(i = 0; i <= 4; i++) {
			System.out.print("|" + y[i]);
		}
		System.out.println("|");
		
		System.out.println("O vetor resultado é: ");
		for(i = 0; i <= 9; i++) {
			System.out.print("|" +result[i]);
			System.out.print("|");
		}
	}
	
}