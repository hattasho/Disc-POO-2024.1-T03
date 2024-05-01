package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa recebe os preços e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez).\r\n"
				+ "Depois, determina e mostra:"
				+ " Um relatório contendo: Quantidade vendida, valor unitário e valor total de cada objeto. Ao final,\r\n"
				+ "deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor;\r\n"
				+ "O valor do objeto mais vendido e sua posição no vetor.");

		int[] qtd = new int[10];
		int[] preco = new int[10];
		
		int i, tot_geral = 0, tot_vend, comissao, maior, ind ;		
		
		// começo for1
		for (i = 1; i < 10; i++) {
			System.out.print("Digite quantidade: ");
			qtd[i] = sc.nextInt();
			System.out.print("Digite o preço R$ ");
			preco[i] = sc.nextInt();
		} //fim for1
		
		// começo for2
		for (i = 1; i < 10; i++) {
			tot_vend = qtd[i] * preco[i];
			System.out.println("A quantia " + qtd[i] + " de objetos no preço de R$" + preco[i] + " obteve " + tot_vend + " vendas");
			tot_geral = tot_geral + tot_vend;
		} //fim for2
		
		comissao = tot_geral * 5 /100;
		System.out.println("O total de vendas foi: " + tot_geral + "! E a comissão para o vendedor será de R$" + comissao + ",00");
		maior = qtd[1];
		ind = 1;
		
		// começo for3
		for (i = 1; i < 10; i++) {
			if (qtd[i] > maior) {
				maior = qtd[i];
				ind = i;
			}
		} //fim for3
		
		System.out.println("O produto mais vendido foi o " + preco[ind] + " com o preço de " + ind);


	}

}