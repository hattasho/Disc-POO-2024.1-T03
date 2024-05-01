package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 , nota2 , nota3, media, letra= 0;
		
		System.out.println("Escreva a sua primeira nota");
		nota1 = sc.nextDouble();
		System.out.println("Escreva a sua segunda nota");
		nota2 = sc.nextDouble();
		System.out.println("Escreva a sua terceira nota");
		nota3 = sc.nextDouble();
		System.out.println("A letra 'A' é representada pelo 1 e a letra 'P' é representada pelo 2");
		System.out.println("Escreva 1 se quiser fazer a média aritmética ou 2 se quiser a média ponderada");
		letra = sc.nextDouble();
		
		media = calculador(nota1,nota2,nota3,letra);
		
		if (letra == 1) {
			System.out.println("A sua média aritmética é: " + media);
		}
		
		else if (letra == 2) {
			System.out.println("A sua média ponderada é: " + media);
		}
		
	}
	public static double calculador(double n1, double n2,double n3, double  l ) {
		
		Scanner sc = new Scanner(System.in);
		
		double m = 0;
		
		if(l == 1) {
			m = (n1 + n2 + n3)/3;
		}
		
		else if(l == 2) {
			m = (n1*5 + n2*3 + n3*2)/(5+3+2);
		}
		
		return m;
		
	}

}