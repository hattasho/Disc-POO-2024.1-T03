package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
public static void transformacao(int segundos) {
	int h = 0; int m = 0; int s = 0; int r = 0;
	h = segundos/3600;
	r = (segundos % 3600);
	m = (r/60);
	s = (r % 60);
	System.out.print("O horário é: " + h + "h " + m + "min " + s + "s");
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int segundos = 0;
		System.out.print("Quantos segundo você deseja que seja feito o calculo?");
		segundos = sc.nextInt();
		transformacao(segundos);
	}

}
