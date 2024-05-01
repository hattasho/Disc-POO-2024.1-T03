package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		
		//Inicializacao das variaveis
		int primos[] = new int[10];
		int i, qtde = 0, num = 101, divisores;
		
		System.out.println("Este programa armazena os dez primeiros numeros primos acima de 100 e os mostra.\n");

		//Verificacao dos primos
		do {
			
			//Divisao dos numeros
			divisores = 0;
			for (i = 0; i < num; i++) {
			
				if (num % (i+1) == 0) {
					
					divisores++;
				}
				
			}
				//Verificacao dos divisores
				if (divisores <= 2) {
					
					primos[qtde] = num;
					qtde++;
				}
				
				//Incremento do numero
				num++;
			
		}while (qtde <10);
		
		//Escrita dos numeros
		for (i = 0; i < 10; i++) {
			
			System.out.println("O " + (i+1) + "° numero primo depois de 100 e: " + primos[i]);
		}
		
		System.out.println("\nFim de programa.");
		
	}

}