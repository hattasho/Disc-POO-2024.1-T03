package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int corredor[] = new int[24];
		int janela[] = new int[24];
		int i, num = 0, op = 0;
		boolean achou;
		String posicao = null;
		
		System.out.println("Este programa simula a compra de poltronas em um onibus de viagem.");
		
		for(i = 0; i < 24; i++) {
			
			janela[i] = 0;
			corredor[i] = 0;
		}
		
		do {
			
			System.out.println("\n||MENU||");
			System.out.println("1. Comprar passagem");
			System.out.println("2. Mostrar mapa de ocupaçao do onibus");
			System.out.println("3. Encerrar");
			System.out.print("Digite a opçao desejada: ");
			op = sc.nextInt();
			
			switch (op) {
			
				case 1:
					
					achou = false;
					for (i = 0; i < 24; i++) {
						
						if (corredor[i] == 0 || janela[i] == 0) {
							
							achou = true;
							break;
						}
						
					}
					
					if (achou == false) {
						
						System.out.println("Onibus lotado.");		
					}
					else {
						
						do {
							
							System.out.print("Digite a posicao desejada:\n'C' para Corredor\n'J' para Janela\nDigite: ");
							posicao = sc.next().toUpperCase();
							
						} while (!posicao.equals("J") && !posicao.equals("C"));
						
					}
					
					do {
						
						System.out.print("Digite o numero do assento desejado: ");
						num = sc.nextInt();
						
					}while (num < 1 || num > 24);
			
					if (posicao.equals("J")) {
					    if (janela[num - 1] == 1) {
					        System.out.println("Poltrona ocupada.");
					    } else {
					        janela[num - 1] = 1;
					        System.out.println("Compra efetivada.");
					        break;
					    }
					} else if (posicao.equals("C")) {
					    if (corredor[num - 1] == 1) {
					        System.out.println("Poltrona ocupada.");
					    } else {
					        corredor[num - 1] = 1;
					        System.out.println("Compra efetivada.");
					        break;
					    }
					}
					break;
					
				case 2:
					
					System.out.println("     JANELA     CORREDOR");

					for (i = 0; i < 24; i++) {
					    System.out.printf((i + 1)+ " - ");

					    if (janela[i] == 0)
					        System.out.printf("Livre");
					    else
					        System.out.printf("Ocupada");

					    System.out.print("      ");

					    System.out.printf((i + 1) + " - ");

					    if (corredor[i] == 0)
					        System.out.println("Livre");
					    else
					        System.out.println("Ocupada");
					}


					break;
					
				case 3:
					
					System.out.println("Encerrando...");
					break;
					
				default:
					
					System.out.println("Invalido.\nEncerrando...");
					break;
			}
		}while (op != 3);
		
		System.out.println("\nFim de programa.");

	}

}