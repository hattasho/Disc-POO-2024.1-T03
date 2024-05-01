package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int conta[] = new int[10];
		double saldo[] = new double[10];
		int i, j, codigo, opcao = 0;
		double valor, soma;
		boolean achou;

		System.out.println("Este programa simula um sistema bancario.\n");
		
		System.out.println("Cadrastando contas...\n");
		
		for (i = 0; i < 10; i++) {
			
			do {
				
			    achou = false;
			    System.out.print("Digite o numero da conta " + (i + 1) + ": ");
			    conta[i] = sc.nextInt();
			    
			    for (j = 0; j < i; j++) {
			    	
			        if (conta[i] == conta[j]) {
			        	
			            System.out.println("Esta conta ja esta cadastrada.");
			            achou = true;
			            break;
			        }
			    }
			    
			} while (achou == true);

			System.out.print("Digite o saldo da conta  " + (i + 1) + ": " );
			saldo[i] = sc.nextDouble();
					
		} 
		
		do {
			
			achou = false;
			
			 System.out.println("\nMenu de Operações:");
	            System.out.println("1. Depósito");
	            System.out.println("2. Saque");
	            System.out.println("3. Consulta de Saldo Total do banco");
	            System.out.println("4. Sair");
	            System.out.print("Escolha a operação desejada: ");
	            opcao = sc.nextInt();
			
	            
	         switch (opcao) {
	         
	         	case 1:
	         		
	         		System.out.print("Digite o codigo da conta: ");
	         		codigo = sc.nextInt();
	         		System.out.print("Digite o valor a ser depositado: ");
	         		valor = sc.nextDouble();
	         		
	         		for (i = 0; i < 10; i++) {
	         			
	         			if (codigo == conta[i]) {
	         				
	         				saldo[i] = saldo[i] + valor;
	         				achou = true;
	         				System.out.println("Deposito efetuado.\n");
	         			}
	         		}
	         			if (achou == false) {
	         				
	         				System.out.println("Conta nao registrada.\n");
	         			}
	         			
	         		
	         		break;
	         	
	         	case 2:
	         		
	         		System.out.print("Digite o codigo da conta: ");
	         		codigo = sc.nextInt();
	         		System.out.print("Digite o valor a ser sacado: ");
	         		valor = sc.nextDouble();
	         		
	         		for (i = 0; i < 10; i++) {
	         		
	         			if (codigo == conta[i]) {
	         			
	         				if (saldo[i] < valor) {
	         				
	         					System.out.println("Saldo insuficiente.\n");
	         				}
	         				else {
	         				
	         					saldo[i] = saldo[i] - valor;
	         					System.out.println("Saque efetuado.\n");
	         				}
	         			
	         				achou = true;
	         			}
	         		}
	         		if (achou == false) {
	         			
	         			System.out.println("Conta nao registrada.\n");
	         		}
	         		break;
	         	
	         	case 3:
	         		
	         		soma = 0;
	         		for (i = 0; i < 10; i++) {
	         			
	         			soma = soma + saldo[i];
	         		}
	         		System.out.println("\nA soma de todos os saldos e: " + soma + "\n");
	         		break;
	         	
	         	case 4:
	         		System.out.println("Saindo...\n");
	         		break;
	         	
	         	default:
	         		System.out.println("Opcao invalida.\nSaindo...\n");
	         		break;
	         	
	         }
	         
		}while (opcao != 4);
		
		System.out.println("Fim de programa.");
	}

}