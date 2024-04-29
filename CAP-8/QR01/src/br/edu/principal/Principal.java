package br.edu.principal;

import java.util.Scanner;

public class Principal {

public static int verifica(int num){
		int res = 0;
		if (num >= 0) {
			res = 1;
		} else {
			res = 0;
		} return res;
	}
	
public static void main(String[] args) {
	
		int x = 0; int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número qualquer, sendo ele positivo ou negativo.");
		num = sc.nextInt();
		x = verifica(num);
		if (x == 1) {
			System.out.print("O número é positivo.");
		} else {
			System.out.print("O número é negativo.");
		}
		
	}

}
