package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int repetidos[] = new int[10];
		int vezes[] = new int[10];
		int i, j, qtde, contR = 0;
		boolean repetido;
		//Nao fiz uso da variavel cont, como no algoritmo, pois ela provou-se inutil. Alem disso, fez-se necessario um metodo para verificar se o elemento ja havia sido contado como repetido.
		
		System.out.println("Este programa recebe dez valores e conta quantas vezes cada elemento aparece na lista.");
		
		for (i = 0; i < 10; i++) {
			
			System.out.print("Digite o numero " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < 10; i++) {
		    qtde = 1;
		    
		    repetido = false;
		    for (j = 0; j < contR; j++) {
		        if (a[i] == repetidos[j]) {
		            repetido = true;
		            break;
		        }
		    }
		    
		    if (repetido == false) {
		        for (j = i + 1; j < 10; j++) {
		            if (a[i] == a[j]) {
		                qtde++;
		            }
		        }
		        
		        repetidos[contR] = a[i];
		        vezes[contR] = qtde;
		        contR++;
		    }
		}

		
		for (i = 0; i < contR ; i++){
			
			System.out.println("O numero " + repetidos[i] + " apareceu " + vezes[i] + " vezes.");
		}
		
		System.out.println("\nFim de programa.");
		
	}

}