package br.edu.principal;

import java.util.Scanner;

class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaI , minI , horaF , minF, minutos = 0;
		
		System.out.println("Esse programa cálcula a duração de um jogo em minutos");
		
		System.out.println("Digite o horário de início do jogo(Somente as horas)");
		horaI = sc.nextInt();
		System.out.println("Digite o horário de início do jogo(Somente os minutos)");
		minI = sc.nextInt();
		System.out.println("Digite o horário de fim do jogo(Somente as horas)");
		horaF = sc.nextInt();
		System.out.println("Digite o horário de fim do jogo(Somente os minutos)");
		minF = sc.nextInt();
		
		minutos = calculo(horaI,minI,horaF,minF);
		
		System.out.println("A duração do jogo foi de " + minutos + " minutos");
	}
	
	public static int calculo(int hI, int mI, int hF, int mF) {
		int totH, totM, total = 0;
		if(mF < mI) {
			mF = mF + 60;
			hF = hF - 1;
		}
		
		if(hF < hI) {
			hF = hF + 24;
		}
		
		totM = mF - mI;
		totH = hF - hI;
		total = totH * 60 + totM;
		
		return total;
	}

}