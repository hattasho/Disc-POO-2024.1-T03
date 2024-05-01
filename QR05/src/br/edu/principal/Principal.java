package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse programa calcula o percentual de acrescimo no valor de um produto");
		
		int precoAntigo, precoAtual, acrescimo = 0;
		
		System.out.println("Qual o preço antigo do produto?");
		precoAntigo = sc.nextInt();
		
		System.out.println("Qual o preço novo do produto?");
		precoAtual = sc.nextInt();
		
		acrescimo = reajuste (precoAntigo,precoAtual);	
		System.out.println("O precentual de acrescimo é de: " + acrescimo + "%" );
		
	}
	
	public static int reajuste(int pA, int pN){
		
		int result = 0;
		
		result =(100 *  pN - 100 * pA)/pA;
		return result;
	}

}