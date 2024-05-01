package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static int uniao(int a[], int b[], int u[]) {
	    int i, j, k = 0, cont = 0;
	    
	    for (i = 0; i < 10; i++) {
	        cont = 0;
	        while ((cont < k) && (a[i] != u[cont])) {
	            cont = cont + 1;
	        } 
	        if (cont == k) {
	            u[k] = a[i];
	            k = k + 1;
	        }
	    }
	    
	    for (i = 0; i < 10; i++) {
	        cont = 0;
	        while ((cont < k) && (b[i] != u[cont])) {
	            cont = cont + 1;
	        } 
	        if (cont == k) {
	            u[k] = b[i];
	            k = k + 1;
	        }
	    }
	    
	    return k;
	}

	public static void main(String[]args) {
	    Scanner sc = new Scanner(System.in);
	    int vet1[] = new int[10];
	    int vet2[] = new int[10];
	    int vet3[] = new int[20];
	    int cont = 0;
	    int x = 0;
	    System.out.println("Preencha 10 números de dois conjuntos para mostrar a união dos dois:");
	    for (x = 0; x < 10; x++) {
	        System.out.println((x + 1) + "° número INTEIRO POSITIVO do conjunto 1: ");
	        vet1[x] = sc.nextInt();
	    }
	    System.out.println("°------------------------°");
	    for (x = 0; x < 10; x++) {
	        System.out.println((x + 1) + "° número INTEIRO POSITIVO do conjunto 2: ");
	        vet2[x] = sc.nextInt(); 
	    }
	    cont = uniao(vet1, vet2, vet3);
	    x = 0; 
	    System.out.println("Conjunto A união conjunto B é representado pelos números:");
	    while (x < cont) {
	        System.out.println(vet3[x]);
	        x++; 
	    }
	}
}
